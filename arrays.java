class Student{
    String name;
    int age;
    int marks;
}


public class arrays {
    public static void main(String[] args) {
        Student std = new Student();
        std.name="Rahul";
        std.age=14;
        std.marks=50;

        Student std1 = new Student();
        std1.name="Dishant";
        std1.age=22;
        std1.marks=58;

        Student std2 = new Student();
        std2.name="Sahil";
        std2.age=33;
        std2.marks=57;

        Student studs[] = new Student[3];
        studs[0]=std;
        studs[1]=std1;
        studs[2]=std2;


        // for(int i=0; i<studs.length;i++){
        //     System.out.println(studs[i].name + " : " + studs[i].marks + " : " +  studs[i].age);
        // }
        for(Student stud :studs){
            System.out.println(stud.name + " : " + stud.marks + " : " +  stud.age);
        }







        // int num1[]={2,5,6,7};
        // System.out.println(num1[2]);

        // // to change values
        // num1[2]=7;
        // System.err.println(num1[2]);

        // int numNew[]= new int[4];
        // numNew[0]=5;
        // numNew[1]=6;
        // numNew[2]=7;
        // numNew[3]=8;
        // for(int i=0;i<3;i++){
        // System.out.println(numNew[i]);
        // }

        // // advance loop
        // for(int n : numNew){
        //         System.out.println(n);
        // }



        // multi-dimensional array
        int num2[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                num2[i][j] = (int) (Math.random() * 10);
            }

        }


        // for (int i = 0; i < 2; i++) {

        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(num2[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // System.out.println(num1[2] + num1[1]);
    }
}
