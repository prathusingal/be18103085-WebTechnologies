import java.util.*;
import java.lang.*;
public class ans2{
	public static void main(String[] args) {
		int startingVar=-1;
		byte byteConversion=(byte)startingVar;             		//-1
		char charConversion=(char)byteConversion;			//'\uFFFF'
		int intConversion=(int)charConversion;				//65535
		System.out.println("After byte conversion:   "+byteConversion);
		System.out.println("After char conversion:   "+charConversion);
		System.out.println("After again int conversion:   "+intConversion);		
	}
}