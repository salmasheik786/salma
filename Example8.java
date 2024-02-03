import java.util.Scanner;
class Example8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
	    System.out.println("enter the number :");
     	int n=sc.nextInt();
	    if (n>=0) 
		System.out.println("it is a positive number");
	
        else
	    { 
		System.out.println("it is not a positive number");
	    }
	}
}
	