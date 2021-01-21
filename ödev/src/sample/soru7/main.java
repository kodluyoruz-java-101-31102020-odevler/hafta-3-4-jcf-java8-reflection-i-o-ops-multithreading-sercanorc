package sample.soru7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class main {

    public static void main(String[] args) {
        List<Integer> tempArray = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            tempArray.add(i + 1);
        }

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        int first = 0, second = 2500;
        for (int i = 0; i < 4; i++) {
            tekCift tekCift=new tekCift(tempArray.subList(first, second));
            first += 10;
            second += 10;
            threadPoolExecutor.execute(tekCift);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()) {

        }System.out.println("Tek Sayılar ");
        tekCift.tekListesi.stream().forEach(number -> System.out.println(number));
        System.out.println("---------------- ");
        System.out.println("Çift Sayılar ");
        tekCift.ciftListesi.stream().forEach(number -> System.out.println(number));
        System.out.println("Tek eleman sayısı : " + tekCift.tekListesi.size());
        System.out.println("Çift eleman sayısı : " + tekCift.ciftListesi.size());


    }

}
