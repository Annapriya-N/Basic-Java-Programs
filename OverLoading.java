
public class OverLoading {
	int num(int a, int b)
	{
		return a +b;
	}
	int num(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args)
	{
		OverLoading Ov = new OverLoading();
		int result = Ov.num(12, 2);
		int result1 = Ov.num(1, 2,3);
		System.out.println(result);
		System.out.println(result1);
	}

}
