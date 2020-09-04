import java.io.*;
import java.util.*;


class Solution4_Largest_Integer{
    public static void main(String args[]){
        
        System.out.print("Largest number for which square is equal to sum is : ");
 
        long i=1,temp=1;
        for (;i<2147483647;i++)
        {
            if (i*i==(i*(i+1))/2)
                temp=i;
        }
        System.out.print(temp + " ");
    }

}