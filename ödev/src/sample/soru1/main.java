package sample.soru1;

public class main {
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();

        liste.basaEkle(11); //Başa ekleme yapıyoruz
        liste.basaEkle(3);
        liste.basaEkle(77);
        liste.sonaEkle(33);
        liste.sonaEkle(44);
        liste.sonaEkle(55);

        liste.yazdir();

        liste.delete(2);
        liste.yazdir();

        liste.pozisyonaEkle(3,22);

        liste.yazdir();
    }
}
