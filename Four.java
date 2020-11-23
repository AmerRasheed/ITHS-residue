import java.util.Scanner;

public class Four {
  public static void main(String [] args){

System.out.println("Hello");
boolean flag=true;



while (flag)
{

Scanner input  = new  Scanner(System.in);

int value = input.nextInt();
// 1 Skriv ett Java-program som tar emot ett nummer från användaren och skriver ut i terminalen om det är positivt, negativt eller noll

if(value==1)

System.out.println("Mondag");

else if (value==2) {
  System.out.println("Tisdag");

}
else if (value == 3) {
  System.out.println("Onsdag");

}
else if (value==4) {
  System.out.println("Torsdag");

}
else if (value==5) {
  System.out.println("Fredag");
}

else if (value==6) {
  System.out.println("Lordag");
}

else if (value==7) {
  System.out.println("Sondag");
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
