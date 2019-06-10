package yatzee;

import java.util.Random;

public class Die {
	
	private int num;

	public Die()
	{
		num = roll();
		//num = 5; //debug
		
	}
	
	public int roll()
	{
		Random rand = new Random();
		num =  rand.nextInt(6) + 1;	
		return num;
	}
	
	public int getValue()
	{
		return num;
	}

}
