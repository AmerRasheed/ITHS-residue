import java.util.Random;
import java.util.ArrayList;

public class player1{
  public String name;
  public int score;
  public int total;
  public int pointSum;

  ArrayList<diceClass> myDices;
  player1(String name, int score, int pointSum){
        this.name=name;
        this.score=score;
        this.pointSum=pointSum;
        this.total=0;
        myDices=new ArrayList<diceClass>();
       }


        public int getpointSum(){
          return pointSum;
        }

        public void setpointSum(int pointSum){
        this.pointSum=pointSum;
        }


  public String getName(){
    return name;
  }

  public void setName(String name){
  this.name=name;
  }

  public int getScore(){
    return score;
  }

  public int getTotal(){
    return total;
  }

  public void setScore(int score){
    this.score=score;
  }

  public int rollDice(int diceValue){

for(int i=0;i<myDices.size();i++)
{
    //  total += myDices.get(i).getRandomNum();
    total= (int)(Math.random()*(diceValue+1));
      //System.out.println("from PLAYER total " +total);
}
return total;
  }

public int getDiceValue(int sides){
  int sum=0;
  sum=sum+sides;
  return sum;
}

  public int increaseScore(int pointNum){
    pointNum=pointNum+1;
    return pointNum;
  }

  public void addDice (int sides){
    myDices.add(new diceClass(sides));
  }
}
