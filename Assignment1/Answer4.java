import java.io.*;
import java.util.*;

class Compute{
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
}

public class Answer4{

    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
	System.out.print("Kindly enter the first string to check anagram with : ");
        String string1=temp.next();
	System.out.print("Kindly enter the second string to check anagram with : ");
        String string2=temp.next();
        Compute Compute=new Compute();
	if(Compute.anagram_or_not(string1,string2)){
		System.out.print("the two strings are anagram of each other.");
	}
	else System.out.print("the two strings are not anagrams of each other.");

    }
}
