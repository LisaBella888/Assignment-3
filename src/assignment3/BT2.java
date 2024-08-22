
package assignment3;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi ký tự: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("Chuỗi bạn nhập là: " + input);
        } else {
            System.out.println("Không phải chuỗi ký tự!");
        }
    }
}