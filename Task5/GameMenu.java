import java.util.ArrayList;
import java.util.Scanner;


public class GameMenu
{
	private ArrayList<String> actions = new ArrayList();

	public GameMenu(ArrayList<String> actions)
	{
	this.actions = actions;
	}

	public void displayMenu()
	{
		for (String i : actions)
		{
			System.out.println(i);
		}
	}

	public String getAction()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		displayMenu();
		String choice = scanner.nextLine();
		return choice;
	}

	public static void doAction(int action)
	{
		switch(action)
		{
		case 1:
			System.out.println("Starting game now...");
			break;
		case 2:
			System.out.println("Fetching previously saved game data...");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game...");
			break;

		}
		
	}

}