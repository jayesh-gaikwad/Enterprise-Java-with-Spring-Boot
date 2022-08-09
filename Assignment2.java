import java.util.Scanner;

class Guesser			
{
	int guessNum;

	public int guessNumber()
	{
		Scanner sc=new Scanner(System.in);
		guessNum=sc.nextInt();
		return guessNum;
	}
	
}

class Player			
{		
		Scanner sc=new Scanner(System.in);
		int pguessNum=sc.nextInt();
		int playerGuessNo[]=new int [pguessNum];
		
		public int [] player()
		{
				for(int i=0;i<playerGuessNo.length;i++)
				{
					System.out.println("Player"+(i+1) +" Guess a number");
					playerGuessNo[i]=sc.nextInt();
				}
				return playerGuessNo;
		}	
}
	

class Umpire
{
	int numFromGuesser;
	int noOfPlayerInContest;
	int noFromPlayer[]=new int[noOfPlayerInContest];
	
	public void ToCheckWinner()
	{
		
		int round=1;
		System.out.println("Enter Number of Players Can Play The Game:");
		
		Player pl=new Player();
		noOfPlayerInContest=pl.pguessNum;
		
		System.out.println();
		System.out.println("#####Round "+round+"#####");
		
		Guesser gs=new Guesser();
		System.out.println("Guesser guess the number in round "+round+":");
		numFromGuesser=gs.guessNumber();
		
		System.out.println("Players guess the number in round "+round+".");
		noFromPlayer=pl.player();
		
		int count=noOfPlayerInContest;
		while(count>1)
		{
			count=0;
			round++;
			
			for(int i=0;i<noFromPlayer.length;i++)
			{
					if(noFromPlayer[i]==numFromGuesser)
					{
						count++;
						System.out.print("Player "+(i+1) +", ");
					}
					else
					{
						noFromPlayer[i]=0;
					}
			}
			
			if(count>1)
			{
				
				System.out.println("Guess the correct number. All the best for next Round !");
				System.out.println("#####Round "+round+"#####");
				Guesser gs1=new Guesser();
				System.out.println("Guesser guess the number in round "+round+":");
				numFromGuesser=gs1.guessNumber();
				
				System.out.println("Players guess the number in round "+round+".");
				for(int i=0;i<noFromPlayer.length;i++)
				{
					if(noFromPlayer[i]!=0)
					{
						Scanner sc=new Scanner(System.in);
						System.out.println("Player " + (i+1) +" guess the number:");
						noFromPlayer[i]=sc.nextInt();
					}
				}
				 
			}
		
		}
		
		int flag=0;
		for(int i=0;i<noFromPlayer.length;i++)
		{			
			if(noFromPlayer[i]!=0)
			{
				System.out.println("Player "+ (i+1) +" has won the game.");
				flag=1;
			}
		}
		if(flag==0)         
		{
			System.out.println("No player has won the game Hard Luck !");
		}
		
	}
}


public class Assignment2
{
	public static void main(String[] args) 
	{
		Umpire refre=new Umpire();
		refre.ToCheckWinner();
	}

}
