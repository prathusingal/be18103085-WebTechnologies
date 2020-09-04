import java.io.*;
import java.util.*;


class Solution6_Hailstone_Sequence{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter number to print its Hailstone Sequence : ");
        String str1= sc.nextLine();
        try 
        { 
            // checking valid integer using parseInt() method 
            int x=Integer.parseInt(str1); 
            hailstonePrinter(x);
        }  
        catch (NumberFormatException e)  
        { 
            System.out.println(str1 + " is not a valid input"); 
        } 



    }
    public static void hailstonePrinter(int n){
        if(n <= 0)
            System.out.println("Invalid Input!");
        else if(n == 1)
        {
            System.out.print(n);
            return;
        }
        else if(n % 2 != 0){
            int up = n * 3 + 1;
            System.out.print(n + " ");
            hailstonePrinter(up);
        }
        else{
            int up = n / 2;
            System.out.print(n + " ");
            hailstonePrinter(up);
        }
    }
}