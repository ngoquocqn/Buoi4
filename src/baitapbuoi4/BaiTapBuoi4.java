package baitapbuoi4;

import java.util.Scanner;


public class BaiTapBuoi4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();
        
        if(a != 0)
        {
            System.out.println("Phuong trinh co nghiem x = "+ -b/a);
        }
        else if(a == 0 && b == 0){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else
            System.out.println("Phuong trinh vo nghiem");
    }
}
