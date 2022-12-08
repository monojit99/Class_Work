import java.util.Scanner; //import scanner class
public class Greater
{
public static void main(String args[])
{
int num1,num2,num3; //define variables
System.out.println("enter first number:"); //take first input
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
System.out.println("enter second number:"); //take second number
num2=sc.nextInt();
System.out.println("enter third number:"); //take third number
num3=sc.nextInt(); 
if(num1>num2 && num1>num3) //check num1 is greater or not
System.out.println("num1 is greater");
else if(num2>num1 && num2>num3) //check num2 is greater or not
System.out.println("num2 is greater");
else
System.out.println("num3 is greater"); //else part if num3 is greater
}
}

