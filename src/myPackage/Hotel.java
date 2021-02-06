package myPackage;

import java.util.Scanner;

public class Hotel {
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

    public void nhapThongTinCanQuanLy() {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin khách trọ;
        nguoi = new Person();

        nguoi.nhapThongTinKhach();

        System.out.println("Nhap so ngay thue: ");
        soNgayTro = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap loai phong: ");
        loaiPhong = sc.nextLine();

        System.out.println("Nhap gia phong: ");
        giaPhong = sc.nextDouble();
    }

    public void hienThiThongTinKhach() {
        nguoi.hienThiThongTinKhach();

        System.out.println("So ngay thue: " + soNgayTro);

        System.out.println("Loai phong: " + loaiPhong);

        System.out.println("Gia phong: " + giaPhong);
    }

    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
