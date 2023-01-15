class Araba{
    int kapi;
    int teker;
    public Araba(int adet){   //Public olmasının önemi yok
        kapi = adet;
        System.out.println("burada"+kapi);
    }
    Araba(){
        
    }
}
class deneme{
    int yaz(int x){
        return x;
    }
}
class bos{
    public int x=3;
}

public class pubpir{   
    public static void main(String args[])   
    {  
        Araba obj = new Araba(5);    //Çıktısı burada5 
        obj.kapi = 15;                      
        System.out.println(obj.kapi);       //Çıktısı 15    
        Araba obj2 = new Araba();           ////Çıktısı yok
        obj2.teker=54;
        obj2.kapi=55;
        System.out.println(obj2.kapi+" "+obj2.teker);  //Çıktısı 55 54

        deneme nesne = new deneme();
        System.out.println(nesne.yaz(38)); //Çıktısı 38

        bos fitifiti = new bos();
        System.out.println(fitifiti.x);     //Çıktısı 3
}  
}
//javac pubpir.java && java pubpir