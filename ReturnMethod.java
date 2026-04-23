public class ReturnMethod {

	int remainder(int money)
	{
		return 100;
	}
	public static void main(String[] args)
	{
		ReturnMethod ren = new ReturnMethod();
		int rem =ren.remainder(20);
		System.out.println(rem);
	}
}
