import java.util.Scanner;
class Example10 
{
	public static void main(String[] args) 
	{
		
     int n, sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of elements:");
     n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter all the elements :");
     for(int i=0;i<n;i++)
     {
     a[i]=sc.nextInt();
     sum=sum+a[i];
     }
    System.out.println("Sum:"+sum);
    float average=sum/n;
    System.out.println("Average:"+average);
	int grade=sum;
	System.out.println("grade:"+grade);
	if(n>=70)
	System.out.println("average is greater than equals to 70 then 'A' grade"); 
	else if(n>=50)
    System out.println("average is greater than equals to 50 then 'B' grade");
	else if (n>=35)
	System.out,println("average is greater then equals to 35 then 'C' grade");
	else if (n<=35)
	System.out.println("average is less than 35 then failed");
	else 
		System.out.println("failed");
	
	}
}		
