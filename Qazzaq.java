import java.util.ArrayList;
import java.util.Scanner;
public class Qazzaq{
public String name;
public int score;
//ArrayList<Dice> dices;
Qazzaq(String name){
        this.name=name;

       }
public String getName(){
    return name;
}
/*
public static boolean turn(Board board1){
  boolean myTurn=true;
  boolean fired=false;
  Canon canon1 = new Canon(true);
  Scanner scColFire = new Scanner (System.in);
  Scanner scRowFire = new Scanner (System.in);
  System.out.println("Enter column number");
  /On putting number 'B' is printed instead of 'D'
  int colNumFire=scColFire.nextInt();
  System.out.println("Enter row number");
  int rowNumFire=scRowFire.nextInt();
  fired=canon1.fire(rowNumFire,colNumFire,board1);
      if (fired)
        myTurn=true;
      else
        myTurn=false;
  return myTurn;
}
*/

/*
public static Board placeShip(Board board1){
  boolean myTurn=true;
  //Canon canon1 = new Canon(true);
  Scanner sc = new Scanner(System.in);
  System.out.println(" PRESS s if you want to show BOARD");
  System.out.println(" PRESS p if you want to place boats");
  System.out.println(" PRESS c if you want to cancel boats placement");
  //System.out.println(" PRESS f if you want to FIRE on boats");
  Scanner sc1 = new Scanner (System.in);
  int colNum;
  int rowNum;
  Scanner scCol = new Scanner (System.in);
  Scanner scRow = new Scanner (System.in);
  int colNumFire;
  int rowNumFire;
  Scanner scHVPos = new Scanner (System.in);
  char inpHVPos;
  Scanner scColFire = new Scanner (System.in);
  Scanner scRowFire = new Scanner (System.in);
    while(myTurn){
          char input=sc1.next().charAt(0);
          switch (input) {
                           case 's':  board1.show();
                                    break;
                           case 'p':
                                    {
                                      System.out.println(" Enter column number");
                                      colNum=scCol.nextInt();
                                      System.out.println(" Enter row number");
                                      rowNum=scRow.nextInt();
                                      System.out.println(" Enter Boat Position (for horizental press 'h' and for vertical press 'v')");
                                      inpHVPos=scHVPos.next().charAt(0);
                                      board1.placeBoat(rowNum,colNum,inpHVPos);  //Rows * Columns
                                    break;
                                  }
                          case 'c':  board1.clear(board1.size,board1.size);
                                    break;
            }
            System.out.println(" PRESS n ONLY if you want to play more AND any other character to continue operations");
            char out=sc1.next().charAt(0);
             if(out=='n')
              myTurn=false;
       }

  return board1;
}

}
