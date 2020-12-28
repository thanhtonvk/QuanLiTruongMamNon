package com.company.DoiTuong;

import java.util.Scanner;

public class Hocsinh extends Nguoi {
    private String lop,cogiao,gioitinh;

    public Hocsinh(String ma, String ten, String quequan, String ngaysinh, String lop, String cogiao, String gioitinh) {
        super(ma, ten, quequan, ngaysinh);
        this.lop = lop;
        this.cogiao = cogiao;
        this.gioitinh = gioitinh;
    }

    public Hocsinh() {
        super();
    }

    @Override
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhập lớp: ");
        lop = scanner.nextLine();
        System.out.println("Nhập cô giáo: ");
        cogiao = scanner.nextLine();
        System.out.println("Nhập giới tính");
        gioitinh = scanner.nextLine();
    }
    @Override
    public String toString(){
        return super.toString()+"#"+lop+"#"+cogiao+"#"+gioitinh+"#"+"\n";
    }
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getCogiao() {
        return cogiao;
    }

    public void setCogiao(String cogiao) {
        this.cogiao = cogiao;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
}
