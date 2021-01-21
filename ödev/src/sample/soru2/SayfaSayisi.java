package sample.soru2;

import java.util.Comparator;

public class SayfaSayisi implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int book1SayfaSayisi = o1.getSayfaSayisi();
        int book2SayfaSayisi = o2.getSayfaSayisi();

        if(book1SayfaSayisi > book2SayfaSayisi) {
            return -1;
        }
        else if(book1SayfaSayisi > book2SayfaSayisi) {
            return 1;
        }
        else
            return 0;
    }
}
