package session_3;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a;
        int b;

while(true) {
    try{
        System.out.println("input value of a:");
        a = sc.nextInt();

        System.out.println("input value of b:");
        b = sc.nextInt();

        if(b==0){
            System.out.println("cannot divide by 0!");
            continue;
        }

        float result = (float) a / b;
        System.out.println("results = "+result);
        break;
    }
    catch(Exception e){
        System.out.println("Invalid input! Please enter numbers");
        sc.nextLine();
    } finally {
        System.out.println("end program!");
    }

}
        sc.close();
    }
}
