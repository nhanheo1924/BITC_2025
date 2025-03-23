import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //bai1
        String world = "nhanheosieudeotrai";
        System.out.println("Hello "+world);
        //bai2
        int a,b,c,d,e,f;
        a = 1;
        b = 2;
        c =3;
        d=4;
        e=5;
        f=6;
        System.out.println("so thu nhat "+ a + "\n" + "so thu hai "+b + "\n" +"so thu ba "+ c + "\n"+"so thu tu "+ + d + "\n" +"so thu nam "+ e + "\n"+"so thu sau " + f);
        //bai3
        int a1 = 3;
        int b1 = 6;
        int tong = a1 + b1; //:)))
        int hieu = a1 - b1;//:)))
        int tich = a1 * b1;
        float thuong = b1/a1;
        System.out.println( a1+ "\n" + b1+ "\n" + tong+"\n" +hieu+ "\n" +tich+"\n" +thuong);
        //bai4
        double r = 3;
        double sr= r*r*3.14;
        double cr = r*2*3.14;
        System.out.println("Dien tich hinh tron la: "+ sr);
        System.out.println("Chu vi hinh tron la: "+ cr);
        //bai5
        Scanner scn = new Scanner(System.in);
        System.out.println("Toi biet ban la ai");
        System.out.println("ban ten la "+(scn.nextLine()));
        System.out.println("ban "+(scn.nextInt())+"tuoi");

        System.out.println("Bat ngo khong cung :)))");



    }


}