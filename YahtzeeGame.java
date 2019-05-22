package yatzee;

public class YahtzeeGame
{
public static void main(String[] args)
{
Yahtzee yahtzee = new Yahtzee();
yahtzee.rollAllDice();
System.out.println(yahtzee.showDice());
System.out.println("Get value of die number 3 is " + yahtzee.getADie(3));
yahtzee.rollADice(3);
System.out.println(yahtzee.showDice());
System.out.println("After re-roll the die number 3: " + yahtzee.getADie(3));
}
}
