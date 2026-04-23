import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args)
	{
		Random ram = new Random();
		int num = ram.nextInt(5);
		
		System.out.println(num);
	}

}
