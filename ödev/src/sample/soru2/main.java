package sample.soru2;

import java.time.LocalDate;
import java.util.*;


public class main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Set<Book> set = new TreeSet<Book>();
        set.add(new Book("Satranç",70,"Zweig",now));
        set.add(new Book("Sefiller",80,"Hugo",now));
        set.add(new Book("Simyacı",90,"coleho",now));
        set.add(new Book("1984",40,"GeorgeOrvel",now));
        set.add(new Book("Suç ve Ceza",130,"Dostoyewski",now));


        printAll(set);

        System.out.println("*********************\nSayfa sayısı\n*********************");
        SayfaSayisi sayfaSayisi = new SayfaSayisi();

        Set<Book> set2 = new TreeSet<Book>(sayfaSayisi);
        set2.addAll(set);
        printAll(set2);

    }
    public static <T> void printAll(Set<T> set) {

        for(T item : set) {

            System.out.println(item);
        }
        System.out.println();
    }
}
