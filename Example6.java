import java.util.Scanner;
class Example6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
	    int a=sc.nextInt();
		System.out.println("enter the second number:");
        int b=sc.nextInt();
		System.out.println("before the swapping  a="+a+"and b="+b);
		
		int temp=a;
		a=b;
        b=temp;
		
        System.out.println("after the swapping  a="+a+"and b="+b);
	  

	}
}
