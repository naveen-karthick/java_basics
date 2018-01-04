package io.ztech.intern;
import java.util.*;
public class assignment2_1 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		boolean found=false;
		String key=null;
		key=input.next();
		String[] array=new String[length];
	for(int i=0;i<length;i++)
	{
	
		array[i]=input.next();
		if(array[i].equals(key))
		{
			found=true;
			break;
		}
	}
	System.out.println(found);
	}
	
}
