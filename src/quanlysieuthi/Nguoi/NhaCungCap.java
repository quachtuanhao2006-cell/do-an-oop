package quanlysieuthi.Nguoi;

import java.util.Scanner;

public class NhaCungCap {
    private String maNCC;
    private String ten;
    private String sdt;
    private String diaChi;


    public NhaCungCap() {
    }


    public NhaCungCap(String maNCC, String ten, String sdt, String diaChi) {
        this.maNCC = maNCC;
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }


    public NhaCungCap(NhaCungCap other) {
        this.maNCC = other.maNCC;
        this.ten = other.ten;
        this.sdt = other.sdt;
        this.diaChi = other.diaChi;
    }


    public String getMaNCC() { return maNCC; }
    public void setMaNCC(String maNCC) { this.maNCC = maNCC; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public String getSdt() { return sdt; }
    public void setSdt(String sdt) { this.sdt = sdt; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }


    public void nhap() {
        Scanner sc = Input.sc;
        System.out.print("Nhap ma NCC: ");
        maNCC = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("| %-10s | %-20s | %-12s | %-30s |\n",
                          maNCC, ten, sdt, diaChi);
    }

}

