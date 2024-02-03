import java.util.Scanner;
class Example14
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number :");
		int n=sc.nextInt();

		int rem,rev=0;
         char ch = sc.charAt(0);
		while(n>0)
		{
			 rem=n%10;
			 
	     switch(ch==rev)
	     {
	     case 1:System.out.print("three");break;
		 case 2:System.out.print("two");break;
	     case 3:System.out.print("one");break;
      default :System.out.print("invalid option");
	     }
		 n=n/10;
      System.out.println("rev");
		}
    }
}