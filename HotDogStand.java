public class HotDogStand{

int HurMängdKorvKvar;

public void feedPerson(Person p) {
  if((p.hungrig)&&(HurMängdKorvKvar>0))
  {
    p.hungrig=false;
    HurMängdKorvKvar--;
  }
  else if (!p.hungrig){
    System.out.println( "You are not hungry");
  }
  else if (HurMängdKorvKvar<0)  {
    System.out.println("No more Sausages left. Come again");
  }
}
}
