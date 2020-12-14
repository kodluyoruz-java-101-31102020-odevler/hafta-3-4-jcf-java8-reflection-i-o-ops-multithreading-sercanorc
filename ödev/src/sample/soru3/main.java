package sample.soru3;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,ögrenci> ogrenciler = new HashMap<>();
        while (true){
            System.out.println("ögrenci numarası girin");
            int ögr_No= sc.nextInt();
            System.out.println("Bilgileri giriniz ad-soyad-yas-bolum");
            String ad = sc.next();
            String soyad = sc.next();
            int yas= sc.nextInt();
            String bolum = sc.next();
            ogrenciler.put(ögr_No,ögr(ad,soyad,yas,bolum));
            yaz(ogrenciler);
        }
    }

    private static void yaz(Map<Integer, ögrenci> ogrenciler) {
        for (Map.Entry<Integer,ögrenci> ögr: ogrenciler.entrySet()){
        int key = ögr.getKey();
        ögrenci value = ögr.getValue();
        System.out.println(key + " : " + value.bilgileriGetir());
    }
    }

    public static ögrenci ögr(String ad, String soyad, int yas, String bolum){
        ögrenci ö = new ögrenci(ad, soyad, yas, bolum);
        return ö;
    }

}
