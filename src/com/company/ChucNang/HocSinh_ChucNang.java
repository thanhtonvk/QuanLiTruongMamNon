package com.company.ChucNang;

import com.company.DoiTuong.Hocsinh;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh_ChucNang {
    static Scanner scanner = new Scanner(System.in);
    public void NhapHocSinh(ArrayList<Hocsinh>hocsinhs){
        while(true){
            Hocsinh hocsinh = new Hocsinh();
            hocsinh.Nhap();
            hocsinhs.add(hocsinh);
            System.out.println("Bạn muốn nhập tiếp không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k"))break;
        }
    }
    public void hien(Hocsinh hocsinh){
        System.out.printf("|%-15s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n",hocsinh.getMa(),hocsinh.getTen(),hocsinh.getLop(),hocsinh.getGioitinh(),hocsinh.getNgaysinh(),hocsinh.getQuequan(),hocsinh.getCogiao());
    }
    public  void HienHocSinh(ArrayList<Hocsinh>hocSinhs){
        System.out.printf("|%-15s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã học sinh","Tên học sinh","Lớp","Giới tính","Ngày sinh","Quê quán","Cô giáo");
        for (Hocsinh hocsinh:hocSinhs
             ) {
            hien(hocsinh);
        }
    }
    public Hocsinh hocsinh(ArrayList<Hocsinh>hocsinhs){
        System.out.println("Nhập tên họăc mã học sinh: ");
        String ten = scanner.nextLine();
        Hocsinh kq = null;
        for (Hocsinh hocsinh:hocsinhs
             ) {
            if(ten.equalsIgnoreCase(hocsinh.getTen())||ten.equalsIgnoreCase(hocsinh.getMa())){
                kq = hocsinh;
            }
        }
        return kq;
    }
    public void TimKiem(ArrayList<Hocsinh>hocsinhs){
        Hocsinh hocsinh = hocsinh(hocsinhs);
        if(hocsinh==null){
            System.out.println("Không tìm thấy");
        }
        else {
            hien(hocsinh);
        }
    }
    public void CapNhat(ArrayList<Hocsinh>hocsinhs){
        Hocsinh hocsinh = hocsinh(hocsinhs);
        if(hocsinh==null){
            System.out.println("Không tìm thấy");
        }
        else {
            hocsinh.Nhap();
            System.out.println("Nhập thành công");
        }
    }
    public void Xoa(ArrayList<Hocsinh>hocsinhs){
        Hocsinh hocsinh = hocsinh(hocsinhs);
        if(hocsinh==null){
            System.out.println("Không tìm thấy");
        }
        else {
            hocsinhs.remove(hocsinh);
        }
    }
}
