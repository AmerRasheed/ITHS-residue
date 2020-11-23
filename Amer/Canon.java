public class Canon{

public boolean fire(int i,int j,Board board){
  boolean flag=false;
    if(board.get(i,j)=='o'){
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
           System.out.println("                     But it was close one");
    }
  return flag;
 }
}
