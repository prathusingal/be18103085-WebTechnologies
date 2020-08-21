import java.io.*;
import java.util.*;

class verify{
    public boolean anagram_or_not(String string1,String string2){
        int[] vector;
        vector=new int[256];
        for(int k=0;k<256;k++){
            vector[k]=0;
        }

        for(int k=0;k<string1.length();k++){
            vector[string1.charAt(k)]++;
        }
        for(int k=0;k<string2.length();k++){
            vector[string2.charAt(k)]--;
        }

        for(int k=0;k<256;k++){
            if(vector[k]!=0)
                return false;
        }
        return true;
    }
    public int Compute(String string1,String string2){
        int k=string2.length();
        int total=0;
        String s=string1.substring(0,k);
        if(anagram_or_not(s,string2)){
            total+=1;
        }
        char ch[]=s.toCharArray();
        for(int i=k;i<string1.length();i++){
            ch[0]=string1.charAt(i);
            s=new String(ch);
            if(anagram_or_not(s,string2)){
                total+=1;
            }
        }
        return total;
    }
}

public class Answer1{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	System.out.print("Enter the parent string: ");
        String string1=s.next();
	System.out.print("Enter substring to be found in the parent string : ");
        String string2=s.next();
        verify verify=new verify();
	System.out.print("Number of time the substring occurs is : ");
        System.out.println(verify.Compute(string1,string2));

    }
}