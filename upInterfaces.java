interface Movie{
    void genre();
    void rating();
}
class Horror implements Movie{
    public void genre(){
        System.out.println("Horror Genre");
    }
    public void rating(){
        System.out.println(" 4 ratings");
    }

}

class Action implements Movie{
      public void genre(){
        System.out.println("Action Genre");
    }
    public void rating(){
        System.out.println(" 5 ratings");
    }
}
class User{
    public void user(Movie mov){
        mov.genre();
        mov.rating();
    }
}


public class upInterfaces {
    public static void main(String[] args) {
        Movie film = new Action();
        Movie cine = new Horror();

        User watcher = new User();
        watcher.user(cine);
    }
}
// updated version of interface code