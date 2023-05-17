package iNeuronJava;
import java.util.*; //console

class Guesser
{
	int guessNum;
	 int guessNum()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Kindly Guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
	
}
class Players
{
	int playerNum;
	 int PlayerNum()
	{
		Scanner pscan =new Scanner(System.in);
		System.out.println("Please guess the number");
		playerNum=pscan.nextInt();
		return playerNum;
	}
	
	
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectFromGuesser()
	{
		Guesser gnum=new Guesser();
		numFromGuesser= gnum.guessNum();
		
		
	}
	void collectFromPlayers()
	{
		Players p1= new Players();
		Players p2= new Players();
		Players p3= new Players();
		numFromPlayer1=p1.PlayerNum();
		numFromPlayer2=p2.PlayerNum();
		numFromPlayer3=p3.PlayerNum();
		
		
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println(" All Players Won the Game");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println(" Player1 And Player 2 Won the Game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println(" Player1 And Player 3 Won the Game");
			}
			else
			{
			System.out.println("Player1 Won the Game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer2&& numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player2 and player 3 Won the Game");
			}
			else
			{
				System.out.println("Player2 Won the Game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 Won the Game");
		}
		else 
		{
			System.out.println("Game lost Good luck again");
		}
	
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		
		
		Umpire um=new Umpire();
		um.collectFromGuesser();
		um.collectFromPlayers();
		um.compare();
		
		
	}

}
