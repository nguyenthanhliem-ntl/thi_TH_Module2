package company;


import data.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
        Manager manager = new Manager();
        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng theo số (để tiếp tục): \n" +
                    "1. Xem danh bạ \n" +
                    "2. Thêm mới \n" +
                    "3. Cập nhật \n" +
                    "4. Xóa \n" +
                    "5. Tìm kiếm \n" +
                    "7. Đọc từ file \n" +
                    "8. Ghi từ file \n" +
                    "9. Thoát");
            int choose = number.nextInt();
            switch (choose) {
                case 1:
                    manager.showMesseger();
                    break;
                case 2:
                    manager.addMesseger();
                    break;
                case 3:
                    System.out.println("Mời bạn nhập số điện thoại update: ");
                    manager.updateMesseger(number.nextLine());
                    break;
                case 4:
                    System.out.println("Mời bạn nhập số điện thoại cần xóa: ");
                    manager.deleteMesseger(number.next());
                    break;
                case 5:
                    System.out.println("Mời bạn nhập số điện thoại cần tìm: ");
                    manager.findMesseger(number.next());
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chức năng ! mời bạn chọn lại ");
                    break;



            }
        }

    }

}
