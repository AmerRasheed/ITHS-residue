import java.util.Scanner;
//V.36 Exercise Question 5 String comparison wala
public class ChatBot {
    public static void main(String [] args){
  System.out.println("g");
  }

  /*
public class ChatBot {
    public static void main(String [] args){
    int [] inputArray =  inputArray();
    outputArray(inputArray);
    int[] sortedArray = bubblesort(inputArray);
    System.out.println("After sorting");
    outputArray(sortedArray);
  }

  public static int[] inputArray(){
    int[] newArray = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<5;i++){
      newArray[i]= sc.nextInt();
    }
    return newArray;
  }

  public static void outputArray(int[] inputArray){
    System.out.println("Array of integer is");
    for(int i=0;i<5;i++){
      System.out.println(inputArray[i]);
    }
  }

  public static  int[] bubblesort(int [] inputArray)  {
    for(int i=0;i<5;i++)  {
      for(int j=0;j<5;j++)
                  {
                    if (inputArray[i]<inputArray[j])
                      {
                      int temp =inputArray[1];
                      inputArray[i]=inputArray[j];
                      inputArray[i]=temp;
                      }
                  }
             }
             return inputArray;
           }

static void swap(int a, int b) {
  int temp= a;
  a=b;
  b=temp;
}
*/
}
// class ends here

/*
public class ChatBot {
public static void main(String [] args){

    for(int i=0;i<3;i++)
    {
    String accessCode=inputCode();
    //System.out.println(accessCode);
    if(isAuthorized(accessCode))
    System.out.println("The entered password are true " );
    else
    System.out.println("Please try again");
}
}

public static String inputCode(){
  System.out.println("Enter three access codes");
    Scanner input = new Scanner(System.in);
      String accessCode = input.nextLine();
        return accessCode;
 }

public static boolean isAuthorized(String checkCode){
  boolean flag = true;
    if ((checkCode.equals("piggy")) || (checkCode.equals("snuff")) || (checkCode.equals("bark")))
        flag=true;
          else
            flag=false;

      return flag;
}

}

//V.36 Exercise Question 4

public class ChatBot {
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
V.36 Exercise Question 3
public class ChatBot {
public static void main(String [] args){

              //  isRange(1);
                boolean flag=true;
                    while (flag)
                    {
                  System.out.println("Enter string");
                    Scanner input  = new  Scanner(System.in);
                      String value = input.nextLine();

                      System.out.println(value);



                            Scanner inputVal  = new  Scanner(System.in);
                              char inputChar = inputVal.next().charAt(0);
                                if(inputChar=='n')
                                  flag=false;
                    } //while loop
}


//V.36 Exercise Question 2
public class ChatBot {
public static void main(String [] args){

              //  isRange(1);
                boolean flag=true;
                    while (flag)
                    {
                  System.out.println("Enter a number in the range 0-10");
                    Scanner input  = new  Scanner(System.in);
                      int value = input.nextInt();
                        if((value>0)&&(value<10))
                          System.out.println("Yay, you entered in the range");
                        else
                          System.out.println("Try AGAIN to enter the number in the range OR input 'n' to exit");

                            Scanner inputVal  = new  Scanner(System.in);
                              char inputChar = inputVal.next().charAt(0);
                                if(inputChar=='n')
                                  flag=false;
                    } //while loop
}
//V.36 Exercise Question 1
public static boolean isEven(int x){
  boolean flag=false;
  if(x%2==0)
  {
    System.out.println(x + " is even number");
    flag=true;
  }
    else
    {
    System.out.println(x+ " is not an even number");
    flag=false;
   }
      return flag;
}
}
*/

/*

// V.36 Exercise Question 1
public class ChatBot {
public static void main(String [] args){
                isEven(1);
                isEven(100);
                isEven(31);


}
public static boolean isEven(int x){
  boolean flag=false;
  if(x%2==0)
  {
    System.out.println(x + " is even number");
    flag=true;
  }
    else
    {
    System.out.println(x+ " is not an even number");
    flag=false;
   }
      return flag;
}
}
*/
/*

  public static void main(String [] args){

    float result = calculateTax(100000);
      System.out.println(result);
}

public static float calculateTax(float x){
float result;
  if (x>100000)
     result=x*40/100;
  else
     result=x*30/100;
return result;

}
*/
/*
  public static void main(String [] args){
      System.out.println("Skviv ett nummer och du ska ha minus TIO fron den nummer");
       Scanner input = new Scanner(System.in);
        int num = input.nextInt();
          System.out.println("Yay du har skrivit" +  num);
          printSubtractTen(num);
}

  public static void printSubtractTen(int x){
                  int result = x-10;
                  System.out.println("Resultat efter minus ar" + result);
}
*/





/*
Scanner input = new Scanner(System.in);

System.out.println("Hej");
String name = input.nextLine();

System.out.println("12");

System.out.println("Your favourite Animal");

String favoritAnimal = input.nextInt();

System.out.println("DU hav");

//System.out.println("Hello");
boolean flag=true;



while (flag)
{

Scanner input  = new  Scanner(System.in);

int value = input.nextInt();
// 1 Skriv ett Java-program som tar emot ett nummer från användaren och skriver ut i terminalen om det är positivt, negativt eller noll

for(int i=1;i<11;i++)
System.out.println(i*value);

System.out.println("Behöver du göra mer? (1/0)");
Scanner inputVal  = new  Scanner(System.in);
int inputChar = inputVal.nextInt();
if(inputChar==0)
flag=false;

} //while loop
*/
