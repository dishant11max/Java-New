interface A{
    void show();
    void file();
}
class B implements A{
    public void show(){
        System.out.println("HEllo Im show");
    }
    public void file(){
        System.out.println("Hello Im a file");
    }
}


public class InterfaceC {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.file();
    }
}
