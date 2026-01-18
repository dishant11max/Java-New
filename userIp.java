// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

import java.util.Scanner;

public class userIp {
 public static void main(String[] args) //throws IOException
  {
    // System.out.println("Enter your number:");


    // // InputStreamReader in = new InputStreamReader(System.in);
    // // BufferedReader bf = new BufferedReader(in);
    // // simple way to take input from user

    // Scanner sc = new Scanner(System.in);
    // int num=sc.nextInt();
    // System.out.println(num);
    System.out.println("Enter a num:");
    Scanner sc = new Scanner(System.in);
    int j=sc.nextInt();
    int i = sc.nextInt();
    try{
       int num=j/i;
        System.out.println(num);
    }
    catch(Exception e){
        System.out.println("404");
    }
    finally{
        System.out.println("HEy");
    }//whenever we want to close the resource use finally
 }   
}
