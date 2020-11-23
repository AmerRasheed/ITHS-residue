import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;


public class LAB1{
public static ArrayList<player1> initiallize(int diceSides){

  Scanner sc= new Scanner(System.in);
  System.out.println("Enter Number of Player");
  int countPlayer=sc.nextInt();
  /*
      for(int x=0;x<countPlayer;x++)
      {
        System.out.println("Enter the name of Players");
        String playerName = sString.nextLine();
        int [] playerName = new int[5];
      }
  */
  ArrayList<player1> scoreArray = new ArrayList<player1>();
  Scanner sString= new Scanner(System.in);
    for(int i=0;i<countPlayer;i++)
    {
       System.out.println("Enter the name of Players");
       String playerName = sString.nextLine();

       //System.out.println("Enter the source of Players");         int enterSource = sc.nextInt();

           System.out.println(playerName + " please Enter dices (You want to play with)");
           int enterDices = sc.nextInt();
                    player1 p1 = new player1(playerName, 0);

                  for(int j=0; j<enterDices;j++)
                  {
                      System.out.println("Enter the number of sides of the dice (You want to play with)");
                      diceSides = sc.nextInt();
                      p1.addDice(diceSides);

                  }
       scoreArray.add(p1);
    }
    return scoreArray;
}

private static void takeTurn (ArrayList <player1> scoreArray, int diceSides, int savePoint){

for (int i =0;i<5;i++)
                            {
                                  ArrayList<player1> pointArray = new ArrayList<player1>();
                                  for(player1 eachPlayer:scoreArray)   {

                                                      System.out.println(eachPlayer.getName()+ " is going to take the turn first ");
                                                      //Calculate guess range if time i.e. 4+6+8=18 or 6+6=12 range 18 or 12
                                                      System.out.println("Enter Your Guess (Between 1-6)");
                                                      Scanner sc1= new Scanner(System.in);
                                                      int guessScore=sc1.nextInt();
                                                      System.out.println("Roll the dice");
                                                      diceClass diceOne = new diceClass(diceSides);
                                    //waqas// int number= diceOne.getRandomNum();
                                                      int number=(int)(Math.random()*(diceSides-1));
                                                      System.out.println("generated"+ number);
                                    //                int randNumgen = (int)(Math.random()*(diceSides-1));
                                    //                System.out.println( "The randomly generated number is " + setRandomNum);
                                                      if(guessScore==number)
                                                      {
                                                        //System.out.print("\033[H\033[2J");
                                                        //System.out.flush();
                                                        System.out.println("guess is "+ guessScore);
                                                        System.out.println("Random number is  is "+ number);
                                                        System.out.println("Correct Guess");
                                                      //eachPlayer.getScore()
                                                      //=guessScore;
                                                        System.out.println(eachPlayer.getScore());
                                                      //  temp=eachPlayer.getScore();
                                                        //System.out.println("THE VALUE is"+ temp);
                                                       savePoint++;
                                                       //eachPlayer.setScore();
                                                       //diceClassObject1.setcurrentValue(guessScore);
//  diceOne.setcurrentValue(guessScore);
                                                       //pointScore = pointScore + guessScore;
                                                       //scoreArray.remove(eachPlayer);
                                                       //  scoreArray.add(new player1(eachPlayer.getName(),guessScore));                 // Requiring values to be added
//pointArray=scoreArray;
                                                      pointArray.add(new player1(eachPlayer.getName(),savePoint));
//scoreArray.add(new player1(eachPlayer.getName(),guessScore));
//scoreArray.set("we",0);
//System.out.println(eachPlayer.getName());
                                                      //System.out.println("Point score are "+pointScore);
//System.out.println(diceOne.getcurrentValue());
                                                      }
                                                      else
                                                      {
                                                        //System.out.print("\033[H\033[2J");
                                                        //System.out.flush();
                                                       //System.out.println("Else point score is " + pointScore);
                                                      System.out.println("Sorry !! wrong guess try again");
                                                      System.out.println("guess is "+ guessScore);
                                                      System.out.println("Random number is  is "+ number);
                                                      }
                                                      System.out.println("aaaaaaaaaaaaaaaaaaa");
                                                      //System.out.println(eachPlayer.getName());
                                                      System.out.println("points of "+ eachPlayer.getName() + " are " + savePoint);
                                                      //pointArray.add(new player1(eachPlayer.getName(),savePoint));
                                                      //scoreArray=pointArray;
                                                      System.out.println("The POINTs you entered are as follows :  ");
                                                          for(player1 eachPlayer1:pointArray) {
                                                          System.out.println(eachPlayer1.getName());
                                                          System.out.println(eachPlayer1.getScore());
                                                        }
                                                    }
                                                    System.out.println("OUT");
            }
                                                         System.out.println("The players you entered are as follows :  ");
                                                         for(player1 eachPlayer:scoreArray) {
                                                              System.out.println(eachPlayer.getScore());
                                                            }

                                                          System.out.println("The winner is  ");
                                                          int maxValue=0;
                                                          for(player1 eachPlayer:scoreArray) {
                                                          if(eachPlayer.getScore()>maxValue)
                                                          maxValue=eachPlayer.getScore();

                                                          }
                                                          System.out.println("with maximum point is " + maxValue);

}
public static void main(String args []){
int diceSides=0;
int temp;
int savePoint=0;
System.out.println("Wellcome to DICE PLAY GAME");
ArrayList<player1> scoreArray= new ArrayList<player1>();
scoreArray = initiallize(diceSides);
takeTurn(scoreArray,diceSides,savePoint);
    }
}
