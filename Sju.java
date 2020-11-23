import java.util.Scanner;

public class Sju {
  public static void main(String [] args){

//System.out.println("Hello");
boolean flag=true;



while (flag)
{

Scanner input  = new  Scanner(System.in);

int value = input.nextInt();
// 1 Skriv ett Java-program som tar emot ett nummer från användaren och skriver ut i terminalen om det är positivt, negativt eller noll
/*
for(int i=1;i<5;i++)
{
System.out.println(i);
if(i==2)
{
  System.out.println(i);
}
if(i==3)
{
  System.out.print(i);
  System.out.print(i);
}

if(i==4)
{
  System.out.print(i);
  System.out.print(i);
  System.out.print(i);
}


}
*/

for(int i=1;i<5;i++)
{
  for(int j=1;j<i+1;j++)
    System.out.print(i);
    System.out.println(" ");
};

System.out.println("Behöver du göra mer? (1/0)");
Scanner inputVal  = new  Scanner(System.in);
int inputChar = inputVal.nextInt();
if(inputChar==0)
flag=false;

} //while loop

  }
}
