public class Function1 {
	void meth1()
	{
		System.out.println("Hello World 1");
	}
	void meth2()
	{
		System.out.println("Hello World 2");
		meth3();
	}
	void meth3()
	{
		System.out.println("Hello World 3");
	}
	public static void main(String args[])
	{
		Function1 func = new Function1();
		func.meth1();
		func.meth2();
	}	
}
