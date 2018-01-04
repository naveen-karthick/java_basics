package io.ztech.intern;
import java.util.*;
public class assignment2_2 {
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
		if(array[i].equalsIgnoreCase(key)||array[i].contains(key)||key.contains(array[i]))
		{
			found=true;
			break;
		}
	}
	System.out.println(found);
	}
}
