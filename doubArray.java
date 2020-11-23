import java.util.Scanner;
public class doubArray{
public static void main(String [] args){
int[] intArray = new int[5];
Scanner sc= new Scanner(System.in);
for(int i=0;i<intArray.length;i++)
  intArray[i]=sc.nextInt();
//for(int i=0;i<intArray.length;i++)
  //System.out.println(intArray[i]);
  doubleUpArray(intArray);
  //for(int i=0;i<intArray.length;i++)
  //  System.out.println(darray[i]);

}
public static int[] doubleUpArray(int[] inputArray){

  int[] doubArray = new int[inputArray.length*2];

  for(int i=0;i<inputArray.length;i++)
{
 doubArray[i]=inputArray[i];
}
for(int j=0;j<doubArray.length;j++)
  System.out.println(doubArray[j]);

return doubArray;


}
}
