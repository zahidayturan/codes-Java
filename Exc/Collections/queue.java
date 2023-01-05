import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue <String> kuyruk = new LinkedList<String>();
        //System.out.println(kuyruk.element());  //İlk eleman yok, hata verir.
        System.out.println(kuyruk.peek());       //İlk eleman yok, hata vermez. NULL döner.
        kuyruk.offer("Ayşe");
        kuyruk.offer("Fatma");
        kuyruk.offer("Hatice");
        kuyruk.offer("İsmail");
        System.out.println(kuyruk.element());   //İlk elemanı döner = Ayşe
        System.out.println(kuyruk.peek());      //İlk elemanı döner = Ayşe
        System.out.println(kuyruk);             //[Ayşe, Fatma, Hatice, İsmail]
        System.out.println(kuyruk.poll());      //İlk elemanı döner ve siler = Ayşe
        System.out.println(kuyruk);             //[Fatma, Hatice, İsmail]
        System.out.println(kuyruk.remove());      //İlk elemanı siler ve sildiğini döndürür = Fatma
        System.out.println(kuyruk);             //[Hatice, İsmail]
        System.out.println(kuyruk.size());       //2
        kuyruk.clear();                          //Tüm elemanları siler.
        System.out.println(kuyruk);              //[]
        System.out.println(kuyruk.isEmpty());    //ture
    }
}
//javac queue.java && java queue
