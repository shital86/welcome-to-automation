package automationtest;

import java.util.Scanner;

public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTime) {
        for (int i = 1; i <= howManyTime; i++) {
            System.out.println(name);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HowManyTime:");
        int howManyTime = scanner.nextInt();
        System.out.print("Enter your Name: ");
        String name = scanner.next();
        ForLoop_Q4 obj1 = new ForLoop_Q4();
        obj1.printMyName(name,howManyTime);

    }
}
