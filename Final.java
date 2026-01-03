// by using final key word u can stop
// method overriding,inheritance 
 class A{
    public final void show(){
        System.out.println("in A show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class AddCalc extends A{

}

public class Final {
    public static void main(String[] args) {
    //   final int num = 80;
    // //   num=10;
    //   System.out.println(num);  
        A obj = new A();
        obj.show();
        obj.add(5,6);
    }
}
