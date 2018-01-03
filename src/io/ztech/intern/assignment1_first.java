package io.ztech.intern;
import java.util.*;
public class assignment1_first {
	
	
	static public int sum(String nav1)
	{
		int sum=0;
		
		
		for(int i=0;i<nav1.length();i++)
		{
		if(nav1.charAt(i)>48&&nav1.charAt(i)<57)
		{ 
		sum+=Integer.parseInt(Character.toString((nav1.charAt(i))));
		}
		}
		return sum;
	}
	
	
public static void main(String[] args)
{
	
	Scanner nav=new Scanner(System.in);
	String count=nav.next();
	System.out.println(sum(count));
	
	
}
}