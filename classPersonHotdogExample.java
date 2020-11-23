public class classPersonHotdogExample {

  public static void main (String [] args){
    System.out.println("Person och Korv program example");

    Person Per1 = new Person();
    Person Per2 = new Person();
    Person Per3 = new Person();

    Per1.firstName= "Ahmed";
    Per1.lastName="Habib";
    Per1.age = 34;
    Per1.hungrig=false;

    Per2.firstName= "Jawad";
    Per2.lastName="Abid";
    Per2.age = 35;
    Per2.hungrig=true;

    HotDogStand h1 = new HotDogStand();
    h1.HurMängdKorvKvar=10;
    h1.feedPerson(Per1);
    h1.feedPerson(Per2);
    System.out.println("Lefts are"+ h1.HurMängdKorvKvar);
}
}

/*public class classPersonHotdogExample {

  public static void main (String [] args){
    System.out.println("Person och Korv program example");

    HotDogStand HotDogs = new HotDogStand();
    Person p1 = new Person();
    Person p2 = new Person();
    p1.firstName= "Amer";
    p2.firstName= "Birgitta";
    if(p1.hungrig {
      HotDogs.HurMängdKorvKvar--;
      p1.hungrig=false;
    }
      System.out.println("The Korv kvar are" + HotDogs.HurMängdKorvKvar);
  }
}
*/
