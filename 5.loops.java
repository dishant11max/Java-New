 class loops {
    public static void main(String[] args) {
        // java program implementing loops
        // while loop
        int i =1;
        while (i<=5) {
            System.out.println("hello "+i);
            int j = 1;
            while(j<=3){
                System.out.println("hry "+j);
                j++;
            }
            i++;
        }

        // do-while loop
        int j=1;
        do{
            System.out.println("hello "+j);
            j++;
        }
        while(j<=4);


        // for loop
        // int i;
        // for(int i=1;i<=5;i++)  //in for loop first 2 conditions are executed first 
        //     {
        //     System.out.println("Day "+ i);

        //     for(int j=1;j<=9;j++){
        //         System.out.println("  "+(j+8)+"-"+(j+9));
        //     }
        // }
    }
}
