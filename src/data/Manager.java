package data;

import service.Messeger;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Messeger> messegerList = new ArrayList<>();

    //  thêm mới
    public void addMesseger() {
        System.out.println(" Nhập thông tin người mới: ");
        Scanner thongtin = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        String name = thongtin.nextLine();
        System.out.println("Số điện thoại: ");
        String phone;
        do {
            phone = thongtin.next();
            if (!checkPhone(phone))
                System.out.println("Số điện thoại đã tồn tại mời nhập lại");
            continue;
        } while (!checkPhone(phone));
        System.out.println("Địa chỉ: ");
        Scanner thongtin2 = new Scanner(System.in);
        String address = thongtin2.nextLine();
        System.out.println("Email: ");
        Scanner thongtin3 = new Scanner(System.in);
        String email = thongtin3.nextLine();
        System.out.println("Facebook: ");
        Scanner thongtin4 = new Scanner(System.in);
        String facebook = thongtin4.nextLine();
        System.out.println("Giới tính: ");
        Scanner thongtin6 = new Scanner(System.in);
        String gender = thongtin6.nextLine();
        Messeger messeger = new Messeger(name, phone, address, email, facebook, gender);
        messegerList.add(messeger);
    }

    // Xem thông tin
    public void showMesseger() {
        System.out.println(messegerList + "\n");
    }

    //cập nhật
    public void updateMesseger(String phone) {
        int i = 0;
        for (Messeger edit : messegerList
        ) {
            if (edit.getPhone().equals(phone)) {
                System.out.println(" Nhập thông tin người mới: ");
                Scanner dead = new Scanner(System.in);
                System.out.println("Mời bạn nhập tên: ");
                String newName = dead.nextLine();
                edit.setName(newName);
                System.out.println("Số điện thoại: ");
                Scanner dead1 = new Scanner(System.in);
                String newPhone = dead1.nextLine();
                edit.setPhone(newPhone);
                System.out.println("Địa chỉ: ");
                Scanner dead2 = new Scanner(System.in);
                String newAddress = dead2.nextLine();
                edit.setAddress(newAddress);
                System.out.println("Email: ");
                Scanner dead3 = new Scanner(System.in);
                String newEmail = dead3.nextLine();
                edit.setEmail(newEmail);
                System.out.println("Facebook: ");
                Scanner dead4 = new Scanner(System.in);
                String newFacebook = dead4.nextLine();
                edit.setFacebook(newFacebook);
                System.out.println("Giới tính: ");
                Scanner dead5 = new Scanner(System.in);
                String newGender = dead5.nextLine();
                edit.setGender(newGender);
                System.out.println("Đã xong!");
                i++;
            }
            if (i == 0) {
                System.out.println(" Cập nhật không thành công!");
            }
        }
    }

    // Xóa
    public void deleteMesseger(String phone) {
        for (int i = 0; i < messegerList.size(); i++) {
            if (messegerList.get(i).getPhone().equals(phone)) {
                messegerList.remove(i);
            }
        }
    }

    //tìm danh bạ theo số điện thoại
    public Messeger findMesseger(String phone){
        Messeger telephoneDirectory = null;
        for ( Messeger d: messegerList
        ) {
            if(d.getPhone().equals(phone))
                telephoneDirectory = d;

        }
        return telephoneDirectory;
    }
//check phone trùng
    private boolean checkPhone(String phone) {
        boolean check = true;
        for (Messeger checker : messegerList
        ) {
            if (checker.getPhone().equals(phone)) check = false;
        }
        return check;
    }
}
