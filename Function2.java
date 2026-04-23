public class Function2 {
	void sum(int a, int b)
	{
		System.out.println("Sum of the 2 numbers :"+ (a+b));
	}
	void mul(int a, int b)
	{
		System.out.println("Mul of the 2 numbers : "+" "+ a*b);
	}
	void div(int a, int b)
	{
		System.out.println("Div of the 2 numbers : "+" "+ a/b);
	}
	public static void main(String[] args)
	{
		Function2 func = new Function2();
		func.sum(10, 1);
		func.mul(12,3);
		func.div(25, 5);
	}

}
