import java.util.Scanner;

public class Class {
  public static void main(String [] args){

System.out.println("Hello");
boolean flag=true;



while (flag)
{

Scanner input  = new  Scanner(System.in);

double value = input.nextDouble();
// 1 Skriv ett Java-program som tar emot ett nummer från användaren och skriver ut i terminalen om det är positivt, negativt eller noll

if(value<0)

System.out.println("Negativt");

else if (value>0) {
  System.out.println("Positivt");

}
else if (value == 0) {
  System.out.println("O");

}
else if (value>0) {
  System.out.println("Positivt");

}
else if (value>0) {
  System.out.println("Positivt");
}

//System.out.println(value);

System.out.println("Behöver du göra mer? (1/0)");
Scanner inputVal  = new  Scanner(System.in);
int inputChar = inputVal.nextInt();
if(inputChar==0)
flag=false;

} //while loop

  }
}
