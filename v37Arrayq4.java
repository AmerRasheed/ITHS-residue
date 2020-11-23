import java.util.Scanner;
import java.util.Arrays;
public class v37Arrayq4{
public static void main(String [] args){
//int[] intArray = new int[5];

int[] intArray = {83,2,1,9,7};

 Arrays.sort(intArray);

//for(int i=0;i<sortedArray.length;i++) System.out.println(sortedArray[i]);

System.out.println(Arrays.toString(intArray) );
/*
Scanner sc= new Scanner(System.in);
for(int i=0;i<intArray.length;i++)
  intArray[i]=sc.nextInt();
for(int i=0;i<intArray.length;i++)
  System.out.println(intArray[i]);*/

  //findLargestAndSmallest(intArray);
}
public static void findLargestAndSmallest(int[] inputArray){
   int largest=0;
   int smallest=1;
   for(int i=0;i<inputArray.length;i++){
     if(inputArray[i]>largest)
     largest=inputArray[i];
     if(inputArray[i]<smallest)
     smallest=inputArray[i];
   }
    System.out.println(largest);
    System.out.println(smallest);
}
}
