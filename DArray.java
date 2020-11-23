public class DArray{

public static void main(String [] args){

char [][] Grid = new char[10][10];

for(int i=0;i<10;i++)
  for(int j=0;j<10;j++)
    Grid[i][j]='x';


for(int i=0;i<10;i++){
    for(int j=0;j<10;j++){
      System.out.print(Grid[i][j]);
      System.out.print(' ');
      System.out.print(' ');
    }
    System.out.println();
    System.out.println();
}
}
}
