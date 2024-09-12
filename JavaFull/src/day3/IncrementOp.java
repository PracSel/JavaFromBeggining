package day3;

public class IncrementOp 
{

	public static void main(String[] args) 
	{
		int a=100;
		int b;
		
		System.out.println(a);
		a++;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		a+=1;
		System.out.println(a);

		b=a++;					//post increment
		System.out.println(b);
		b=++a;					//preincrement
		System.out.println(b);
	}

}
