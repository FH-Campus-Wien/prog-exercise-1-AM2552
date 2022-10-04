package at.ac.fhcampuswien;

import javax.swing.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int a = 'Z';
        int b = 0xface;
        int c = 012;
        int d = (int) 80L;
        int e = (int) 44e-1f;
        int f = (int) 5.5f;
        int g = (int) 8.88e1;
        int h = (int) 99.9;
        int sum;

        sum = a + b + c + d + e + f + g + h;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();

        System.out.println("After Swap:");
        y = x+y;    // instructions on how to use the mathematical operators were found at | https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/ ; 03.10.2022
        x = y-x;
        y = y-x;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1 = 0;
        int n2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        int revenue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        revenue = scanner.nextInt();

        if (revenue < 0 ^ revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        int commission;

        System.out.print("Enter CommissionClass: ");
        commission = scanner.nextInt();

        switch (commission){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Year: ");

        year = scanner.nextInt();
        if (((year % 4 == 0) & (year % 100 != 0)) ^ (year % 400 == 0)) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int reversedNumber = 0;
        int digit;

        System.out.print("Number: ");
        number = scanner.nextInt();

        for (;number != 0; number /= 10) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println(reversedNumber);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}