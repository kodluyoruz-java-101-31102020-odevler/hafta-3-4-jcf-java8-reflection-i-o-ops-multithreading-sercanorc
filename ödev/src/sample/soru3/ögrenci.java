package sample.soru3;

public class ögrenci {
    String ad;
    String soyad;
    int yas;
    String bolum;

    public ögrenci(String ad, String soyad, int yas, String bolum) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.bolum = bolum;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String bilgileriGetir() {
        return (ad + " | " + soyad + " | " + yas + " | " + bolum);
    }
}
