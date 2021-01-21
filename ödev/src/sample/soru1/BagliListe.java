package sample.soru1;

public class BagliListe<T> {
    public Dugum Top;
    public int Boyut = 0;
    public void basaEkle(T value) {
        Dugum temp = new Dugum(value);

        if (Top == null)
            Top = temp;
        else {
            temp.Next = Top;
            Top = temp;
        }
        Boyut++;
    }
    public void sonaEkle(T value) {
        Dugum temp = new Dugum(value);

        if (Top == null)
            Top = temp;
        else {
            Dugum sayac = Top;
            while (sayac.Next != null)
                sayac = sayac.Next;
            sayac.Next = temp;
        }
        Boyut++;
    }
    public void delete(int pozisyon) {
        if (pozisyon > Boyut || pozisyon < 0) {
            throw new IndexOutOfBoundsException("Hatalı Pozisyon!");
        }
        else if (pozisyon == 1)
            System.out.println("bas");// basiSil();
        else {
            Dugum sayac = Top;
            Dugum temp = new Dugum();
            for (int i = 1; i < pozisyon - 1; i++) {
                if (sayac.Next != null)
                    sayac = sayac.Next;
            }
            temp = sayac;
            sayac = sayac.Next;
            temp.Next = sayac.Next;
            sayac = null;
            Boyut--;
        }
    }
    public void pozisyonaEkle(int pozisyon, T value) {
        Dugum temp = new Dugum(value);

        if (pozisyon > Boyut || pozisyon < 0) {
            throw new IndexOutOfBoundsException("Hatalı Pozisyon!");
        }
        else if (pozisyon == 1)
            basaEkle(value);
        else {
            Dugum sayac = Top;
            for (int i = 1; i < pozisyon - 1; i++) {
                if (sayac.Next != null)
                    sayac = sayac.Next;
            }
            temp.Next = sayac.Next;
            sayac.Next = temp;
        }
        Boyut++;
    }
    public void yazdir() {
        System.out.print("Liste : ");
        Dugum aktif = Top;
        while (aktif != null)
        {
            aktif.listele();
            aktif = aktif.Next;
        }
        System.out.println("");
    }
}
