package com.company;

import com.company.ChucNang.HocSinh_ChucNang;
import com.company.DoiTuong.Hocsinh;
import com.company.File.Hocsinh_IO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HocSinh_ChucNang hocSinh_chucNang = new HocSinh_ChucNang();
        Hocsinh_IO hocsinh_io = new Hocsinh_IO();
        ArrayList<Hocsinh> hocsinhs = new ArrayList<>();
        hocsinh_io.docFile(hocsinhs);
        int chon;
        // write your code here
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("|          QUẢN LÝ TRƯỜNG MẦM NON HOA ANH ĐÀO             |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|              1. Nhập thông tin                          |");
            System.out.println("|              2. Hiện thông tin                          |");
            System.out.println("|              3. Cập nhật thông tin                      |");
            System.out.println("|              4. Xóa thông tin                           |");
            System.out.println("|              5. Tìm kiếm                                |");
            System.out.println("|              0. Thoát                                   |");
            System.out.println("-----------------------------------------------------------");
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    hocSinh_chucNang.NhapHocSinh(hocsinhs);
                    hocsinh_io.ghiFile(hocsinhs);
                    break;
                case 2:
                    hocSinh_chucNang.HienHocSinh(hocsinhs);
                    break;
                case 3:
                    hocSinh_chucNang.CapNhat(hocsinhs);
                    hocsinh_io.ghiFile(hocsinhs);
                    break;
                case 4:
                    hocSinh_chucNang.Xoa(hocsinhs);
                    hocsinh_io.ghiFile(hocsinhs);
                    break;
                case 5:
                    hocSinh_chucNang.TimKiem(hocsinhs);
                    break;
                default:
                    break;
            }
        }
    }
}
