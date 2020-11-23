import java.util.Scanner;

public class v37Arrayq1{

  public static void main(String [] args) {
  Scanner sc= new Scanner(System.in);
  //Scanner scChar= new Scanner(System.in);
  int[] value= new int[4];
  boolean running=true;

      while (running){
        System.out.println("Enter 4 numbers");
            for(int i=0;i<4;i++){
               value[i]=sc.nextInt();
              }

                for(int i=0;i<4;i++){
                  if (value[i]!=value[i+1])
                  {
                  System.out.println("The numbers you have entered are not EQUAL");
                  running=true;
                  break;
                  }
                  else
                  {
                  System.out.println("YAYY !! The numbers are EQUAL");
                  running=false;
                  break;
                  }
                }

        }
  }
}
