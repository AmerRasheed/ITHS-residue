import java.util.*;
public class age  {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = 0;

    while (age == Integer.parseInt(input))
    {
      try{
      age = input.nextInt();
      }
      catch (InputMismatchException e){
      System.out.println("you entered age in something other than numbers");
      System.out.println("Exceptoin occured" + e.getMessage());
      }
    /*catch (ArithmeticException e){
      System.out.println("enter a valid number");
      System.out.println("Exceptopn occured" + e.getMessage());
    }*/
      catch (Exception e){
      System.out.println("enter a valid input");
      System.out.println("Exceptopn occured" + e.getMessage());
      }
    finally {
    System.out.println("age is " + age );
  }
  }
}
}
