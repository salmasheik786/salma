import java.util.Scanner;
class Example8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
	    System.out.println("enter the  first number:");
     	int a=sc.nextInt();	    
		System.out.println("enter the second number");
		int b=sc.nextInt();
	    System.out.println("enter the third number");
		int c=sc.nextInt();
	    int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("greatest of three numbers is="+max);
	}
}