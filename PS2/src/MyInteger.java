import java.io.InputStream;
import java.util.Scanner;


public class MyInteger {
    private int value;
    
    
    // The Constructor
    public MyInteger(int m) 
    {
    	
    	this.value = m;
    	//System.out.println("Enter an integer: ");
       	
    }
    
    // The get method
    public int get(int a)
    {
    	int z = a +5;
    	return z;
    	
    }
    // To check if the value is even
	public boolean isEven()
    {
     return(this.value % 2 == 0);
    }
//To check if the value is odd
    public boolean isOdd()
    {
       return(this.value % 2 != 0);
    }
 // To check if the number is a prime number
    public boolean isPrime()
    {
    	int i,temp;
    	boolean flag= true;
    	for(i=2;i<=value/2;i++)
		{
			temp=value%i;
			if(temp==0)
			{
				flag=false;
				break;
			
			}
				
		}
    	return flag;
    	

    }
    
    public static boolean isEven(int a)
    {
    	return (a % 2 == 0);
    	
    }
    
    public static boolean isOdd(int a)
    {
    	return (a % 2 != 0);
    	
    }
    
    public static boolean isPrime(int a)
    {
    	int i,temp;
    	boolean flag= true;
    	for(i=2;i<=a/2;i++)
		{
			temp=a%i;
			if(temp==0)
			{
				flag=false;
				break;
			
			}
				
		}
    	return flag;
    	
    	
    }
    
    public static boolean isEven(MyInteger MyInt)
    {
    	
    	return(MyInt.value % 2 == 0);
    }
    
    public static boolean isOdd(MyInteger MyInt)
    {
    	return (MyInt.value % 2 != 0);
    	
    }
    
    public static boolean isPrime(MyInteger MyInt)
    {
    	int i,temp;
    	boolean flag= true;
    	for(i=2;i<=MyInt.value/2;i++)
		{
			temp=MyInt.value%i;
			if(temp==0)
			{
				flag=false;
				break;
			
			}
				
		}
    	return flag;
    	
    	
    }
    
    public static boolean equals(int a)
    {
    	int b= 10;
    	if(a==b)
    		return true;
    	else
    		return false;
    	
    }
    
    public static boolean equals(MyInteger MyInt)
    {
    	int b= 10;
    	if(MyInt.value==b)
    		return true;
    	else
    		return false;
    	
    }
    
    public static int parseInt(char[] ch )
    {
    	int number = Integer.parseInt(new String(ch));
    	   
    	return number;
    	
    }
    
    public static void parseInt(String s )
    {
    	int[] array = new int[s.length()];

    	for (int i = 0; i < s.length(); i++) {
    		array[i] = Character.digit(s.charAt(i), 10);
    	}
    	
    	
    }
    
    public static void main(String args[])
    {
    	
    	char[] ch = {'0','1','2'};
    	String s = "1234";
    	
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int f = in.nextInt();
    	
    	MyInteger a=new MyInteger(f);
    	int t = a.parseInt(ch);
    	a.parseInt(s); 
    	boolean b=a.isEven();
    	boolean c= a.isOdd();
    	boolean g= a.isPrime();
    	boolean d=a.isEven(f);
    	boolean e=a.isOdd(f);
    	boolean j=a.isPrime(f);
    	boolean h = a.equals(f);

    	System.out.println(t);
    	
    	System.out.println("The number is even:" +b);
    	System.out.println("The number is odd:" +c);
    	System.out.println("The number is prime:" +g);
    	System.out.println("The number is equal to 10:" +h);
    	System.out.println("The string integers are:" +t);

    	
    }
    
}
