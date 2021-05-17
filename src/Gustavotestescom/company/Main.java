package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number, number2, number3, number4,number5, sum, average;
            boolean valid = true;

            System.out.println("type 5 numbers");
            number = scanner.nextInt();
            number2 = scanner.nextInt();
            number3 = scanner.nextInt();
            number4 = scanner.nextInt();
            number5 = scanner.nextInt();

            while(valid = true){
                    sum = number + number2 + number3 + number4 + number5;
                    average = sum/ 5;
                    System.out.println("the sum of your 5 numbers is " + sum);
                    System.out.println("the average of your 5 numbers is " + average);
                    break;
            }
    }
}
