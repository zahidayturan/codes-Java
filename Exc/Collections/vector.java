import java.util.*;
//temelVeridenNesneselTip.txt

public class vector {
    public static void main(String[] args) {

        Vector <String> isim = new Vector<String>();  //Parantez içine yazılan değer kapasiteyi gösterir. Boş ise 10.
        //Eğer parantez içine (20,5) gibi bir ifade yazılırsa ilk kapasite 20.dolunca artım miktarı 5 tir.
        String[] ilkdizi = { "nuh", "yusuf","ilyas","isa","mehmet","musa", "yunus", "adem"};
        
        System.out.println("Vektor boyutu..:"+ isim.capacity()); //Ön tanımlı olarak 10 boyutlu geliyor
        System.out.println("Vektor eleman sayısı..:"+ isim.size()); //Eleman sayısı 0
        
        System.out.println("Dizi elemanları");
        //Dizi elemanları vektöre aktarılıyor
        for(String ad : ilkdizi) {
            isim.add(ad);
            System.out.print(ad +" ");  //nuh yusuf ilyas isa mehmet musa yunus adem
        }
        
        isim.set(4,"osman"); //4. eleman değişti. Yani sıraya göre 5. mehmet -> osman
        isim.add("ali");
        isim.add("ömer");
        isim.add("ahmet");

        System.out.println("\nVektor yeni boyutu..:"+ isim.capacity()); //11 eleman eklendi. Vektor yeni boyutu..:20
        System.out.println("Vektor eleman sayısı..:"+ isim.size());  //Vektor eleman sayısı..:11
        System.out.println("İlk eleman :"+ isim.firstElement());  //İlk eleman :nuh
        System.out.println("Son eleman :"+ isim.lastElement());  //Son eleman :ahmet
        System.out.println("Vektör elemanları: "+isim);  //[nuh, yusuf, ilyas, isa, osman, musa, yunus, adem, ali, ömer, ahmet]

    }
}
// javac vector.java && java vector