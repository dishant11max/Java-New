class Mobile{
    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand + ":" + price + ":" + name);
    }

}
public class Static{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="OnePlus";
        obj1.price=18000;
        Mobile.name="Smartphone";


        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=18500;
        Mobile.name="Smartphone";

        
        obj1.display();
        obj2.display();
    }
}