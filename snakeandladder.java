

public class snakeandladder{
	public static void main(String[] args) {
	int Player1_Position = 0;
	int Player2_Position = 0;
	int Ladder = 1;
	int Snake = 2;
	int No_Play = 3;
	int Winning_Position = 100;
	int count1 = 0;
	int count2 = 0;
	while (Player1_Position != Winning_Position && Player2_Position != Winning_Position) {

//Rolling the dice to find player1 position and  player2 position	

		int Dice1 = (int) (Math.random() * 6 + 1);
		System.out.println("The first Player's Position after rolling the die is : " + Dice1);

		int Dice2 = (int) (Math.random() * 6 + 1);
		System.out.println("The second Player's Position after rolling the die is : " + Dice2);

//Generating random numbers to get options

		int playercheck1 = (int) Math.floor(Math.random() * 3 + 1);
		int playercheck2 = (int) Math.floor(Math.random() * 3 + 1);

//Get the count of the dice roll
		count1++;
		count2++;
		System.out.println("The dice number of player1 is: " + Dice1);
		System.out.println("The dice number of player2 is: " + Dice2);

		switch (playercheck1) {
		case 1:
			Player1_Position = Player1_Position + Dice1;
			System.out.println("The player position is :" + Player1_Position);
			if (Player1_Position > Winning_Position) {

				Player1_Position = Player1_Position - Dice1;
			}
			break;
		case 2:
			Player1_Position = Player1_Position - Dice1;
			System.out.println("The player position is :" + Player1_Position);
			break;
		case 3:
			Player1_Position = 0;
			System.out.println("There is no play and the player position is :" + Player1_Position);

//If the player goes below zero then the player has to restart from the original position

			if (Player1_Position < 0) {
				Player1_Position = 0;
			}
			System.out.println("The player position is: " + Player1_Position);
			break;
		}

//Switch case for player2
		switch (playercheck2) {
		case 1:
			Player2_Position = Player2_Position + Dice2;
			System.out.println("The player position is :" + Player2_Position);
			if (Player2_Position > Winning_Position) {

				Player2_Position = Player2_Position - Dice2;
			}
			break;
		case 2:
			Player2_Position = Player2_Position - Dice2;
			System.out.println("The player position is :" + Player2_Position);
			break;
		case 3:
			Player2_Position = 0;
			System.out.println("There is no play and the player position is :" + Player2_Position);

//If the player goes below zero then the player has to restart from the original position

			if (Player2_Position < 0) {
				Player2_Position = 0;
			}
			System.out.println("The player position is: " + Player2_Position);
			break;
		}

	}
	if (Player1_Position == Winning_Position) {
		System.out.println("Player1 is winner");
		System.out.println("Number of times die rolled by player1: " + count1);
	} else {
		System.out.println("Player2 is winner");
		System.out.println("Number of times die rolled by player2: " + count2);
	}

}

}