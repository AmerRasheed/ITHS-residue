import java.util.Scanner;

public class meanNum4v36 {
public static void main(String [] args){

float inputNumber1 = inputNumbers();
float inputNumber2 = inputNumbers();

calculateMean(inputNumber1,inputNumber2);
}

public static float inputNumbers(){
                  System.out.println("Enter a number");
                    Scanner input  = new  Scanner(System.in);
                       float num1 = input.nextFloat();
                          return num1;
 }
public static void calculateMean(float x1, float x2){
                  float mean = (x1+x2)/2;
                    System.out.println("The mean of two values is " +mean);
}
}
