import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        
        LinkedList<String> liste = new LinkedList <String>();
        liste.add("Portakal");
        liste.add("Limon");
        liste.add("Mandalina");
        liste.add("Armut");
        liste.add("Mandalina");
        liste.add("Elma");
        System.out.println("İlk liste = " + liste); //İlk liste = [Portakal, Limon, Mandalina, Armut, Mandalina, Elma]
        liste.add(4, "Ayva");
        System.out.println("Değişen liste = " + liste); //Değişen liste = [Portakal, Limon, Mandalina, Armut, Ayva, Mandalina, Elma]
        System.out.println("ilk öğe = " + liste.getFirst()); //ilk öğe = Portakal
        System.out.println("6.nci öğe = " + liste.get(6));  //6.nci öğe = Elma
        System.out.println("silinen = " + liste.removeFirst());  //silinen = Portakal
        System.out.println("silinen = " + liste.removeLast());  //silinen = Elma
        System.out.println("Liste son hali = " + liste); //Liste son hali = [Limon, Mandalina, Armut, Ayva, Mandalina]
        System.out.println("silinen = " + liste.remove(3));  //silinen = Ayva
        //System.out.println("silinen = " + liste.remove(5));  //HATA Index: 5, Size: 4
        System.out.println(liste.get(2)); //Armut
        System.out.println("Liste son hali = " + liste); //Liste son hali = [Limon, Mandalina, Armut, Mandalina]
        liste.set(3, "Üzüm"); //Değiştirme işlemini sadece olan elemanlarla yapıyor. 
        System.out.println("Liste son hali = " + liste);  //Liste son hali = [Limon, Mandalina, Armut, Üzüm]
        System.out.println(liste.size());  //4
        //liste.toArray(); //Listedeki elemanları dizi elemanlarına dönüştürür.
    }
}
//javac linkedlist.java && java linkedlist