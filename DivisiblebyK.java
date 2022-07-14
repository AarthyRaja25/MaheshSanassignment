package maheshsantask;

public class DivisiblebyK {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,6};
	int k=5;
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
		 int sum=arr[i]+arr[j];
			if(sum%k==0)
			{
			System.out.println("["+arr[i] +" ,"+arr[j]+"]");
				
				
			}
			
			
		}
	}
	
	
	
	
	
	
}
}
