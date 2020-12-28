package com.company.File;

import com.company.DoiTuong.Hocsinh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Hocsinh_IO {
    File file = new File("hocsinh.txt");

    public void docFile(ArrayList<Hocsinh> hocsinhs) {
        try {
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] arr = line.split("#");
                    hocsinhs.add(new Hocsinh(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]));
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void ghiFile(ArrayList<Hocsinh> hocsinhs) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (Hocsinh hocsinh : hocsinhs
            ) {
                fileWriter.write(hocsinh.toString());
            }
            fileWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
