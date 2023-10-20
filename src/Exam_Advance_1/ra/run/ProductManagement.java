package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalog> catalogs = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số danh mục sản phẩm: ");
                    int numCatalogs = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numCatalogs; i++) {
                        Catalog catalog = new Catalog();
                        catalog.inputData(scanner);
                        catalogs.add(catalog);
                    }
                    break;

                case 2:
                    System.out.print("Nhập số sản phẩm: ");
                    int numProducts = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numProducts; i++) {
                        Product product = new Product();
                        product.inputData(scanner, catalogs);
                        products.add(product);
                    }
                    break;

                case 3:
                    Collections.sort(products, new Comparator<Product>() {
                        @Override
                        public int compare(Product p1, Product p2) {
                            return Float.compare(p1.getExportPrice(), p2.getExportPrice());
                        }
                    });
                    for (Product product : products) {
                        product.displayData();
                    }
                    break;

                case 4:
                    System.out.print("Nhập tên danh mục sản phẩm cần tìm: ");
                    String categoryName = scanner.nextLine();
                    for (Product product : products) {
                        if (product.getCatalog().getCatalogName().equalsIgnoreCase(categoryName)) {
                            product.displayData();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
