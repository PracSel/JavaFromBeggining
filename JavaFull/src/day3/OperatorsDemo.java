package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		//Arithmetic Operators
		int a=88;
		int b=10;
		
		System.out.println("Sum:"+(a+b));
		System.out.println("Sub:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Modulo:"+(a%b));
		
		//Relational Operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical Operators
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		System.out.println(!b1);
		System.out.println(!b2);
		
		
		
	}

}
