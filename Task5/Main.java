import java.util.ArrayList;

public class Main
{
	public static void main(String[]args)
	{

	ArrayList<String> actions = new ArrayList();
	actions.add("1) Start game");
	actions.add("2) Resume game");
	actions.add("3) Pause game");
	actions.add("4) End game");

	//System.out.println(actions.get(2));

	GameMenu myMenu = new GameMenu(actions);
	
	myMenu.getAction();
	String userChoice = myMenu.getAction();

	//System.out.println(userChoice);

	int i = Integer.parseInt(userChoice);

	myMenu.doAction(i);

	}	

}