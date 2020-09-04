import java.util.*;
import java.io.*;
public class Solution3_Sort_Strings{
	public static int Minimum(int a,int b)
	{
		return (a>b)?b:a;
	}
	public static int Compare_Strings(String String1,String String2) {
		int i;
		for(i=0;i<Minimum(String1.length(),String2.length());i++)
		{
			if(String1.charAt(i)==String2.charAt(i))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		if(i==Minimum(String1.length(),String2.length()))
		{
			if(String1.length()==String2.length())
			{
				return 0;
			}
			else if(String1.length()>String2.length())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			if(String1.charAt(i)>String2.charAt(i))
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Number of strings you want to enter : ");
			int n=sc.nextInt();
			sc.nextLine();
			String[] Vector=new String[n];
			for(int i=0;i<n;i++)
			{
				System.out.printf("Enter %dth string : ",i);
				Vector[i]=sc.nextLine();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int res=Compare_Strings(Vector[i],Vector[j]);
					if(res==1)
					{
						String swap=Vector[i];
						Vector[i]=Vector[j];
						Vector[j]=swap;
					}
				}
			}
			System.out.println("Strings in sorted order : ");
			for(int i=0;i<n;i++)
			{
				System.out.print("\""+Vector[i]+"\" ");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please correct your input");
		}
	}
}