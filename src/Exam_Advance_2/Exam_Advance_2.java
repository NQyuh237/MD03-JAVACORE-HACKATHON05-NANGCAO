package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    public static void main(String[] args) {
        Stack<String> wordStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập câu: ");
                    sentence = scanner.nextLine();
                    break;
                case 2:
                    if (!sentence.isEmpty()) {
                        String[] words = sentence.split(" ");
                        for (String word : words) {
                            wordStack.push(word);
                        }

                        StringBuilder reversedSentence = new StringBuilder();
                        while (!wordStack.isEmpty()) {
                            reversedSentence.append(wordStack.pop()).append(" ");
                        }

                        System.out.println("Câu đảo ngược: " + reversedSentence.toString().trim());
                    } else {
                        System.out.println("Vui lòng nhập câu trước.");
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}