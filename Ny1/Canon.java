public class Canon{
boolean flag=false;

Canon(boolean flag)
{
  this.flag=false;
}

public boolean fire(int i,int j,Board board){
    if(board.get(i,j)=='o')
     {
      board.set(i,j,'x');
      System.out.println("Kaboom");
      flag=true;
     }
     else
     {
      board.set(i,j,'.');
      System.out.print("Sploosh !!!!!!!!!!");
        if((board.get(i,j+1)=='o')||(board.get(i,j-1)=='o')||(board.get(i,j-1)=='o')||
          (board.get(i-1,j)=='o')||(board.get(i+1,j)=='o')||(board.get(i+1,j+1)=='o')||
          (board.get(i+1,j-1)=='o')||(board.get(i+1,j-1)=='o')||(board.get(i-1,j-1)=='o'))
           System.out.println("                     That was close");
     }
  return flag;
}
}
