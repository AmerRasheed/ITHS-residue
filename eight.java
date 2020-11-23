import java.util.Scanner;

public class Eight {
  public static void main(String [] args){

boolean flag=true;
while (flag)
{

Scanner input  = new  Scanner(System.in);

int value = input.nextInt();

for(int i=1;i<=5;i++)
{
  for(int j=1;j<i+1;j++)
    System.out.print("*");
    System.out.println(" ");
};

for(int i=1;i<=5;i++)
{
  for(int j=value+4-i;j>value;j--)
    System.out.print("*");
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
