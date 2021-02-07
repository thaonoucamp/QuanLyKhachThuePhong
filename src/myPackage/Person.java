package myPackage;

import java.util.Scanner;

public class Person {
    // Lớp người có những đặc điểm cơ bản;
    private String hoTen;
    private String soCMND;
    private String queQuan;

    public Person() {
    }

    public Person(String hoTen, String soCMND, String queQuan) {
        this.hoTen = hoTen;
        this.soCMND = soCMND;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }

    // Hàm nhập thông tin cơ bản;
    public void nhapThongTinKhach() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ho ten Khach: ");
        hoTen = sc.nextLine();

        System.out.println("Nhap queQuan: ");
        queQuan = sc.nextLine();

        System.out.println("Nhap so CMTND: ");
        soCMND = sc.nextLine();
    }

    // Hàm hiển thị thông tin cơ bản;
    public void hienThiThongTinKhach() {
        System.out.println("Ho va Ten: " + hoTen);
        System.out.println("Que quan: " + queQuan);
        System.out.println("So CMTND: " + soCMND);
    }
}
