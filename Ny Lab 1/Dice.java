import java.util.Random;
import java.util.Scanner;

class Dice{

    public static int numberOfsides;
    public static int currentValue;
    private static Random random = new Random();

    public Dice(int numberOfsides){
          this.numberOfsides= numberOfsides;
    }

    public int getnumberOfsides(){
          return numberOfsides;
    }

    public int getcurrentValue(){
          return currentValue;
    }

    public void roll(){
    currentValue=random.nextInt(numberOfsides)+1;
    }
}
