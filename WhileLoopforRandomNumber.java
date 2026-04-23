import java.util.Random;

public class WhileLoopforRandomNumber {

	public static void main(String[] args)
	{
		Random Rand = new Random();
		int Num = 0;
		
		while(Num!=5)
		{
			Num = Rand.nextInt(6);
			System.out.println(Num);
		}
	}
}
