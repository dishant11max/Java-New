class A{
public void show1(){
    System.out.println("in A show");
}
}
class B extends A{
public void show2(){
    System.out.println("In B show");
}
}


public class UpandDownCasting {
    public static void main(String[] args) {
      
    //   upcasting
        A obj1 =(A) new B();
      obj1.show1();

    //   downcasting
    B obj2 = (B)obj1;
    obj2.show2();
    // obj2.show1();
    }
}
