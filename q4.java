import java.util.Scanner;
public class q4 {
 public static void main(String[]args) {
 Scanner input = new Scanner(System.in);
 boolean loop = true;
 String oldText = "";
 while(loop) {
 System.out.println("Skriv nåt då...");
 String newText = input.nextLine();
 if(newText.equals(oldText)) {
 loop = false;
 } else {
 oldText = newText;
 }
 }
 }
}
