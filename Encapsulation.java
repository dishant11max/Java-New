class Desc{
   private String name = "Dishant";
   private int age = 22;
   private String device = "1+";

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
   public void setAge(int a){
    age=a;
   }
   public void setName(String s){
    name=s;
   }
}


public class Encapsulation {
    public static void main(String[] args) {
       Desc obj = new Desc();
       obj.setAge(15);
       obj.setName("harsh");
       System.out.println(obj.getName() + " : " +obj.getAge()); 
    }
}
