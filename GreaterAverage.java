import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner r = new Scanner(System.in);
		int t = r.nextInt();
		for(int i=0;i<t;i++)
		{
		    double x=r.nextInt();
		    double y=r.nextInt();
		    double z=r.nextInt();
		    double a=(x+y)/2;
		    if(a>z)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("no");
		    }
		}

	}
}
