package maheshsantask;
//prime number in first 10 fibbonocci number
public class primeinfibbonocci {
public static void main(String[] args) {
	
	int first=0;
	int n=10;
	int second =1;
	int next=0;
	for(int i=1;i<=n;i++)
	{
		
		next=first+ second;
		if(isprime(next))
		{
			System.out.println(next);
		}
		first=second;
		second=next;
		
	}
	
}
 public static boolean isprime(int next)
{
	 int count=0;
	boolean flag=false;
	 if(next<1)
	 {
		 return flag;
	 }
	 else
	 {
		 for(int i=1;i<=next;i++)
		 {
			 if(next%i==0)
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			 flag=true;
		 }
	 }
	 
	 
	 
	 return flag; 
}
}
