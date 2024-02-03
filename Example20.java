class Example20
{
	public static void main(String[] args) 
	{
		int[] arr= {3,6,9,4,1,1,3,9,2};
		for (int i=0;i<arr.length ;i++)
		{
			int cnt=0;
			for (int j=0;j<arr.length ;j++)
			{
				if (arr[i]==arr[j])
				{
					cnt++;
				}
			}
			if (cnt==1)
			{
		        System.out.println(arr[i]+" ");
			}
		}
	}
}
			
		
	
      
