abstract class A {
    public abstract void show();
     public abstract void config();
}
// class B extends A{
// public void show(){
// System.out.println("hello there mate!");
// }
// }
// why to use the the above class when we can use inner class

public class innerClass {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() 
            {
                System.out.println("hello there mate!");
            }
            public void config(){
                System.out.println("In Config File");
            }
        };

        obj.show();
        obj.config();
    }
}

// use of abstract and inner class together program implementation
