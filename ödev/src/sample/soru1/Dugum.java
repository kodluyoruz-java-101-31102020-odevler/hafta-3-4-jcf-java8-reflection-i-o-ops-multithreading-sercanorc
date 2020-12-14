package sample.soru1;

public class Dugum<T> {
    public T Data;
    public Dugum Next;
    public Dugum() { }

    public Dugum(T data) {

        this.Data = data;
    }
    public void listele(){
        System.out.print(Data + " ");
    }
}
