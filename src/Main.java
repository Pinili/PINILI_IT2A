import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("=== PRORTFOLIO OF ACTIVITY ===");
    System.out.println("NAME: Pinili John Rho D.");
    System.out.println("SECTION/YEAR: IT2A");
    System.out.println("========== CONTENTS ==========");
    System.out.println("1. Activity 1");
    System.out.println("2. Activity 2");
    System.out.println("=============================");
    System.out.print("Enter Selection: ");
    int select = sc.nextInt();

    if(select == 1){
        Activity1 act1 = new Activity1();
        act1.userGreetings();

    }else{
        System.out.println("System not Found!");
    }

}