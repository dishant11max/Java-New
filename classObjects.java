 class Student{
    String name;
    int age;
    void study(){
        System.out.println(name + "  is studying");
    }
 } 
  

public class classObjects
{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.name="Dishant";
        s1.age=21;

        s2.name="Sahil";
        s2.age=21;

        s1.study();
        s2.study();
    }
}