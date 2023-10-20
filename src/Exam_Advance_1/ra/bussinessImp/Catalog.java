package Exam_Advance_1.ra.bussinessImp;

import java.util.Scanner;
import Exam_Advance_1.ra.bussiness.IShop;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private Boolean catalogStatus;
    public Catalog() {
        catalogId = 0;
        catalogName = "";
        priority = 0;
        descriptions = "";
        catalogStatus = true;
    }
    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã danh mục sản phẩm: ");
        catalogId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên danh mục sản phẩm: ");
        catalogName = scanner.nextLine();

        System.out.print("Nhập độ ưu tiên: ");
        priority = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập mô tả danh mục: ");
        descriptions = scanner.nextLine();

        System.out.print("Nhập trạng thái danh mục (true/false): ");
        catalogStatus = scanner.nextBoolean();
    }

    public void displayData() {
        System.out.println("Mã danh mục: " + catalogId);
        System.out.println("Tên danh mục sản phẩm: " + catalogName);
    }
}
