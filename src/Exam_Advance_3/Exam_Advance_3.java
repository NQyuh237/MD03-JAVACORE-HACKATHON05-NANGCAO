package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    public static void main(String[] args) {
        Queue<String> phuHuynhQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên phụ huynh: ");
                    String tenPhuHuynh = scanner.nextLine();
                    phuHuynhQueue.offer(tenPhuHuynh);
                    break;
                case 2:
                    if (!phuHuynhQueue.isEmpty()) {
                        String phuHuynhDauTien = phuHuynhQueue.poll();
                        System.out.println("Phụ huynh đầu tiên: " + phuHuynhDauTien);
                    } else {
                        System.out.println("Danh sách phụ huynh trống.");
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
