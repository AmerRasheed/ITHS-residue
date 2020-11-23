public class Board{
private int size;
public  char [][] grid;

Board(int size){
  grid=new char [size][size];
  for(int i=0;i<size;i++)
    for(int j=0;j<size;j++)
       set(i,j,' ');
  this.size=size;
  }

public char get(int i, int j){
  return grid[i][j];
}

public void set(int i, int j, char x){
  grid[i][j]=x;
}

public int getSize(){
return size;
}

public void show(){
  for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("[");
        System.out.print(get(i,j));
        System.out.print("]");
      }
      System.out.println("["+i+"]");
      System.out.println(" ");
  }
}

public void showFog(){
  for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("[");
          if (((get(i,j))=='x')||((get(i,j))=='.'))
          System.out.print(get(i,j));
        System.out.print("]");
      }
      System.out.println("["+i+"]");
      System.out.println(" ");
  }
}

public boolean checkFireBefore(int i, int j){
boolean alreadyFired=false;
    if (((get(i,j))=='x')||((get(i,j))=='.'))
    {
      alreadyFired=true;
    }
    else
      alreadyFired=false;
return alreadyFired;
}

public void clear(int i, int j){
     set(i,j,' ');
}

public int placeBoat(int i, int j, char orient){
  int countBoat=0;
  try
    {
      if((j<0||j>10)||(i<0||i>10))
      System.out.println("You cannot breach the grid limit. You entered " + j+ " * "+i);
      for(int x=0;x<3;x++){
                if(orient=='h'){
                  set(i,j++,'o');
                }
                else
                set(i++,j,'o');
     }
      for(i=0;i<10;i++){
            for(j=0;j<10;j++){
              if(get(i,j)=='o')
                countBoat++;
            }
    }
    }
  catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("You should not enter a number greater then Board limit");
      System.out.println("Place the boat again");
   }
  return countBoat;
}
}
