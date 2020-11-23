import java.util.Scanner;
import java.util.ArrayList;

public class SimpleDiceGame1{

public static ArrayList<player1> initiallize(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Players");
        int countPlayer=sc.nextInt();
        System.out.println("Enter Number of Dices");
        int countDice=sc.nextInt();
        System.out.println("Enter Number of Sides of each dice");
        int countDiceSides=sc.nextInt();
        System.out.println("You have requested " +countPlayer+ " Players," +countDice+ " dices with "+ countDiceSides+ " phases");
        ArrayList<player1> dicePlayer = new ArrayList<player1>();
        dicePlayer.add(new player1("Zalatin", 10));
        dicePlayer.add(new player1("Miandad", 20));
        dicePlayer.add(new player1("Haji", 30));
        int arraySize = dicePlayer.size();
        System.out.println(arraySize);
        
        return dicePlayer;
      };

      public static void takeTurn(ArrayList<player1> players){
        int receiveSize=players.size();
        System.out.println(receiveSize);
        diceClass.roll();
      };

        public static void main(String args []){
        ArrayList<player1> receivedPlayer= new ArrayList<player1>();
        receivedPlayer=initiallize();
        int recarraySize = receivedPlayer.size();
        System.out.println(recarraySize);

        takeTurn(receivedPlayer);








  /*      Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Players");
        int countPlayer=sc.nextInt();
        System.out.println("Enter Number of Dices");
        int countDice=sc.nextInt();
        System.out.println("Enter Number of Sides of each dice");
        int countDiceSides=sc.nextInt();
        System.out.println("You have requested " +countPlayer+ " Players," +countDice+ " dices with "+ countDiceSides+ " phases");

        ArrayList<player1> dicePlayer = new ArrayList<player1>();
//ArrayList<String> dicePlayer = new ArrayList<String>();
        System.out.println("Enter player one");
        dicePlayer.add(new player1("Zalatin", 10));
        dicePlayer.add(new player1("Miandad", 20));
        dicePlayer.add(new player1("Haji", 30));

        //dicePlayer.add("Zalatin");
        //dicePlayer.add("Miandad");
        //dicePlayer.add("Haji");

        int arraySize = dicePlayer.size();
        System.out.println(arraySize);

*/
      };
}

/*import java.util.Scanner;
import java.util.ArrayList;
public class SimpleDiceGame1{
//public static ArrayList<player1> initiallize(){
  public static ArrayList<player1> initiallize(){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number of Players");
        int countPlayer=sc.nextInt();

        System.out.println("Enter Number of Dices");
        int countDice=sc.nextInt();

        System.out.println("Enter Number of Sides of each dice");
        int countDiceSides=sc.nextInt();

        System.out.println("You have requested " +countPlayer+ " Players," +countDice+ " dices with "+ countDiceSides+ " phases");


      //  ArrayList<String> dicePlayer = new ArrayList<String>();

      //  private static player1 [] = new player1[0];
        ArrayList<player1> dicePlayer = new ArrayList<player1>();
        System.out.println("Enter player one");




//        dicePlayer.add(new player1("Zalatin"));
  //      dicePlayer.add(new player1("Miandad"));
    //    dicePlayer.add(new player1("Haji"));
    dicePlayer.add(new player1("Zalatin", 10));
    dicePlayer.add(new player1("Miandad", 20));
    dicePlayer.add(new player1("Haji", 30));






        int arraySize = dicePlayer.size();
        System.out.println(arraySize);
        System.out.println(dicePlayer);
        return dicePlayer;
      };

  //public static void takeTurn(ArrayList<Player> players);

//  public static ArrayList<player1>getWinners(ArrayList<Player> player1);

//public player1[] findAll(){   return playersArray;}


  public static void main(String args []){


   System.out.println("78692");
  //ArrayList<String> receivedPlayer = new ArrayList<String>();
//public static player1[] playersArray = new player1[0];
//findAll();
//receivedPlayer=




ArrayList receivedPlayer= new ArrayList<player1>();
receivedPlayer=initiallize();

//initiallize();






//System.out.println(receivedPlayer);



   //public static void takeTurn(ArrayList<Player> players);

   //public static ArrayList<player1>getWinners(ArrayList<Player> player1);
  }
}
*/
