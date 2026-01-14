class A{
     public void show(){
            System.out.println("in A");
        }

   class B{
        public void config(){
            System.out.println("in B");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj2 = obj.new B ();
        obj2.config();
    }
}
