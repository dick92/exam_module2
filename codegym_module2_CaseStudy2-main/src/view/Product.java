package view;

import model.products.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controller.products.ManageProduct.*;

public class Product {
    public void menuCategories() {
        System.out.println("1:Genuinephone");
        System.out.println("2:Mobilephone");
        System.out.println("5: Products");
        System.out.println("0: Thoát");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
           
            case 1:

                menuGenuinephone();

                break;
            case 2:

                menuMobilephone();

                break;
          
            case 5:
                menuProducts();
            case 0:
                System.exit(0);
            default:
                System.out.println("Vui lòng bạn nhập lại");
                menuCategories();
        }
    }

    private void menuMobilephone() {

    }

    private void menuGenuinephone() {
    }

    public static ArrayList<Products> listProduct;

    private void menuProducts() {
        System.out.println("Product");
        System.out.println("1: Thêm Product");
        System.out.println("2: Sửa Product");
        System.out.println("3: Xóa Product");
        System.out.println("4: Hiển thị Product");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addToProduct(listProduct);
                break;

            case 2:
                editMenuProduct();
                break;

            case 3:
                deleteMenuProduct();

                break;

            case 4:
                displayList();
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuProducts();
        }
    }

    private void editMenuProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần sửa");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập name cần sửa");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập price cần sửa");
        double price = scanner2.nextDouble();
        editProducts(id,name,price);
    }

    private void deleteMenuProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa");
        int id = scanner.nextInt();
        deleteProducts(id);
    }

    private void addToProduct(List<Products> list) {
        System.out.println("Nhập Id Product");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("Nhập Name Product");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("Nhập Price Product");
        Scanner scanner3 = new Scanner(System.in);
        double price = scanner3.nextDouble();
        checkProduct(id,name,price);

    }
    private void checkProduct(int id, String name, double price) {
        if (checkIDProduct(id)) {
            System.out.println("Đã có sản phẩm này");
        }else {
            System.out.println("Bạn đã đăng ký sản phẩm Laptop thành công");
            addProduct(new Products(id,name,price));
        }
        menuProducts();
    }




    





    private void menuSmartphone() {
        System.out.println("Genuinephone");
        System.out.println("1: Thêm Genuinephone");
        System.out.println("2: SửaGenuinephone");
        System.out.println("3: Xóa Genuinephone");
        System.out.println("4: Hiển thị Genuinephone");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;

            case 2:
                break;

          

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuSmartphone();
        }

    }

    private void menuSmartWatch() {
        System.out.println("Mobilephone");
        System.out.println("1: Thêm Mobilephone");
        System.out.println("2: Sửa Mobilephone");
        System.out.println("3: Xóa Mobilephone");
        System.out.println("4: Hiển thị Mobilephone");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;

            case 2:
                break;

           

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuSmartWatch();
        }

    }
   
        }

    
