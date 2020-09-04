import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution2_Counting_Sort {


    public static void sort(int[] Array) {
        int ArrayayLength = Array.length;
        if (ArrayayLength == 0)
            return;

        int High = Array[0], Low = Array[0];
        for (int i = 1; i < ArrayayLength; i++) {
            if (Array[i] > High)
                High = Array[i];
            if (Array[i] < Low)
                Low = Array[i];
        }
        int RangeOfInput = High - Low + 1;

        int[] count = new int[RangeOfInput];

        for (int i = 0; i < ArrayayLength; i++)
            count[Array[i] - Low]++;

        for (int i = 1; i < RangeOfInput; i++)
            count[i] += count[i - 1];

        int j = 0;
        for (int i = 0; i < RangeOfInput; i++)
            while (j < count[i])
                Array[j++] = i + Low;
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in Array:");

        String str1= sc.nextLine();
        try 
        { 
            // checking valid integer using parseInt() method 
            n=Integer.parseInt(str1); 
        }  
        catch (NumberFormatException e)  
        { 
            System.out.println(str1 + " is not a valid input");
            return;
        }
        int ArrayToBeSorted[] = new int[n];


        System.out.println("Enter all the elements in the Range of 0 to 20 :");
        for(int i = 0; i < n; i++)
        {
            str1= sc.next();
            try 
            { 
                // checking valid integer using parseInt() method 
                int x=Integer.parseInt(str1); 
                ArrayToBeSorted[i] = x;
            }  
            catch (NumberFormatException e)  
            { 
                System.out.println(str1 + " is not a valid input"); 
                return;
            }
        }

        System.out.println("Elements before applying Counting Sort are : " + Arrays.toString(ArrayToBeSorted));

        sort(ArrayToBeSorted);

        System.out.println("Elements after applying Counting Sort are  : " + Arrays.toString(ArrayToBeSorted));

    }

}