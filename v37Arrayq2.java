public class v37Arrayq2{

public static void main(String [] args){
  double value1;
  double value2;
/*
  value1=3.2;  //false
  value2=1.2;

  value1=1.2;  //true
  value2=0.2;
*/
  value1=3.2; // false
  value2=0.2;

  boolean result;
  result=betweenOneandZero(value1,value2);
  System.out.println(result);
}

public static boolean betweenOneandZero(double x1, double x2){
  boolean value;
    if(((x1>0)&&(x1<1)) && ((x1>0)&&(x1<1)))
  value=true;
    else
  value=false;

  return value;
}
}
