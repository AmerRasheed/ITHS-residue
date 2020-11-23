public class isEven1v36 {
  public static void main (String [] args) {
    System.out.println("Good morning");
    boolean result=isEven(3);
      if (result)
    System.out.println("Its an even number");
    else
    System.out.println("its not an even number");
  }

  public static boolean isEven(int x){
    boolean flag;
      if (x%2==0)
      flag=true;
      else
      flag=false;
      return flag;
  }
}
