import java.util.Scanner;
class Example18
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number :");
		int n=sc.nextInt();
        for(int n=2;n<=100;n++);
		{
		boolean salma=true;
		for(int i=2;i<=n/2;i++)
		{
		 if(n%i==0)
			{
			 salma=false;
		     break;
			}		}
		if(salma==true)
			System.out.println(n+" ");
		}
	}
}
	

