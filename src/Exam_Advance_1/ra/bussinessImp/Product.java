package Exam_Advance_1.ra.bussinessImp;

import java.util.Scanner;
import Exam_Advance_1.ra.bussiness.IShop;
import java.util.List;
public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private Boolean productStatus;

    public Product() {
        productId = 0;
        productName = "";
        title = "";
        descriptions = "";
        catalog = null;
        importPrice = 0.0f;
        exportPrice = 0.0f;
        productStatus = true;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm: ");
        productId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        productName = scanner.nextLine();

        System.out.print("Nhập tiêu đề sản phẩm: ");
        title = scanner.nextLine();

        System.out.print("Nhập mô tả sản phẩm: ");
        descriptions = scanner.nextLine();

        System.out.print("Nhập giá nhập sản phẩm: ");
        importPrice = scanner.nextFloat();

        exportPrice = importPrice * RATE;

        System.out.println("Danh sách danh mục sản phẩm có sẵn:");
        for (Catalog cat : catalogs) {
            cat.displayData();
        }

        System.out.print("Chọn mã danh mục cho sản phẩm: ");
        int selectedCatalogId = scanner.nextInt();
        scanner.nextLine();

        for (Catalog cat : catalogs) {
            if (cat.getCatalogId() == selectedCatalogId) {
                catalog = cat;
                break;
            }
        }

        System.out.print("Nhập trạng thái sản phẩm (true/false): ");
        productStatus = scanner.nextBoolean();
    }
    public void inputData(Scanner scanner, List<Catalog> catalogs) {
        this.catalogs = catalogs;
        inputData(scanner);
    }
    public void displayData() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Tên danh mục sản phẩm: " + catalog.getCatalogName());
        System.out.println("Giá bán sản phẩm: " + exportPrice);
        System.out.println("Trạng thái: " + (productStatus ? "Đang bán" : "Ngừng bán"));
    }
    private static List<Catalog> catalogs;

    public static void setCatalogs(List<Catalog> catalogs) {
        Product.catalogs = catalogs;
    }
}
