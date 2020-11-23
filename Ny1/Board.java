public class Board{

public  int size=10;
public  char [][] Grid = new char[10][10];

Board(int size){
  for(int i=0;i<size;i++)
    for(int j=0;j<size;j++)
       set(i,j,' ');
    this.size=size;
  }

public void setSize(int size){
   this.size=size;
 }
public char get(int i, int j){
  return Grid[i][j];
}

public void set(int i, int j, char x){
  Grid[i][j]=x;
}

public void show(){
  for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("[");
        //System.out.print((char)27 + "[33m");
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
        System.out.print("[ ");
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
for(i=0;i<size;i++)
  for(j=0;j<size;j++)
     set(i,j,' ');
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
    for(int x=0;x<3;x++){
              if(orient=='h'){
                set(i,j++,'o');
              }
              else
              set(i++,j,'o');
     }
  }
}
