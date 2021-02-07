package myPackage;

import java.util.Scanner;

public class Hotel {

    // Lớp khách sạn có đặc điểm cơ bản và có đối tượng Người;
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Person nguoi;

    public Hotel() {
    }

    public Hotel(int soNgayTro, String loaiPhong, double giaPhong, Person nguoi) {
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public Person getNguoi() {
        return nguoi;
    }

    public void setNguoi(Person nguoi) {
        this.nguoi = nguoi;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "soNgayTro=" + soNgayTro +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", giaPhong=" + giaPhong +
                ", nguoi=" + nguoi +
                '}';
    }

    // Hàm nhập các thông tin cần quản lý của khách sạn;
    public void nhapThongTinCanQuanLy() {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo đối tượng Người trong lớp khách sạn để quản lý;
        nguoi = new Person();

        // Nhập thông tin khách trọ;
        nguoi.nhapThongTinKhach();

        System.out.println("Nhap so ngay thue: ");
        soNgayTro = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap loai phong: ");
        loaiPhong = sc.nextLine();

        System.out.println("Nhap gia phong: ");
        giaPhong = sc.nextDouble();
    }

    // Hàm hiển thị thông tin của khách;
    public void hienThiThongTinKhach() {
        nguoi.hienThiThongTinKhach();

        System.out.println("So ngay thue: " + soNgayTro);

        System.out.println("Loai phong: " + loaiPhong);

        System.out.println("Gia phong: " + giaPhong);
    }

    // Hàm tính tiền khi Khách CheckOut;
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
