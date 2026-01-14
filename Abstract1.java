abstract class Car{
    public abstract void drive();

    public void playSongs(){
        System.out.println("Playing music");
    }
}
class Verna extends Car  //concrete class
{
    public void drive(){
        System.out.println("Driving A Verna By Maruti");
    }
}


public class Abstract1 {
public static void main(String[] args) {
    
    // cannot create an object of abstract class but you can create class of concrete class
    // Car obj = new Car();
    Car obj = new Verna();
    obj.drive();
    obj.playSongs();
}
    
}
