class Calc{
    public int add(int n1, int n2){
        return n1+n2;

    }
}

class AdvCalc extends Calc{
    public int add(int n1,int n2){
        return n1+n2+2;
    }
}

public class methOverriding {
    public static void main(String[] args) {
    Calc obj= new Calc();
    int newAdd = obj.add(5,5);
    System.out.println(newAdd);

    }
}
