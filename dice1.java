import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class dice1{
    public static void main(String args []){
    System.out.println("Wellcome to DICE PLAY GAME");

    ArrayList<player1> pointArray = new ArrayList<player1>();
    int diceSides=0;
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

int savePoint=0;
//ArrayList<player1> pointArray = new ArrayList<player1>();

System.out.println("The players you entered are as follows :  ");
for(player1 eachPlayer:scoreArray) {
System.out.print(eachPlayer.getName()+"    ");
System.out.println(eachPlayer.getScore());
}
for (int i =0;i<10;i++)
                            {
                                  //ArrayList<player1> pointArray = new ArrayList<player1>();
                                  for(player1 eachPlayer:scoreArray)   {
                                                     System.out.println(" ");
                                                     System.out.println(" ");
                                                      System.out.print(eachPlayer.getName()+ " is going to take the turn           ");
                                                      //Calculate guess range if time i.e. 4+6+8=18 or 6+6=12 range 18 or 12
                                                      System.out.println("Enter Your Guess ");
                                                      Scanner sc1= new Scanner(System.in);
                                                      int guessScore=sc1.nextInt();
                                                      System.out.println("Roll the dice");
                                                      diceClass diceOne = new diceClass(diceSides);
                                    //waqas// int number= diceOne.getRandomNum();
                                                      int number=(int)(Math.random()*(diceSides-1));
                                                  //int number=eachPlayer.getTotal();
                                                //  int number=eachPlayer.rollDice();
                                                //    int number=diceOne.getRandomNum();
                                                  //    System.out.println("Total is "+ number);
                                    //                int randNumgen = (int)(Math.random()*(diceSides-1));
                                      //              System.out.println( "The randomly generated number is " + setRandomNum);

                                                      if(guessScore==number)
                                                      {
                                                  //    System.out.print("\033[H\033[2J");
                                                  //    System.out.flush();
                                                        System.out.println("guess is "+ guessScore);
                                                        System.out.println("Random number is  is "+ number);
                                                        System.out.println("                                    Correct Guess");
                                                      //eachPlayer.getScore()
                                                      //=guessScore;
              //System.out.println(eachPlayer.getScore());
                                                      //  temp=eachPlayer.getScore();
                                                        //System.out.println("THE VALUE is"+ temp);
                                                       //if(eachPlayer.getName())
                                                       savePoint++;
                                                       //eachPlayer.setScore();
                                                       //diceClassObject1.setcurrentValue(guessScore);
//  diceOne.setcurrentValue(guessScore);
                                                       //pointScore = pointScore + guessScore;
                                                       //scoreArray.remove(eachPlathe pyer);
                                                       //  scoreArray.add(new player1(eachPlayer.getName(),guessScore));                 // Requiring values to be added
//pointArray=scoreArray;
boolean flag=false;
for(int w=0;w<pointArray.size();w++)
   if(pointArray.get(w).getName().equals(eachPlayer.getName()))
   {
    flag=true;
     pointArray.get(w).setScore(savePoint);
     break;
   }
if(flag==false){
                                                      pointArray.add(new player1(eachPlayer.getName(),savePoint));
                                                    }


  /*
                                                      if( x == 10 ) {
                                                             System.out.print("Value of X is 10");
                                                          }else if( x == 20 ) {
                                                             System.out.print("Value of X is 20");
                                                          }else if( x == 30 ) {
                                                             System.out.print("Value of X is 30");
                                                          }else {
                                                             System.out.print("This is else statement");
                                                          }


*/



//scoreArray.add(new player1(eachPlayer.getName(),guessScore));
//scoreArray.set("we",0);
//System.out.println(eachPlayer.getName());
                                                      //System.out.println("Point score are "+pointScore);
//System.out.println(diceOne.getcurrentValue());
                                                      }
                                                      else
                                                      {
                                                    //    System.out.print("\033[H\033[2J");
                                                    //    System.out.flush();
                                                       //System.out.println("Else point score is " + pointScore);
                                                      System.out.println("                                        Sorry !! wrong guess try again");
                                                      System.out.println("guess is "+ guessScore);
                                                      System.out.println("Random number is  is "+ number);
                                                      }
                                                      //System.out.println("aaaaaaaaaaaaaaaaaaa");
                                                      //System.out.println(eachPlayer.getName());
      //System.out.println("points of "+ eachPlayer.getName() + " are " + savePoint);
                                                      //pointArray.add(new player1(eachPlayer.getName(),savePoint));
                                                      //scoreArray=pointArray;

                                                    }
                                                  //  System.out.println("OUT");
            }

            //System.out.print("\033[H\033[2J");
          //  System.out.flush();

            System.out.println("The POINTs order are as follows :  ");
                for(player1 eachPlayer1:pointArray) {
                System.out.print(eachPlayer1.getName()+"   ");
                System.out.println(eachPlayer1.getScore());
              }

              //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        /*      int temp1;

              System.out.println("The outer loop is   ");
                  for(player1 eachPlayer3:pointArray) {
                               for(player1 eachPlayer4:pointArray)
                                             {
                                              if(eachPlayer3.getName().equals(eachPlayer4.getName()))
                                                  {
                                                      pointArray.add(new player1(eachPlayer3.getName(),getScore()));

}

}

}

*/

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    /*          int count1=0;
              int count2=0;
              int count3=0;
              int turn=0;
              boolean flag0=true;
              boolean flag1=true;
              boolean flag2=true;

              // UPTO three players tackled here
                            System.out.println("The outer loop is   ");
                                for(player1 eachPlayer3:pointArray) {
                                             for(player1 eachPlayer4:pointArray)
                                                           {
                                                            if(eachPlayer3.getName().equals(eachPlayer4.getName()))//&&(flag))
                                                                {
                                                                if((turn==0)&&(flag0)){
                                                                  count1++;
                                                                  System.out.println(eachPlayer3.getName()+ " has got points "+ count1);
                                                                  }
                                                                        else if ((turn==1)&&(flag1)){
                                                                          count2++;
                                                                          System.out.println(eachPlayer3.getName()+ " has got points "+ count2);
                                                                          }
                                                                              else {
                                                                                count3++;
                                                                                System.out.println(eachPlayer3.getName()+ " has got points "+ count3);
                                                                                }
                                                                        }
                                                            //turn++;
                                                            flag0=false;

                                                            if(turn==1)
                                                            flag1=false;
                                                            else
                                                            flag1=true;


                                                            }
                                                             turn++;
                                                                          //    System.out.print(eachPlayer1.getName()+"   ");
                                                                          //    System.out.println(eachPlayer1.getScore());
                                                            }
*/
/*
              int count1=0;
              int count2=0;
              int count3=0;
              int turn=0;
              boolean flag0=true;
              boolean flag1=true;
              boolean flag2=true;
                            System.out.println("The outer loop is   ");
                                for(player1 eachPlayer3:pointArray) {
                                             for(player1 eachPlayer4:pointArray)
                                                           {
                                                            if(eachPlayer3.getName().equals(eachPlayer4.getName()))//&&(flag))
                                                                {
                                                                if((turn==0)&&(flag0)){
                                                                  count1++;
                                                                  }
                                                                        else if ((turn==1)&&(flag1)){
                                                                          count2++;

                                                                          }
                                                                              else {
                                                                                count3++;
                                                                                }
                                                                        }
                                                            //turn++;
                                                            flag0=false;
                                                            }
                                                             turn++;
                                                                          //    System.out.print(eachPlayer1.getName()+"   ");
                                                                          //    System.out.println(eachPlayer1.getScore());
                                                            }

*/
                                                         //System.out.println("The players have following points score as follows :  ");
                                                         //for(player1 eachPlayer1:pointArray) {
                                                          //    System.out.println(eachPlayer1.getScore());
                                                            //}
/*
                                                          System.out.println("The winner is  ");
                                                          int maxValue=0;
                                                          for(player1 eachPlayer1:pointArray) {
                                                          if(eachPlayer1.getScore()>maxValue)
                                                          maxValue=eachPlayer1.getScore();

                                                          }
                                                          System.out.println("with maximum point is " + maxValue);
*/

            //scoreArray 15 23 23
            //diceClassObject1.setRandomNum(23);
            //System.out.println(diceClassObject1.getRandomNum());


            /*
            for (int i =0;i<5;i++)
              {
                System.out.println("Enter Your Guess (Between 1-6)");
                Scanner sc= new Scanner(System.in);
                int guessScore=sc.nextInt();
                System.out.println("Roll the dice");
                int randNumgen = (int)(Math.random()*(7-0));
                System.out.println( "The randomly generated number is " + randNumgen);
                if(guessScore==randNumgen)
              {
               System.out.println("Correct Guess");
              }
              else
              System.out.println("Sorry !! wrong guess try again");
            }*/
    }
}
