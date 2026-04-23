
public class NestedIf {
	public static void main(String[] args)
	{
		Boolean KFC = true;
		Boolean Dish = true;
		Boolean Pepsi = true;
		
		if(KFC)
		{
			System.out.println("Entered into KFC");
			if(Dish)
			{
				System.out.println("Dish is ready");
			if(Pepsi)
				{
				System.out.println("Pepsi is there");
				}
			}
		}
	}
}
