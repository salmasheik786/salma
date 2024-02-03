class Example21
{
	public static void main(String[] args) 
	{
		int[] arr= {3,4,7,9,10,21,33,37,11,6
		for (int n:arr)
		{
			boolean salma=true;
			for (int i=2;i<=n/2 ; i++ )
			{
				if (n%i==0)
				{
					salma=false; break;
				}
			}
				if (salma==true)
				{
					System.out.println(n+" ");
				}
			}
		}
		
	
      
