import java.util.Scanner;

public class BattleShips{
  public static boolean turn(Board board1){
    boolean myTurn=true;
    boolean fired=false;
    boolean alreadyFired=true;
    int colNumFire=0;
    int rowNumFire=0;
    Canon canon1 = new Canon();
    Scanner scColFire = new Scanner (System.in);
    Scanner scRowFire = new Scanner (System.in);
    System.out.println("[0][1][2][3][4][5][6][7][8][9]");
    board1.showFog();
        try {
            while(alreadyFired)
            {
            System.out.println("Enter column number [0-9]");
            colNumFire=scColFire.nextInt();

            System.out.println("Enter row number [0-9]");
            rowNumFire=scRowFire.nextInt();
            alreadyFired= board1.checkFireBefore(colNumFire,rowNumFire);
            if(alreadyFired)
              System.out.println("Take turn again with some other COL and ROW values, as the place you fired is already fired");
            }
            if(!alreadyFired)
            fired=canon1.fire(rowNumFire,colNumFire,board1);
            }
        catch (Exception e) {
               System.out.println("You should not enter a number greater then Board limit");
            }
          if (fired)
              myTurn=true;
          else
              myTurn=false;
    return myTurn;
}

private static Board initialize (){
    boolean myTurn=true;
    Board board1 = new Board(10);
    Scanner sc = new Scanner(System.in);
    System.out.println(" PRESS s .................................................Show BOARD");
    System.out.println(" PRESS p .................................................Place boats. NOTE: You have ONLY FOUR turns (boats) to place");
    System.out.println(" PRESS c .................................................Reset BOARD");
    Scanner sc1 = new Scanner (System.in);
    int colNum;
    int rowNum;
    Scanner scCol = new Scanner (System.in);
    Scanner scRow = new Scanner (System.in);
    int colNumFire;
    int rowNumFire;
    int xcount=0;
    Scanner scHVPos = new Scanner (System.in);
    char inpHVPos;
    Scanner scColFire = new Scanner (System.in);
    Scanner scRowFire = new Scanner (System.in);
    while(myTurn){
          char input=Character.toLowerCase(sc1.next().charAt(0));
          switch (input) {
                           case 's':
                                    System.out.println("[0][1][2][3][4][5][6][7][8][9]");
                                    board1.show();
                                    break;
                           case 'p':
                                    {
                                      xcount=0;
                                      System.out.println(" Enter column number [0-9]");
                                      colNum=scCol.nextInt();
                                      System.out.println(" Enter row number [0-9]");
                                      rowNum=scRow.nextInt();
                                      System.out.println(" Enter Boat Position (for horizental press 'h' and for vertical press 'v')");
                                      inpHVPos=Character.toLowerCase(scHVPos.next().charAt(0));
                                      xcount=board1.placeBoat(rowNum,colNum,inpHVPos);
                                      break;
                                      }

                          case 'c':  board1 = new Board(10);
                                     break;
                        }
    System.out.println(" PRESS s .................................................Show BOARD");
    System.out.println(" PRESS p .................................................Place boats. NOTE: Place only FOUR boats");
    System.out.println(" PRESS c .................................................Reset BOARD");
    System.out.println(" Press n if you DO NOT want to play more or Y to continue operations (Y/N) followed by operations selection (above)");
    char out=Character.toLowerCase(sc1.next().charAt(0));
    if(out=='n')
     {
      if (xcount<12)
      {
        System.out.println("You have overlapped some boats. Re-position boats again (by pressing OPTION c above).");
        System.out.println("Press any key to continue");
        myTurn=true;
      }
      else
      {
      myTurn=false;
      System.out.println("You have successfully placed FOUR boats");
      }
    }
}
  return board1;
}

private static boolean checkWinner (Board board){
    int counter=0;
    boolean flag=false;
    for(int i=0;i<board.getSize();i++){
        for(int j=0;j<board.getSize();j++){
          if (board.get(i,j)=='x')
            counter++;
          if (counter==10)
            flag=true;
          else
            flag=false;
    }
    }
  return flag;
}

public static void main(String [] args){
    System.out.println("Welcome to BattleShips Game between Amer and Enemy");
    System.out.println(" ");
    Viking viking1= new Viking("Amer");
    Viking viking2= new Viking("Enemy");
    System.out.println("Now "+ viking1.getName()+ " will place the BOATS");
    System.out.println(" ");
    String winner="";
    Board board1= initialize();
    System.out.println(" ");
    System.out.println("Now "+ viking2.getName()+ " will place the BOATS");
    System.out.println(" ");
    Board board2= initialize();
    boolean destroyed=false;
    boolean fired=true;
    System.out.println(" Let the tournament begins ");
      for(int i=0;i<3;i++){
        while(!destroyed){
            System.out.println(" ");
            System.out.println(" Now "+ viking1.getName()+ " will take the turn");
            fired=true;
            System.out.println("The "+ viking2.getName() + " s position against the opponent is BEFORE SHELLING ");
              while(fired){
                  fired = turn(board2);
                  destroyed=checkWinner(board2);
                  winner=viking1.getName();
                  if(destroyed)
                  {
                  System.out.println(winner + " wins the game");
                  break;
                  }
              }
            System.out.println("The "+ viking1.getName() + " s score ON THE OPPONENT's AREA is ");
            System.out.println("[0][1][2][3][4][5][6][7][8][9]");
            board2.showFog();
            System.out.println(" ");
              if(destroyed)
                fired=false;
              else
                fired=true;
                System.out.println(" ");
                System.out.println("Now "+ viking2.getName()+ " will take the turn");
                while(fired){
                    fired = turn(board1);
                    destroyed=checkWinner(board1);
                    winner=viking2.getName();
                    if(destroyed)
                    {
                    System.out.println(winner + " wins the game");
                    break;
                    }
                }
            System.out.println("The "+ viking2.getName() + " s position against the opponent is ");
            System.out.println("[0][1][2][3][4][5][6][7][8][9]");
            board1.showFog();
       }
      }
            System.out.println(winner+" destroyed all the opponent's ships");
   }
}
