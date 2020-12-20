/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObject;

/**
 *
 * @author USER
 */
public class kendaraan {
     // atribut -- variabel
    String BBM;
    int kapasitaspenumpang;
    String Warna;
    String Ukuran;
    
    //method -- fungsi
    //method void -- prosedur
    void setkendaraan(){
        BBM = "Bensin";
        kapasitaspenumpang = 4;
        Warna = "Putih";
        Ukuran = "Sedang";
    }
    //method non void -- fungsi
    String maju(){
        return "Hidupkan Mobil, Injak Kopling, Masukan Gigi, Injak Gas";  
    }
    
    //membuat main() di java
    public static void main(String[]args)   // main yang ada di java
    {
        kendaraan xpander;
        xpander = new kendaraan(); //object 1 dengan nama xpander
        kendaraan Rush;
        Rush = new kendaraan(); //object 2 dengan nama Toyota (Rush)
        xpander.setkendaraan(); //menjalankan method setKendaraan()     
        System.out.println("BBM xpander = "+xpander.BBM);
        System.out.println("Kapasitas Penumpang = "+xpander.kapasitaspenumpang);
        System.out.println("Warna Mobil = "+xpander.Warna);
        System.out.println("Ukuran Mobil = "+xpander.Ukuran);
        System.out.println("=================================================");
        Rush.setkendaraan(); //menjalankan method setKendaraan()
        System.out.println("BBM Rush = "+Rush.BBM);
        System.out.println("Kapasitas Penumpang = "+Rush.kapasitaspenumpang);
        System.out.println("Warna Mobil = "+Rush.Warna);
        System.out.println("Ukuran Mobil = "+Rush.Ukuran);
    }
}
