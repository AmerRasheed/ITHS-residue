import java.util.Scanner;
import java.util.ArrayList;

public class SimpleDiceGame{
    public static ArrayList<Player> initiallize(){
    ArrayList<Player> players = new ArrayList<Player>();

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number of Player");
    int countPlayer=sc.nextInt();

    System.out.println("Please Enter dices (You want to play with)");
    int enterDices = sc.nextInt();

    System.out.println("Enter the number of sides of the dice (You want to play with)");
    int  diceSides = sc.nextInt();
    sc.nextLine();

    for(int i=0;i<countPlayer;i++){
        System.out.println("Enter the name of Players");
        String playerName = sc.nextLine();
        Player player = new Player(playerName);
        for(int j=0;j<enterDices;j++){
            player.addDice(diceSides);
        }
        players.add(player);
    }
    return players;
    }

private static void takeTurn (ArrayList <Player> players){
    for(Player player:players)   {
        System.out.println(" ");
        System.out.print("Now "+ player.getName()+ " is going to take the turn           ");

        player.rollDice();

        System.out.println("Enter Your Guess betwee" );
        Scanner sc1= new Scanner(System.in);
        int guessScore=sc1.nextInt();

        int number= player.getDiceValue();
        if(guessScore==number)
            {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println ("Output of " + player.getName()+"'s guess ");
            System.out.println("Your guess is "+ guessScore);
            System.out.print("and output of DICE is "+ number);
            System.out.println("                      Correct Guess !!");

            player.increaseScore();

           }
            else
           {
            System.out.println("                   Sorry !! wrong guess try again");
            System.out.println("Your guess is "+ guessScore);
            System.out.println("but sorry the output of DICE was "+ number);
            }
        }
    }

private static ArrayList <Player> getWinners (ArrayList <Player> players){
    int maxValue=0;
    for(Player player:players) {
        if(player.getScore()>maxValue)
        maxValue=player.getScore();
      }

    ArrayList<Player> winners = new ArrayList<>();

    for(Player player:players){
        if(player.getScore()==maxValue)
        {
          winners.add(player);
        }
      }
    return winners;
  }

public static void main(String args []){
      System.out.println("Wellcome to DICE PLAY GAME");
      System.out.println("by Amer Rasheed");

      ArrayList<Player> players=initiallize();

      System.out.println("You will get clear screen ONLY when you entered correct guess");
      for(int i=0;i<5;i++){
        takeTurn(players);
      }

      ArrayList<Player> winners = getWinners (players);
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("The points scored are as follows : ");
      for(Player winner:players) {
          System.out.print(winner.getName()+"   ");
          System.out.println(winner.getScore());
      }
      System.out.println ("The winner of the game is ");
      for (Player winner:winners){
        System.out.println(winner.getName());
      }
    }
 }
