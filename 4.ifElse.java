class ifElse {
    public static void main(String[] args) {
        int num = 45;
        if (num > 10 && num < 25)
            System.out.println("Hello nigu");
        else if (num > 20 || num < 50) {
            System.out.println("Wah re beta");
        } else
            System.out.println("Bye");

        // ternary operators
        int a = 5;
        int result = 0;
        result = a % 2 == 0 ? 5 : 20;
        System.out.println(result);

        // switch statements
        int day=1;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
             case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("chose the day from above");
                break;
        }

    }
}

// i also did if-elseif,ternary operator program in the same file
