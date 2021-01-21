package sample.soru2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {
    String kitapismi;
    int sayfaSayisi;
    String yazarİsmi;
    LocalDate yayinTarihi;

    public Book(String kitapismi, int sayfaSayisi, String yazarİsmi, LocalDate yayinTarihi) {
        this.kitapismi = kitapismi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarİsmi = yazarİsmi;
        this.yayinTarihi = yayinTarihi;
    }

    public String getKitapismi() {
        return kitapismi;
    }

    public void setKitapismi(String kitapismi) {
        this.kitapismi = kitapismi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazarİsmi() {
        return yazarİsmi;
    }

    public void setYazarİsmi(String yazarİsmi) {
        this.yazarİsmi = yazarİsmi;
    }

    public LocalDate getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(LocalDate yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    @Override
    public int compareTo(Book o) {

        return this.getKitapismi().compareTo(o.getKitapismi());
       /* if (o.getKitapismi().compareTo(this.getKitapismi()) == 0) {
            return 0;
        } else {
            return o.getKitapismi().compareTo(this.getKitapismi()) < 0 ? 1 : -1;
        }*/
    }

    @Override
    public String toString() {
        return "kitapismi='" + kitapismi + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", yazarİsmi='" + yazarİsmi + '\'' +
                ", yayinTarihi=" + yayinTarihi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return sayfaSayisi == book.sayfaSayisi &&
                Objects.equals(kitapismi, book.kitapismi) &&
                Objects.equals(yazarİsmi, book.yazarİsmi) &&
                Objects.equals(yayinTarihi, book.yayinTarihi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kitapismi, sayfaSayisi, yazarİsmi, yayinTarihi);
    }
}
