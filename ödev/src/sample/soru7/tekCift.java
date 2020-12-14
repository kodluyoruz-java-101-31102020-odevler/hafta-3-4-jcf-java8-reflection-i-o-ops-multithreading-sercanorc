package sample.soru7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class tekCift implements Runnable {

    private List<Integer> tempArrayList;
    static List<Integer> tekListesi = new ArrayList<>();
    static List<Integer> ciftListesi = new ArrayList<>();

    public tekCift(List<Integer> tempArrayList) {
        this.tempArrayList = tempArrayList;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        synchronized (this) {
            for (int i = 0; i < tempArrayList.size(); i++) {
                if (tempArrayList.get(i) % 2 == 0) {
                    ekle(ciftListesi, tempArrayList.get(i));
                    System.out.println(tempArrayList.get(i) + " -> sayısı çift");
                } else {
                    ekle(tekListesi, tempArrayList.get(i));
                    System.out.println(tempArrayList.get(i) + " -> sayısı tek");
                }
                sleep(10);
            }
        }
    }
    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void ekle(List<Integer> list, int element) {
        list.add(element);
    }

}
