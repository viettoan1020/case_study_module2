package view;

import java.io.IOException;
import java.util.Scanner;

import controller.BookManager;
import model.Book;

public class Home {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Xem toàn bộ sản phẩm");
            System.out.println("5. Ghi vào file");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập sản phẩm");
                    scanner.nextLine();
                    System.out.println("1. ID sản phẩm: ");
                    String bookId = scanner.nextLine();
                    System.out.println("2. Tiêu đề: ");
                    String titleBook = scanner.nextLine();
                    System.out.println("3. Tác giả: ");
                    String authorBook = scanner.nextLine();
                    System.out.println("4. Nhà xuất bản: ");
                    String publisher = scanner.nextLine();
                    System.out.println("5. Giá : ");
                    Double price = scanner.nextDouble();
                    System.out.println("6. Số lượng: ");
                    int quantity = scanner.nextInt();
                    System.out.println("7. Năm xuất bản: ");
                    int yearPublished = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("8. Thể loại: ");
                    String genre = scanner.nextLine();
                    bookManager.addBook(bookId, titleBook, authorBook, publisher, price, quantity, yearPublished,
                            genre);
                    System.out.println("Thêm sản phẩm thành công");
                    break;
                case 2:
                    System.out.println("Nhập sản phẩm cần sửa");
                    System.out.println("1. ID sản phẩm: ");
                    scanner.nextLine();
                    String bookId1 = scanner.nextLine();
                    System.out.println("2. Tiêu đề: ");
                    String titleBook1 = scanner.nextLine();
                    System.out.println("3. Tác giả: ");
                    String authorBook1 = scanner.nextLine();
                    System.out.println("4. Nhà xuất bản: ");
                    String publisher1 = scanner.nextLine();
                    System.out.println("5. Giá : ");
                    Double price1 = scanner.nextDouble();
                    System.out.println("6. Số lượng: ");
                    int quantity1 = scanner.nextInt();
                    System.out.println("7. Năm xuất bản: ");
                    int yearPublished1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("8. Thể loại: ");
                    String genre1 = scanner.nextLine();
                    bookManager.editBook(bookId1, titleBook1, authorBook1, publisher1, choice, quantity1,
                            yearPublished1, genre1);
                    System.out.println("Sửa sản phẩm thành công");
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm cần xoá");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    System.out.println("ID " + id);
                    bookManager.deleteBook(id);
                    System.out.println("Xoá sản phẩm thành công");
                    break;
                case 4:
                    System.out.println("-------------------------- Danh sách sản phẩm --------------------------");
                    bookManager.displayAllItems();
                    break;
                case 5:
                    try {
                        bookManager.writeFile();
                        System.out.println("Ghi vào file thành công");
                    } catch (IOException e) {
                        System.out.println("Ghi vào file không thành công");
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Đang thoát...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }

}