package io.ztech.intern;

import java.util.*;
public class assignment1_four {
	static public int recursion(int[] a,int times,int position)
	{
		if(position<0)
			return 0;
		else
		{
			
		if(a[position]==11)
			times=times+1+recursion(a,times,--position);
		else
			times=times+recursion(a,times,--position);
		}
		recursion(a,times,--position);
		
		return times;
	
	}
public static void main(String[] args)
{
	Scanner nav=new Scanner(System.in);
	int length=nav.nextInt();
	int[] array=new int[length];
	for(int i=0;i<length;i++)
	{
		array[i]=nav.nextInt();
	}
	
	System.out.println(recursion(array,0,length-1));
}
}
