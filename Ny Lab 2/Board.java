public class Board{

public  int size=10;
public  char [][] Grid = new char[10][10];

/*********************************************************************************************************
Vincents comments
Loop inside the constructor
and with SPACE as a char
*********************************************************************************************************/
Board(int size){
  for(int i=0;i<size;i++)
    for(int j=0;j<size;j++)
       set(i,j,' ');
    this.size=size;
  }

public void setSize(int size){
   this.size=size;
 }
/*********************************************************************************************************
Vincents comments
change int to Char
*********************************************************************************************************/
public char get(int i, int j){
  return Grid[i][j];
}

public void set(int i, int j, char x){
  Grid[i][j]=x;
}

public void show(){
/*********************************************************************************************************
Vincents comments
Not to mix String with char OUTPUT
*********************************************************************************************************/
for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("[");
        //System.out.print((char)27 + "[33m");
        System.out.print(get(i,j));
        System.out.print("]");
      }
      System.out.println(" ");
      System.out.println(" ");
  }
}

public void showFog(){
  for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("[ ");
          if (((get(i,j))=='x')||((get(i,j))=='.'))
          System.out.print(get(i,j));
        System.out.print("]");
      }
      System.out.println(" ");
      System.out.println(" ");
  }
}

public boolean checkFireBefore(){
  boolean alreadyFired=false;
  int count=0;
  for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("[ ");
          if (((get(i,j))=='x')||((get(i,j))=='.'))
          {
          System.out.println("take turn again as the place you fired is already fired");
          alreadyFired=true;
count++;
                    //System.out.print(get(i,j));
          }
        System.out.print("]");
      }
      System.out.println(" ");
      System.out.println(" ");
  }
  System.out.println("count is "+ count);
  return alreadyFired;
}


public void clear(int i, int j){
for(i=0;i<size;i++)
  for(j=0;j<size;j++)
     set(i,j,' ');
     /*********************************************************************************************************
     Vincents comments
     Put space in char ' ' instead of X or a
    *********************************************************************************************************/
for(i=0;i<size;i++){
   for(j=0;j<size;j++){
     System.out.print("[");
     System.out.print(get(i,j));
     System.out.print("]");
   }
   System.out.println("");
   System.out.println("");
 }
}

public void placeBoat(int i, int j, char orient){
  //System.out.println("HH"+i+"jay "+j);
    for(int x=0;x<3;x++){
              if(orient=='h')
                {
                    //System.out.print((char)27 + "[33m");

                set(i,j++,'o');

            }
              else
              set(i++,j,'o');
     }
/*
                  if(j>=6)
                  {
                      try {
                      System.out.println("You are crossing the horizental (playing area) limit");
                      break;
                    } catch(ArrayIndexOutOfBoundsException e) {
                       System.out.println("The column number you have entered is invalid");
                       System.out.println("Please enter a columan number between 1 and 8");
                    }
                  }

              else {
                set(i++,j,'o');
                  if(i>=6)
                      try {
                      System.out.println("You are crossing the vertical (playing area) limit");
                      break;
                    } catch(ArrayIndexOutOfBoundsException e) {
                       System.out.println("The row number you have entered is invalid");
                       System.out.println("Please enter a row number between 1 and 8");
                    }
              }

    */
  }
}
