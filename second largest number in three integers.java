import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner r =new Scanner(System.in);
		int n = r.nextInt();
		for(int i=0;i<n;i++)
		{
		 int x = r.nextInt(); int y= r.nextInt(); int z= r.nextInt();
		 
		 if(x<y&&x>z||x>y&&x<z)
		
		 {
		     System.out.println(x);
           
		 }
		  else if(y<x&&y>z||y>x&&y<z)
		{
		    System.out.println(y);
		}
		else{
		    System.out.println(z);
		}
		

	}
}
}
