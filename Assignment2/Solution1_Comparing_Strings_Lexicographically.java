import java.io.*;
import java.util.*;

public class Solution1_Comparing_Strings_Lexicographically {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in); 
    System.out.print("Enter a string 1 : ");  
    String str1= sc.nextLine(); 


    System.out.print("Enter a string 2 : ");  
    String str2= sc.nextLine();   

    
    System.out.println("Comparing two strings lexicographically without using library function : ");
    
    int temp= compareString(str1,str2);
    if (temp==0)
    {
      System.out.print("\n "+str1+" is same as "+str2+" ");
    }
    else if (temp<0)
    {
      System.out.print("\n "+str1+" comes before "+str2+" ");
    }
    else
    {
      System.out.print("\n "+str1+" comes after "+str2+" "); 
    }

  }
  
  public static int compareString(String str, String argumentString) {
    
    int lim= Math.min(str.length(), argumentString.length());
    
    int k=0;
    while(k<lim) {
      if(str.charAt(k)!= argumentString.charAt(k)) {
        return (int) str.charAt(k)- argumentString.charAt(k);
      }
      k++;
    }
    return str.length() - argumentString.length();
  }
}