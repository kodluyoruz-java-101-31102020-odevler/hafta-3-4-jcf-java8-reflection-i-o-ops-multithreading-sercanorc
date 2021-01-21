package sample.soru6;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        oku();
        yaz();
        oku();
    }

    private static void yaz() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bilgileri giriniz no-ad-soyad-yas-bolum");
        int ögr_No= sc.nextInt();
        String ad = sc.next();
        String soyad = sc.next();
        int yas= sc.nextInt();
        String bolum = sc.next();
        ögrenci ögrenci=new ögrenci(ögr_No,ad,soyad,yas,bolum);
        String yazilacak=ögrenci.bilgileriGetir();
        File file = new File("ögr.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(yazilacak);
        bWriter.close();
    }

    private static void oku() throws IOException {
        String satir = null;
        ögrenci ögr= null;
        List<ögrenci> list =new ArrayList<ögrenci>();
        InputStream elemanlar = new FileInputStream("ögr.txt");
        InputStreamReader eOkuyucu = new InputStreamReader(elemanlar);
        BufferedReader okuyucu = new BufferedReader(eOkuyucu);

        while ((satir = okuyucu.readLine()) != null) {
            String[] eklenenKisi = satir.split(", ");
            ögr = new ögrenci(Integer.parseInt(eklenenKisi[0]),
                    eklenenKisi[1], eklenenKisi[2],
                    Integer.parseInt(eklenenKisi[3]), eklenenKisi[4]);
            list.add(ögr);
        }

        for (ögrenci ögrenci : list) {
            System.out.println(ögrenci.bilgileriGetir());
        }


    }
}
