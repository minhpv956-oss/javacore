package session_2;

import java.util.Scanner;

public class practice_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year to check leap year or non-leap year: ");

        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){

            System.out.println("the year " + year + " is a leap year" );
        }else{
            System.out.println("the year " + year + " is a non-leap year" );
        }

        sc.close();


    }
}
