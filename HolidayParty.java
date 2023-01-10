package basicprograms;
//Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 
//So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.
//Count the number of Sunday jack will get within n number of days.

import java.util.Scanner;

public class HolidayParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			while(true) {
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter a Day:"); //take the day string
	        String str=sc.next();
	        System.out.println("Enter no. of days:"); //take no. of days
	        int n=sc.nextInt();
	        String arr[]={"mon","tue,","wed","thu","fri","sat","sun"}; //array of days
	        int i=0;
	        for(i=0;i<arr.length;i++) //check length f the array
	             if(arr[i].equals(str)) //check if string is equal
	                 break;
	        int res=1; 
	        int rem=6-i; //check rem
	        n=n-rem;    
	        if(n>0)
	           res+=n/7;
	        System.out.println("Given day occur within given days:"); 
	        System.out.println(res);// print the how many days occur in days
			}
	}
}
