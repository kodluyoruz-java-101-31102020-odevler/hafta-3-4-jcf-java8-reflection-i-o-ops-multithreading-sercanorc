package sample.soru5;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws IOException {

        LocalDate now = LocalDate.now();
        List<Book> list= new ArrayList<Book>();
        list.add(new Book("Satranç",70,"Zweig",now));
        list.add(new Book("Sefiller",180,"Hugo",now));
        list.add(new Book("Simyacı",290,"coleho",now));
        list.add(new Book("1984",40,"GeorgeOrvel",now));
        list.add(new Book("Suç ve Ceza",130,"Dostoyewski",now));
        list.add(new Book("Tavla",70,"Zweig",now));
        list.add(new Book("Zenginler",80,"Hugo",now));
        list.add(new Book("Kimyacı",90,"coleho",now));
        list.add(new Book("1987",140,"GeorgeOrvel",now));
        list.add(new Book("Güç ve Ceza",130,"Dostoyewski",now));
        Map<String,String> map = new HashMap<String, String>();

        list.stream().forEach(s ->
                map.put(s.getKitapismi(),s.getYazarİsmi())
        );

        for (Map.Entry<String,String> entry: map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        list.stream().filter(s -> s.getSayfaSayisi()> 100 ).forEach(s -> System.out.println(s.toString()));

    }
}
