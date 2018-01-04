package io.ztech.string;
import java.util.*;
import java.util.Date;
public class assignment2_1 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int length;
		boolean output=false;
		String key=null;
		length=input.nextInt();
		key=input.nextLine();
		System.out.println(key+"hello");
		String[] array=new String[length];
		for(int i=0;i<length;i++)
		{
			array[i]=input.nextLine();
			if(array[i].equals(key))
			{
				output=true;
			}
			break;
		}
		
		System.out.println(output);
		
	}
}
