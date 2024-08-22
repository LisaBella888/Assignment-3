
package assignment3;

import java.util.Scanner;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Số bạn nhập là: " + number);
        } else {
            System.out.println("Không phải số nguyên!");
        }
    }
}