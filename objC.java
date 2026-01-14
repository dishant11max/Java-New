class Laptop{
    String model;
    int price;
    public String toString(){
        return model + ":" + price;
    }
    // public boolean equals (Laptop that)
    // {
    //     if(this.model.equals(that.model) && this.price==that.price){
    //         return true;
    //     }
    //     else
    //         return false;
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}

public class objC {
   public static void main(String[] args) {
    Laptop obj1 = new Laptop();
    obj1.model="Hp Victus";
    obj1.price=1000;

    Laptop obj2 = new Laptop();
    obj2.model="Hp Victus";
    obj2.price=1000;

    boolean res = obj1.equals(obj2);
    System.out.println(res);

   } 
}
