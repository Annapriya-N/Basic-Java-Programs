import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args)
	{
		
		Scanner sc1 = new Scanner(System.in);
		int Number = sc1.nextInt();
		int Number2 = sc1.nextInt();
		
		System.out.println("Number " +Number);
		System.out.println("Number2 " +Number2);
		sc1.close();
	}
}
