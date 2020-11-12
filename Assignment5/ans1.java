import java.util.*;
import java.lang.*;
public class ans1 extends Thread
{
	public void run()
    {
        for(int j=1;j<=100;j++)
        {
            System.out.println(j);
            try
            {
                Thread.sleep(1000);
                if(j%10==0)
                {
                	System.out.println("String printed after every ten number counting.");
                }
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        ans1 counting = new ans1();
        counting.start();
    }
}