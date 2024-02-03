import java.util.Scanner;
class Example3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the width:");
     int w=sc.nextInt();
     System.out.println("Enter the height:");  
       int h=sc.nextInt();
              float area=w*h;
       System.out.println("area of a rectangle is="+area);

   }
}
