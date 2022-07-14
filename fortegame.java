package maheshsantask;
import java.util.Scanner;
public class fortegame {

	public void calculation()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the answer you want");
	        int answer=sc.nextInt();
	     System.out.println("Given numberList given for you");
	     int noofvalues=sc.nextInt();
	     int arr[]=new int[noofvalues];
	     for(int i=0;i<noofvalues;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     
		    char operator;
		    int result1=0;
		    int result2=0;
		    int result3=0;
		   
		    System.out.println("Enter first number");
		    int number1 = sc.nextInt();

		    System.out.println("Enter second number");
		    int number2 = sc.nextInt();
		    
		    System.out.println("Operator: +, -, *, /");
		    operator = sc.next().charAt(0);
		    

		    switch (operator) {

		        
		      case '+':
		        result1 = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result1);
		        break;

		      
		      case '-':
		        result1 = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result1);
		        break;

		      
		      case '*':
		        result1 = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result1);
		        break;

		      
		      case '/':
		        result1 = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result1);
		        break;

		      default:
		        System.out.println("Invalid Input!");
		        break;
		    }
		    
		    System.out.println("Enter third number");
		    int number3 = sc.nextInt();
		    
		    System.out.println("Operator: +, -, *, /");
		    operator = sc.next().charAt(0);
		    

		    switch (operator) {

		        
		      case '+':
		        result2 = result1 + number3;
		        System.out.println(result1 + " + " + number3 + " = " + result2);
		        break;

		      
		      case '-':
		        result2 = result1 - number3;
		        System.out.println(result1 + " - " + number3 + " = " + result2);
		        break;

		      
		      case '*':
		        result2 = result1 * number3;
		        System.out.println(result1 + " * " + number3 + " = " + result2);
		        break;

		      
		      case '/':
		        result2 = result1 / number3;
		        System.out.println(result1 + " / " + number3 + " = " + result2);
		        break;

		      default:
		        System.out.println("Invalid Input!");
		        break;
		    }
		    
		    System.out.println("Enter forth number");
		    int number4 = sc.nextInt();
		    
		    System.out.println("Operator: +, -, *, /");
		    operator = sc.next().charAt(0);
		    
		    switch (operator) {

	        
		      case '+':
		        result3 = result2 + number4;
		        System.out.println(result2+ " + " + number4 + " = " + result3);
		        break;

		      
		      case '-':
		        result3 = result2 - number4;
		        System.out.println(result2 + " - " + number4 + " = " + result3);
		        break;

		      
		      case '*':
		        result3 = result2 * number4;
		        System.out.println(result2 + " * " + number4 + " = " + result3);
		        break;

		      
		      case '/':
		        result3 = result2 / number4;
		        System.out.println(result2 + " / " + number4 + " = " + result3);
		        break;

		      default:
		        System.out.println("Invalid Input!");
		        break;
		    }
		    
		    
		    if(answer==result3)
		    {
		    	System.out.println("YOU GOT IT");
		    }
		    else
		    {
		    	System.out.println("TRY SOME OTHER WAY");
		    }
}
		   
		
	public static void main(String[] args) {
		
		fortegame fb=new fortegame();
		fb.calculation();
		
		
		
	}
	
	
}
