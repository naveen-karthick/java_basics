package io.ztech.intern;
import java.util.*;
public class assignment1_third {
	
	static public int sum(int a,int b,int c)
	{
		int sum=0;
		sum+=a;
		if(a!=b)
			sum+=b;
		if(a!=c&&b!=c)
			sum+=c;
		return sum;
		
	}

	public static void main(String[] args)
	{
		Scanner nav=new Scanner(System.in);

		int value1=nav.nextInt();
		int value2=nav.nextInt();
		int value3=nav.nextInt();
		System.out.println(sum(value1,value2,value3));
	}
}
