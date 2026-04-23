import java.util.Scanner;

public class ternaryOperation {
	public static void main(String[] args)
	{
		System.out.println("Is it raining outside ? ");
		Scanner scan3 = new Scanner(System.in);
		Boolean Rain = scan3.nextBoolean();
		String Result = Rain?"Take a Umbrella":"No need to take umbrella";
		System.out.println(Result);
		scan3.close();
		
	}
}
