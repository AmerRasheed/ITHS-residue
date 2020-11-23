import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

class diceClass{

public static int numberOfsides;
public static int currentValue;
private static int randomNum;

private static Random ranNum=new Random();


public diceClass(int numberOfsides){
      this.numberOfsides= numberOfsides;
}

//Declaring getter
public int getRandomNum(){
  return randomNum;
}

//Declaring setter
public void setRandomNum(){
  //this.randomNum=(int)(Math.random()*(numberOfsides+1));
  Random random= new Random();

/*
  byte[] bytes = new byte[1];
  random.nextBytes(bytes);
 System.out.println("Rnadom is "+(bytes[0] % numberOfsides)+1);
  this.randomNum=(bytes[0] % numberOfsides)+1;
  */
}

//Declaring getter
public int getnumberOfsides(){
  return numberOfsides;
}

//Declaring setter
public void setnumberOfsides(){
  this.numberOfsides=numberOfsides;
}

//Declaring getter
public int getcurrentValue(){
  return currentValue;
}

//Declaring setter
public void setcurrentValue(int currentValue){
  this.currentValue=currentValue;
}

public static void roll(){

 }
}
