import java.util.Scanner;

public class accessCode5v36 {
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
