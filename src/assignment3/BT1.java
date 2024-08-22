
package assignment3;
import java.util.Scanner;

public class BT1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Nhập tên: ");
        String ten = sc.nextLine();
    System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
    System.out.print("Năm Xinh: ");
        int nam = sc.nextInt();
    System.out.print("Giới tính: ");
        String gioitinh = sc.nextLine();
        sc.next();
    System.out.print("Chuyên ngành: ");
        String chuyennganh = sc.nextLine();
        sc.next();
    System.out.print("GPA: ");
        Float gpa = sc.nextFloat();
    System.out.print("Quê quán: ");
        String quequan = sc.nextLine();
        sc.next();
        /* xuất thông tin con người ra màn hình*/
        System.out.println("Thông tin của bạn: ");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: "+ tuoi);
        System.out.println("Năm xinh: "+ nam);
        System.out.println("Giới Tính: "+ gioitinh);
        System.out.println("Chuyên Ngành: "+ chuyennganh);
        System.out.println("GPA: "+ gpa);
        System.out.println("Quê Quán: "+ quequan);
    }
    
}

    

