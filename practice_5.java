package session_2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class practice_5 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float height = 0;
        float weigh = 0;

        while (true){
            try{
                System.out.println("enter number of height:");
                height = sc.nextFloat();
                if( height >= 0.5 && height <= 2.5)
                break;

            }catch(Exception e ){
                sc.nextLine();
                System.out.println("Invalid input please enter again!");

            }
        }


        while (true){
            try{
                System.out.println("enter number of weigh:");
                weigh = sc.nextFloat();
               if( weight >=2 && weight <= 100 )
                break;

            }catch(Exception e ){
                sc.nextLine();
                System.out.println("Invalid input please enter again!");

            }
        }


        double BMI = (float) (weigh/(pow(height,2)));

        if(BMI > 1 && BMI < 15){
            System.out.println("body thin");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("body slim");
        } else if (BMI>=16 && BMI < 18.5) {
            System.out.println(" body little slim");
        } else if (BMI >=18.5 && BMI < 25 ) {
            System.out.println("normal body");
        }else if(BMI >= 25 && BMI < 30){
            System.out.println("body little fat");
        }else if(BMI >= 30 && BMI < 35 ){
            System.out.println("body fat");
        }
        else if(BMI >= 35 && BMI <= 100 ) {
            System.out.println("body very fat");
        }else{
            System.out.println("go to a hospital!");
        }

        sc.close();


    }
}
