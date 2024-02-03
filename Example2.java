import java.util.Scanner;
class Example2
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base:");
     int b=sc.nextInt();
     System.out.println("Enter the height:");  
       int h=sc.nextInt();
              float area=(b*h)/2;
       System.out.println("area of a triangle is="+area);

   }
}




