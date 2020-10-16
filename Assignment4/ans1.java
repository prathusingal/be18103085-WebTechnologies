import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class ans1{
	public static void main(String[] args) {
		int x; 
		Scanner in = new Scanner(System.in); 
		x = in.nextInt();
		in.nextLine(); 
		String[] crops = new String[x]; 
		for (int i=0;i<x;i++)
		{ 
			crops[i]=in.nextLine().trim();
		}
		System.out.print(replant(crops));
	}
	public static int replant(String[] crops)
	{
		int num = crops.length;
        String sporc[] = new String[num];
        for(int i = 0;i<num;++i) {
            StringBuilder y = new StringBuilder(crops[i]);
            sporc[i] =  y.reverse().toString();
        }
        int a = replantUtil(crops);
        int b = replantUtil(sporc);
        return (a>b)?b:a;   
	}
	public static int replantUtil(String[] crops) {
        int rows = crops.length;
        int cols = crops[0].length();
        int DynamicTable[][] = new int[rows][cols];
        for(int i = 0;i<rows;++i){
            for(int j=0;j<cols;++j)
                DynamicTable[i][j]=0;
        }
        for(int i= 1;i<rows;++i) {
            DynamicTable[i][0] = DynamicTable[i-1][0];
            if(crops[i].charAt(0)==crops[i-1].charAt(0)&&crops[i].charAt(0)!='$') {
                DynamicTable[i][0]++;
                String crop = crops[i];
                crop = '$'+crop.substring(1);
                crops[i] = crop;
            }
        }
        for(int j = 1;j<cols;++j) {
            DynamicTable[0][j] = DynamicTable[0][j-1];
            if(crops[0].charAt(j)==crops[0].charAt(j-1)&&crops[0].charAt(j)!='$') {
                DynamicTable[0][j]++;
                String crop = crops[0];
                crop = crop.substring(0,j)+'$'+crop.substring(j+1);
                crops[0] = crop;
            }
        }
        for(int i = 1;i<rows;++i) {
            for(int j = 1;j<cols;++j) {
                DynamicTable[i][j] = DynamicTable[i-1][j]+DynamicTable[i][j-1]-DynamicTable[i-1][j-1];
                if((crops[i].charAt(j)==crops[i].charAt(j-1))||(crops[i].charAt(j)==crops[i-1].charAt(j))){
                    DynamicTable[i][j]++;    
                    String crop = crops[i];
                    crop = crop.substring(0,j)+'$'+crop.substring(j+1);
                    crops[i] = crop;
                }
            }
        }

        return DynamicTable[rows-1][cols-1];
    }
}