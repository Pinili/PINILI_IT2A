import java.util.Scanner;

public class Activity1 {
    Scanner sc = new Scanner(System.in);

    public void userGreetings(){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter birth year: ");
        int byear = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gender = sc.next();

        System.out.println("--------------------------------------------");
        System.out.println("Hello "+name+"! Welcome to Java");
        System.out.println("You were born in "+byear+" and your gender is "+gender);
        System.out.println("--------------------------------------------");
    }
}