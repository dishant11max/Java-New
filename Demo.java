//  class Student{
//     String name;
//     int age;
//     void study(){
//         System.out.println(name + "  is studying");
//     }
//  } 
  

// public class classObjects
// {
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Student s2=new Student();

//         s1.name="Dishant";
//         s1.age=21;

//         s2.name="Sahil";
//         s2.age=21;

//         s1.study();
//         s2.study();
//     }
// }

 class Computer{
    public void playMovie(){
        System.out.println("  movie is playing Yayy!!");
    }
    public String givePen(int cost){
        return (cost>=10)?"Pen":"Nothing";
      
    }
}
public class Demo{
    public static void main(String args[]){
        Computer obj = new Computer();
        obj.playMovie();
        String str = obj.givePen(15);
        System.out.println(str);
        
    }
}