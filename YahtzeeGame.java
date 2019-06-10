package yatzee;

public class YahtzeeGame
{
public static void main(String[] args)
	{
Yahtzee yahtzee = new Yahtzee();
System.out.println(yahtzee.showDice());
System.out.println("Three of a Kind: " + yahtzee.getScoreThreeOfAKind()); //working
System.out.println(" Four of a Kind: " + yahtzee.getScoreFourOfAKind());	//working
System.out.println(" Full House: " + yahtzee.getScoreFullHouse()); //working
System.out.println(" Small Straight: " + yahtzee.getScoreSmallStraight()); //working
System.out.println(" Large Straight: " + yahtzee.getScoreLargeStraight());//working
System.out.println(" Chance: " + yahtzee.getScoreChance());	//working
System.out.println(" Yahtzee: " + yahtzee.getScoreYatzee());  //working

	}
}