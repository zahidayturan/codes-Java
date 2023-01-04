import java.util.*;

class kimlik{
        String ad;
        String soyad;
        int yas;
        
        kimlik(String ad,String soyad, int yas){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
}

public class hmcnstrc {
    public static void main(String[] args) {
        kimlik Ahmed = new kimlik ("Ahmed","Kartal",24);
        kimlik Hüseyin = new kimlik ("Hüseyin","Şahin",21);

        HashMap<Integer,kimlik> map = new HashMap<Integer,kimlik>();
        
        System.out.print("Ahmed'in numarasini giriniz;");
        Scanner Ahmed_no = new Scanner(System.in);
        int ahmedno = Ahmed_no.nextInt();

        System.out.print("Hüseyin'in numarasini giriniz;");
        Scanner Hüseyin_no = new Scanner(System.in);
        int hüseyinno = Hüseyin_no.nextInt();

        map.put(ahmedno, Ahmed);
        map.put(hüseyinno, Hüseyin);

        Set s = map.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry) it.next();
            int key = (Integer) m.getKey();
            kimlik value = (kimlik) m.getValue();
            System.out.println(key+ " numaralı öğrencinin bilgileri; Adı: "+value.ad+ "  Soyadı: "+value.soyad+ "  Yaşı: "+value.yas);
        }
}
}
