import java.util.*;
public class except{
   public static void main(String args [])
   {

   boolean ok=false;
   System.out.println("Enter any integer");
   Scanner input= new Scanner(System.in);
   Scanner sc= new Scanner(System.in);
   int value=0;
   while(!ok)
   {
   try{
     value=input.nextInt();
     int answer=10/value;
  }
    catch(InputMismatchException e){
      System.out.println("Please enter some integer value");
  }
    catch(ArithmeticException e){
    System.out.println("Cannot divide");
  }
    finally{
      System.out.println("You entered" + value);
  }
 System.out.println("Wana enter more");
 char carryOn=sc.next().charAt(0);
 if(carryOn=='y')
  ok=false;
  else
  ok =true;
 }
 }
}
