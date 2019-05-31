package yatzee;

import java.util.Random;

public class Yahtzee 
{
	private Die[] dice;
	
	private int[] count;
	
	public Yahtzee()
	{
		dice = new Die[5];
		
		for(int i = 0; i < 5; i++)
			dice[i] = new Die();
		
		count = new int[6];
		updateCount();
	}
	
	public void rollAllDice()
	{
		for(int i = 0; i < 5; i++)
			dice[i].roll();	
	}
	
	public void rollADice(int dieNumber)
	{
		
		dice[dieNumber-1].roll();	
	}
	
	public int getADie(int dieNumber)
	{
		return dice[dieNumber-1].getValue();
	}
	
	public String showDice()
	{
		String showDice = "+------+---+---+---+---+---+" + "\n| Dice | 1 | 2 | 3 | 4 | 5 |" + "\n+------+---+---+---+---+---+" + "\n| Face | ";
		for ( int i = 0; i < 5; i++) 
		{
			showDice += dice[i].getValue() + " | ";
		}
		showDice +=  "\n+------+---+---+---+---+---+";
		return showDice;
	}
	
	private int countUp(int value)
	{
		int numScore = 0;
		for ( int i = 0; i < dice.length; i++)
		{
			if(dice[i].getValue() == value)
			{
				numScore++;
			}
		}
		return numScore;
	}
	
	private void updateCount()
	{
		for(int i = 0; i < 6; i++)
		{
			count[i] = countUp(i + 1);
			System.out.println("Number of " + (i + 1) + "s rolled: " + count[i]); //debug
		}
	
	}
	public int getScoreOnes()
	{
		return count[0] * 1;
	}
	public int getScoreTwos()
	{
		return count[1] * 2;
	}
	public int getScoreThrees()
	{
		return count[2] * 3;
	}
	public int getScoreFours()
	{		
		return count[3] * 4;
	}
	public int getScoreFives()
	{
		return count[4] * 5;
	}
	public int getScoreSixes()
	{
		return count[5] * 6;
	}
	//special points down here
	public int getThreeOfAKind()
	{
		int ret = 0;
		for(int i = 0; i < dice.length; i++)
			if(count[i] >= 3)
			{
				ret = (1 + i) * 3;
			}
		return ret;
	}
	
	public int getFourOfAKind()
	{
		int ret = 0;
		for(int i = 0; i<dice.length; i++)
			if(count[i] >= 3)
			{
				ret = (1 + i) * 4;
			}
		return ret;
	}
	
	public int getFullHouse()
	{
		int house = 0;
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; i < 6; i++)
			{
				if (count[i] == 3 && count[j] == 2);
				return 25;
			}  
		}	
		return 0;
	}
	
	public int getSmallStraight()
	{
		int score = 0;
		for(int i = 0; i < dice.length; i++)
		{
			for(int j = 0; i < dice.length; i++)
			{
				if(dice[i].getValue() + 1 == dice[j].getValue())
				{
					score++;
					break;
				}
			}
		}
		if (score >= 4)
			return 30;
		return 0;
	}
	
	public int getLargeStraight()
	{
		int score = 0;
		for(int i = 0; i < dice.length; i++)
		{
			for(int j = 0; i < dice.length; i++)
			{
				if(dice[i].getValue() + 1 == dice[j].getValue())
				{
					score++;
					break;
				}
			}
		}
		if (score >= 5)
			return 40;
		return 0;
	}
	
	
	
	public int YatzeeFive()
	{
			int ret = 0;
			for(int i = 0; i <dice.length; i++)
				if(count[i] >= 3)
				{
					ret = (1 + i) * 3;
				}
			return 50;
	}
}