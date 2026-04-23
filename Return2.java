public class Return2 {
	
	int sum(int a,int b)
	{
		int total = a+b;
		return total;
	}
	public static void main(String[] args)
	{
		Return2 num = new Return2();
		int result = num.sum(15,15);
		System.out.println(result);
	}

}
