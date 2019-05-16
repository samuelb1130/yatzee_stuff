package yatzee;

public class yatzeeGame {

	public static void main(String[] args) 
	{
		Die die = new Die();
		
		for(int i = 0; i < 10; i++)
			System.out.println("roll(): " + die.roll());
		
		System.out.println("getValue(): " + die.getValue()); 
	}
}
