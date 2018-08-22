/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  int rem=0,pro=1;
	  while(num!=0)
		{
		  rem=num%10;
		  pro=pro*rem;
		  num=num/10;
		}
		System.out.println(pro);// your code goes here
	}
}
