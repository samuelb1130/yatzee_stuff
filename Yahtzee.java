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
	public int getScoreThreeOfAKind()
	{
		int point = 0;
		for(int i = 0; i < dice.length; i++)
			if(count[i] >= 3)
			{
				point = (1 + i) * 3;
			}
		return point;
	}
	
	public int getScoreFourOfAKind()
	{
		int point = 0;
		for(int i = 0; i<dice.length; i++)
			if(count[i] >= 4)
			{
				point = (1 + i) * 4;
			}
		return point;
	}
	
	public int getScoreFullHouse()
	{
		int point = 0;
		for(int i = 0; i < dice.length; i++)
			if(count[i] >= 3)
			{
				point = 0;
				for(int j = 0; j < dice.length; j++)
				if( i != j)
				{
					if(count[j] >= 2)
					{
						point = 25;
						return point;
					}
				}
			}
		return point;
	}
	
	public int getScoreSmallStraight()
	{
		int point = 0;
		for( int i = 0; i < dice.length; i++)
		{
			for( int j = 0; j < dice.length; j++)
			{
				if(dice[i].getValue() + 1 == dice[j].getValue())
				{
					point++;
				break;
				}
			}
		}
		if(point >= 4)
		{
			return 30;
		}
		return 0;
	}
	
	public int getScoreLargeStraight()
	{
		int point = 0;
		for( int i = 0; i < dice.length; i++)
		{
			for( int j = 0; j < dice.length; j++)
			{
				if(dice[i].getValue() + 1 == dice[j].getValue())
				{
					point++;
				break;
				}
			}
		}
		if(point >= 5)
		{
			return 40;
		}
		return 0;
	}
	
	public int getScoreChance()
	{
		int chance = 0;
		for(int i = 0; i < dice.length; i++)
		{
			chance += dice[i].getValue();
		}
		return chance;
	}
		
	public int getScoreYatzee()
	{
		int point = 0;
		for(int i = 0; i<dice.length; i++)
			if(count[i] >= 5)
			{
				point = (1 + i) * 5;
				return 50;
			}
		return 0;
	}
	
	public String getScoreCard()
	{
		Yahtzee yahtzee = new Yahtzee();
		String yes = "";
		yes += yahtzee.showDice();
		yes += "Three of a Kind: " + yahtzee.getScoreThreeOfAKind(); //working
		yes += " Four of a Kind: " + yahtzee.getScoreFourOfAKind();	//working
		yes += " Full House: " + yahtzee.getScoreFullHouse(); //working
		yes += " Small Straight: " + yahtzee.getScoreSmallStraight(); //working
		yes += " Large Straight: " + yahtzee.getScoreLargeStraight();//working
		yes += " Chance: " + yahtzee.getScoreChance();	//working
		yes += " Yahtzee: " + yahtzee.getScoreYatzee();  //working
		return yes;
	}
	
	public String Debug()	
	{	String showDice = "test";
		for ( int i = 0; i < 5; i++) 
		{
			showDice += dice[i].getValue();
		}
		return showDice;
	}
	
	public String Debug2()	
	{	String showDice = "test";
		for ( int i = 0; i < 5; i++) 
		{
			showDice += count[i];
		}
		return showDice;
	}
}