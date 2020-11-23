import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class dice3{
  public static ArrayList<player1> initiallize(int diceSides){
    int sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number of Player");
    int countPlayer=sc.nextInt();
    ArrayList<player1> scoreArray = new ArrayList<player1>();
    Scanner sString= new Scanner(System.in);
      for(int i=0;i<countPlayer;i++)
      {
       System.out.println("Enter the name of Players");
         String playerName = sString.nextLine();
         System.out.println(playerName + " please Enter dices (You want to play with)");
         int enterDices = sc.nextInt();
         player1 p1 = new player1(playerName, 0,0);
         sum=0;
                    for(int j=0; j<enterDices;j++)
                    {
                        System.out.println("Enter the number of sides of the dice (You want to play with)");
                        diceSides = sc.nextInt();
                        p1.addDice(diceSides);
                        sum=sum+p1.getDiceValue(diceSides);
                        p1.setpointSum(sum);
                    }

         scoreArray.add(p1);
      }
      int savePoint=0;
      //int point=0;
      System.out.println("The players you entered are as follows :  ");
      for(player1 eachPlayer:scoreArray) {
      System.out.print(eachPlayer.getName()+"    ");
      System.out.println(eachPlayer.getScore());
      }
      return scoreArray;
}
  private static void takeTurn (ArrayList <player1> scoreArray, int diceSides, int savePoint){
      ArrayList<player1> pointArray = new ArrayList<player1>();
      for (int i =0;i<15;i++)
      {
        for(player1 eachPlayer:scoreArray)   {
            System.out.println(" ");
            System.out.println(" ");
          //  System.out.print("\033[H\033[2J");
          //  System.out.flush();
            System.out.print("Now "+ eachPlayer.getName()+ " is going to take the turn           ");
            System.out.println("Enter Your Guess between 1 and "+ eachPlayer.getpointSum());
            Scanner sc1= new Scanner(System.in);
            int guessScore=sc1.nextInt();
            System.out.println("Roll the dice");
            diceClass diceOne = new diceClass(diceSides);
            //int number=(int)(Math.random()*(diceSides-1));
          int number=  eachPlayer.rollDice(eachPlayer.getpointSum());
            if(guessScore==number)
            {
            System.out.print("\033[H\033[2J");
            System.out.flush();
              System.out.println (eachPlayer.getName());
              System.out.println("Your guess is "+ guessScore);
              System.out.println("and Random number is  is "+ number);
              System.out.println("                      Correct Guess");
              savePoint=eachPlayer.increaseScore(savePoint);
              boolean flag=false;
              for(int w=0;w<pointArray.size();w++)
                 if(pointArray.get(w).getName().equals(eachPlayer.getName()))
                 {
                  flag=true;
                   pointArray.get(w).setScore(savePoint);
                   break;
                 }
               if(flag==false){

                 //increaseScore(pointArray,eachPlayer.getName(),savePoint);
                pointArray.add(new player1(eachPlayer.getName(),savePoint,0));

                }
                }
               else
                {
              //    System.out.print("\033[H\033[2J");
              //    System.out.flush();
                System.out.println("                   Sorry !! wrong guess try again");
                System.out.println("Your guess is "+ guessScore);
                System.out.println("but sorry the Random number was "+ number);
                }
                }
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("The POINTs order are as follows :  ");
                for(player1 eachPlayer1:pointArray) {
                System.out.println(eachPlayer1.getName()+"   ");
                System.out.println(eachPlayer1.getScore());
                System.out.println(" ");
                System.out.println(" ");
                }
                int maxValue=0;
                String winner="";
                for(player1 eachPlayer1:pointArray) {
                if(eachPlayer1.getScore()>maxValue)
                {maxValue=eachPlayer1.getScore();
                 winner=eachPlayer1.getName();
                }
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.print("The winner is "+ winner);
                System.out.println(" with maximum points " + maxValue);
      }

    public static void main(String args []){
      System.out.println("hh");
      int diceSides=0;
      int temp;
      int savePoint=0;
      System.out.println("Wellcome to DICE PLAY GAME");
      ArrayList<player1> scoreArray= new ArrayList<player1>();
      scoreArray = initiallize(diceSides);
      System.out.println("The screen will be cleared ONLY if you enter CORRECT guess");
      takeTurn(scoreArray,diceSides,savePoint);
    }
  }
      /*
    System.out.println("Wellcome to DICE PLAY GAME");
    ArrayList<player1> pointArray = new ArrayList<player1>();
    int diceSides=0;
      int sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number of Player");
    int countPlayer=sc.nextInt();
    ArrayList<player1> scoreArray = new ArrayList<player1>();
    Scanner sString= new Scanner(System.in);
      for(int i=0;i<countPlayer;i++)
      {
         System.out.println("Enter the name of Players");
         String playerName = sString.nextLine();
         System.out.println(playerName + " please Enter dices (You want to play with)");
         int enterDices = sc.nextInt();
         player1 p1 = new player1(playerName, 0,0);
         sum=0;
                    for(int j=0; j<enterDices;j++)
                    {
                        System.out.println("Enter the number of sides of the dice (You want to play with)");
                        diceSides = sc.nextInt();
                        p1.addDice(diceSides);
                        sum=sum+p1.getDiceValue(diceSides);
                        p1.setpointSum(sum);
                    }

         scoreArray.add(p1);
      }
int savePoint=0;
//int point=0;
System.out.println("The players you entered are as follows :  ");
for(player1 eachPlayer:scoreArray) {
System.out.print(eachPlayer.getName()+"    ");
System.out.println(eachPlayer.getScore());
}
  for (int i =0;i<15;i++)
    {
      for(player1 eachPlayer:scoreArray)   {
          System.out.println(" ");
          System.out.println(" ");
          System.out.print(eachPlayer.getName()+ " is going to take the turn           ");
          System.out.println("Enter Your Guess between 1 and "+ eachPlayer.getpointSum());
          Scanner sc1= new Scanner(System.in);
          int guessScore=sc1.nextInt();
          System.out.println("Roll the dice");
          diceClass diceOne = new diceClass(diceSides);
          //int number=(int)(Math.random()*(diceSides-1));
        int number=  eachPlayer.rollDice(eachPlayer.getpointSum());
          if(guessScore==number)
          {
      //    System.out.print("\033[H\033[2J");
      //    System.out.flush();
            System.out.println("guess is "+ guessScore);
            System.out.println("Random number is  is "+ number);
            System.out.println("                      Correct Guess");
            savePoint=eachPlayer.increaseScore(savePoint);
            boolean flag=false;
            for(int w=0;w<pointArray.size();w++)
               if(pointArray.get(w).getName().equals(eachPlayer.getName()))
               {
                flag=true;
                 pointArray.get(w).setScore(savePoint);
                 break;
               }
             if(flag==false){

               //increaseScore(pointArray,eachPlayer.getName(),savePoint);
              pointArray.add(new player1(eachPlayer.getName(),savePoint,0));

              }
              }
             else
              {
            //    System.out.print("\033[H\033[2J");
            //    System.out.flush();
              System.out.println("                   Sorry !! wrong guess try again");
              System.out.println("guess is "+ guessScore);
              System.out.println("Random number is  is "+ number);
              }
              }
              }
             //System.out.print("\033[H\033[2J");
             //  System.out.flush();
              System.out.println("The POINTs order are as follows :  ");
              for(player1 eachPlayer1:pointArray) {
              System.out.print(eachPlayer1.getName()+"   ");
              System.out.println(eachPlayer1.getScore());
              }

              int maxValue=0;

              String winner="";
              for(player1 eachPlayer1:pointArray) {
              if(eachPlayer1.getScore()>maxValue)
              {maxValue=eachPlayer1.getScore();
               winner=eachPlayer1.getName();
              }

              }
              System.out.print("The winner is "+ winner);
              System.out.println(" with maximum points " + maxValue);
              */
