  import java.util.ArrayList;

  public class Player{
  public String name;
  public int score;
  ArrayList<Dice> dices;
  Player(String name){
          this.name=name;
          this.score=0;
          dices=new ArrayList<Dice>();
         }
  public String getName(){
      return name;
  }

  public int getScore(){
      return score;
  }

  public void rollDice(){
      for(int i=0;i<dices.size();i++){
        dices.get(i).roll();
      }
  }

  public int getDiceValue(){
     int sum=0;
     for(int i=0;i<dices.size();i++){
      sum = sum + dices.get(i).getcurrentValue();
      }
     return sum;
  }

  public void increaseScore(){
    score=score+1;
  }

  public void addDice (int sides){
    dices.add(new Dice(sides));
  }
}
