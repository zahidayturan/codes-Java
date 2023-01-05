import java.util.*;

public class hashMap{
    public static void main(String[]args){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(05,"Amasya");
        map.put(06,"Ankara");
        map.put(07,"Antalya");
        System.out.println(map); //ÇIKTI   {5=Amasya, 6=Ankara, 7=Antalya}
        
        Set<Map.Entry<Integer,String>> s = map.entrySet();
        System.out.println(s);  //ÇIKTI   {5=Amasya, 6=Ankara, 7=Antalya}
        
        Iterator<Map.Entry<Integer,String>> it = s.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> m = (Map.Entry<Integer,String>) it.next();
            int key = (Integer) m.getKey();
            String value = (String) m.getValue();
            System.out.println("Anahtar:"+key+ " Değer:"+ value);
            //Anahtar:5 Değer:Amasya
            //Anahtar:6 Değer:Ankara
            //Anahtar:7 Değer:Antalya
        }
    }
}