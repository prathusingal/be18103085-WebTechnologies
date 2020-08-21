import java.io.*;
import java.util.*;

public class Answer2{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter paragraph to be replaced : ");
        String string1=s.nextLine();
        Vector<String> vector = new Vector<String>();
        System.out.print("Enter the Number of words to be searched : ");
        int size=s.nextInt();
        String xyz;
        char SpecialCharacters[]={',','.','?','!'};
        System.out.print("please enter the words you want to replace in the paragraph : ");
        while(size>0){
            xyz=s.next();
            vector.add(xyz);
            size-=1;
        }
        Iterator it= vector.iterator();
        while(it.hasNext()){
            xyz= (String) it.next();
            String cemp="";
            for(int i=0;i<xyz.length()-1;i++){
                cemp+="*";
            }
            string1=string1.replaceAll("\\b"+xyz+"\\b",xyz.charAt(0)+cemp);
            for(char i:SpecialCharacters){
                string1=string1.replaceAll("\\b"+xyz+i+"\\b",xyz.charAt(0)+cemp+i);
            }

        }
        System.out.println("The modified paragraph is : ");
        System.out.println(string1);

    }
}
