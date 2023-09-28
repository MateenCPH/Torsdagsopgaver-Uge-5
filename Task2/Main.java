import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type your name");

		String name = scanner.nextLine();

		System.out.println("Hello " + name);
		System.out.println("Please type ypur age");

		String age = scanner.nextLine();
		int i = Integer.parseInt(age);

		System.out.println(age);


		int retireAge = 67;
		int yourRetireAge = 0;
		yourRetireAge = retireAge - i;
		System.out.println(yourRetireAge);

	}
}