package io.ztech.intern;
import java.text.SimpleDateFormat;
import java.util.*;
public class Date_of_birth {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int year,month,day;
		System.out.println("Enter the year month and the day corresponding to their "
				+ "number");
		String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		year=input.nextInt();
		month=input.nextInt();
		day=input.nextInt();
		Date d=new Date(year-1900,month-1,day);
		SimpleDateFormat format=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(format.format(d));
	}
}
