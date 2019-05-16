
public class DiceMain {

	public static void main(String[] args)
	{
		dice dice1 = new dice();
		dice dice2 = new dice();
		for(int i = 0; i<10; i++)
			System.out.println(dice1.roll());
		for(int i = 0; i<20; i++)
			System.out.println(dice2.roll());
			
		System.out.println("die1: " + dice1.getNumRolls() + "\tdie2: " + dice2.getNumRolls());
	
			
	}

}
