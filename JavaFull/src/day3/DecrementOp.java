package day3;

public class DecrementOp 
{

	public static void main(String[] args) 
	{
		int a=100;
		int b;
		b=a--;	//post decrement 
		System.out.println(b);
		System.out.println(a);

		b=--a;		//pre decrement
		System.out.println(b);
		
		
		
		b=a-1;
		System.out.println(b);
	}
	

}
