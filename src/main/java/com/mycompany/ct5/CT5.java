package com.mycompany.ct5;
import java.util.Scanner;

// Lớp cha: NhanVien
class NhanVien {
    protected String ten;
    protected int soGioLam;

    public NhanVien(String ten, int soGioLam) {
        this.ten = ten;
        this.soGioLam = soGioLam;
    }

    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhap ten nhan vien: ");
        ten = scanner.nextLine();
        System.out.print("Nhap so gio lam viec: ");
        soGioLam = Integer.parseInt(scanner.nextLine());
    }

    public double tinhLuong() {
        return 0; // Sẽ override ở lớp con
    }

    public void hienThiLuong() {
        System.out.println("Ten: " + ten + " | Luong: " + tinhLuong() + " VND/giờ");
    }
}

// Lớp con: Nhân viên toàn thời gian
class NhanVienToanThoiGian extends NhanVien {
    private final double luongMotGio = 50000;

    public NhanVienToanThoiGian() {
        super("", 0);
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongMotGio;
    }
}

// Lớp con: Nhân viên bán thời gian
class NhanVienBanThoiGian extends NhanVien {
    private final double luongMotGio = 30000;

    public NhanVienBanThoiGian() {
        super("", 0);
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongMotGio;
    }
}

// Main class
public class CT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin cho nhan vien toan thoi gian: ");
        NhanVienToanThoiGian nvToanThoiGian = new NhanVienToanThoiGian();
        nvToanThoiGian.nhapThongTin(scanner);

        System.out.println("\nNhap thong tin cho nhan vien ban thoi gian: ");
        NhanVienBanThoiGian nvBanThoiGian = new NhanVienBanThoiGian();
        nvBanThoiGian.nhapThongTin(scanner);

        System.out.println("\nBang luong");
        nvToanThoiGian.hienThiLuong();
        nvBanThoiGian.hienThiLuong();
    }
}
