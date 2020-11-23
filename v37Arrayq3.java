public class v37Arrayq3{

  public static void main(String [] args){
    int arrayLength=5;
    int arrayTruePos=1;
    boolean[] boolArray = new boolean[arrayLength];
    boolArray=arrayEndTrue(arrayLength,arrayTruePos);
    for(int i=0;i<arrayLength;i++)
    System.out.println(boolArray[i]);
  }
  public static boolean[] arrayEndTrue(int length,int pos){
    boolean[] funcArray = new boolean[length];
      for(int i=0;i<length;i++){
        if(i==pos-1)//1
        funcArray[i]=true;
        else
        funcArray[i]=false;
        }
        return funcArray;
  }
}
