package session_1;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
           // new tạo một đối tượng
            Scanner sc = new Scanner(System.in);

       // input information
            System.out.print("Nhập tên của bạn: ");
            String name = sc.nextLine();

            System.out.print("Nhập tuổi của bạn: ");
            int age = sc.nextInt();

            // output value
            System.out.println("\n results ");
            System.out.println( "name:"+ name );
            System.out.println("age:"+ age  );


            sc.close();
        }
    }

