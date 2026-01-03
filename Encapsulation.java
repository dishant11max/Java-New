class Desc{
   private String name = "Dishant";
   private int age = 22;
   private String device = "1+";

   public String getName(){
    return name;
   }

    public String getDevice(){
    return device;
   } 

    public int getAge(){
    return age;
   }
}


public class Encapsulation {
    public static void main(String[] args) {
       Desc obj = new Desc();
       System.out.println(obj.getName() + " : " +obj.getAge()); 
    }
}
