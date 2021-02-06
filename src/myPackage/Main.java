package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // Tạo 1 list lưu thông tin khách tro;
        ArrayList<Hotel> listKhach = new ArrayList<>();

        Hotel khach;
        int n; // Số khác trọ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong khach: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            khach = new Hotel();

            System.out.println("Nhap thong tin khach thu " + (i+1) + ":");
            khach.nhapThongTinCanQuanLy();

            listKhach.add(khach);
        }

        // Hàm hiển thị danh sách khách trọ;
        for (int i = 0; i < listKhach.size(); i++) {
            System.out.println("\n Thong tin cua khach thu " + (i+1) + ":");
            listKhach.get(i).hienThiThongTinKhach();
        }

        // Hàm tính tiền  CheckOut;
        System.out.println("Nhap so CMTND cua khach: ");
        String timId = sc.nextLine();

        for (int i = 0; i < listKhach.size(); i++) {
            if (listKhach.get(i).getNguoi().getSoCMND().equalsIgnoreCase(timId)) {
                System.out.println("So tien phong: " + listKhach.get(i).tinhTien());
            }
        }
    }
}
