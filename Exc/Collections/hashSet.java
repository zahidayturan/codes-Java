import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet <String>();
        hs.add("Bursa");
        hs.add("Ankara");
        hs.add("Malatya");
        hs.add("Diyarbakir");
        hs.add("Muğla");
        hs.add("Ankara"); // Hashset çift veriye izin vermez
        System.out.println("illerin Sırasız hali");
        System.out.println(hs);
        System.out.println("illerin Sıralı hali");

        //TREE SET Kullanımı
        TreeSet <String> siraliKume= new TreeSet <String> (hs);
        System.out.println(siraliKume);

        //ITERATOR Kullanımı
        Iterator i = hs.iterator();
        while(i.hasNext()){
            //System.out.println("Elemanlar: "+i.next());
            i.remove(); //Silecek
        }
        System.out.println(hs);
    }
}
