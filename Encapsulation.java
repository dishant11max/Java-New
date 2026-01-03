class Desc{


   private String name = "Dishant";
   private int age = 22;
   private String device = "1+";

    // constructor
   public Desc(){
    name="Devansh";
    age=15;
    device="Nokia";
   }
   
   public Desc(int age, String name)  //parameterized constructor
   {
    this.age=age;
    this.name=name;
   }


   public String getName(){
    return name;
   }
   //getting the values
    public String getDevice(){
    return device;
   } 

    public int getAge(){
    return age;
   }



//    setting the values
   public void setAge(int age){
    this.age=age;
   }
   public void setName(String name){
    this.name=name;
   }
}


public class Encapsulation {
    public static void main(String[] args)
     {
       Desc obj = new Desc();
       Desc obj1 = new Desc(18,"GreySon");
        System.out.println(obj1.getName() + " : " +obj1.getAge()); 
       System.out.println();
       obj.setAge(15);
       obj.setName("harsh");
       System.out.println(obj.getName() + " : " +obj.getAge()); 
    }
}
// this code also includes the use of this keyword along with constructors