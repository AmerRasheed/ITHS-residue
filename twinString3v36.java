//V.36 Exercise Question

import java.util.Scanner;

public class twinString3v36 {
public static void main(String [] args){

        System.out.println("Enter string");
        Scanner input  = new  Scanner(System.in);
        boolean loop=true;
        String value2="";


        while (loop)
        {
          String value1 = input.nextLine();
          if (value1.equals(value2))
          {
          loop=false;
          }
          else
          {
          value2=value1;
          loop=true;
          }
        }
    }
}
