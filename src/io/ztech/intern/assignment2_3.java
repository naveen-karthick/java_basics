package io.ztech.intern;
import java.text.SimpleDateFormat;
import java.util.*;
public class assignment2_3 {
 public static void main(String[] args)
 {
	 Scanner input=new Scanner(System.in);
	 
	 Date date1=null;
	 Date date2=null;
	 SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yyyy");
	 System.out.println("Enter the two dates to be compared in the format "
	 		+ "dd-MMM-yyyy (E.g)18-JAN-2018");
	 String inputdate1=input.next();
	 String inputdate2=input.next();
	 try
	 {
	 date1=dateformat.parse(inputdate1);
	 date2=dateformat.parse(inputdate2);
	 }
	 catch(Exception e)
	 {
		 System.out.println("hello");
	 }
	 System.out.println(date1+"\n"+date2);
	 
	 long diff=date1.getTime()-date2.getTime()<0?date2.getTime()-date1.getTime():
		 date1.getTime()-date2.getTime();
	 System.out.println(diff);
	 Calendar cal=Calendar.getInstance();
	 cal.setTimeInMillis(diff);
	 int year=cal.get(Calendar.YEAR)-1970;
	 int month=cal.get(Calendar.MONTH);
	 int day=cal.get(Calendar.DATE)-1;
	 System.out.println("The Difference between the two dates in year is "
			 +year+"\nin month is "+month+"\nin days is "+day);
	 
 }
}
