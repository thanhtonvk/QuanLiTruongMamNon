package com.company.DoiTuong;

import java.util.Scanner;

public class Nguoi {
    private String ma,ten,quequan,ngaysinh;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã: ");
        ma = scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        ten = scanner.nextLine();
        System.out.println("Nhập quê quán: ");
        quequan = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaysinh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return ma+"#"+ten+"#"+quequan+"#"+ngaysinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Nguoi(String ma, String ten, String quequan, String ngaysinh) {
        this.ma = ma;
        this.ten = ten;
        this.quequan = quequan;
        this.ngaysinh = ngaysinh;
    }
    public Nguoi(){

    }
}
