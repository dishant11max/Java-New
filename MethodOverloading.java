 class Calc {
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
}

public class MethodOverloading{
   public static void main(String[] args) {
     Calc obj = new Calc();
   int sum1= obj.add(5,6,7);
    int sum2= obj.add(5,5);
    System.out.println(sum1);
    System.out.println(sum2);
   }
}