import java.util.Random;

public class dice
{
	//create fields
	//fields always have private access
	
	/**
	 * 
	 * 
	 * @auther Sam Bauer
	 * 
	 */
	
	private int numRolls =  0;
	
	public int roll()	
	{
		Random rand = new Random();
		int num =  rand.nextInt(6) + 1;
		numRolls++;
		return num;		
		
		
	}
	
	public int getNumRolls()
	{
		
		return numRolls;
	}
	
	public void reset()
	{
		numRolls = 0;
	}
	
	
	
}
