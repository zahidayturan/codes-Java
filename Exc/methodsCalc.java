import java.util.*;

public class methodsCalc {

    public static float toplama(int a, int b) {
        int t;
        t = a+b;
        return t;
    }

    public static float cikarma(int a,int b){
        float t;
        t = a-b;
        return t;
    }
    public static float faktoriyel(int a){
        if(a == 1 || a ==0)
            return 1 ;
        return a * faktoriyel(a-1);
    }

    public static void main(String[] args) {
        do{
        Scanner read = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n1-->Toplama\n2-->Çıkarma\n3-->Faktöriyel");
        int secim = read.nextInt();
            switch(secim){
                case 1:
                System.out.print("Toplama işlemi için ilk değer: ");int a = read.nextInt();
                System.out.print("Toplama işlemi için ikinci değer: ");int b = read.nextInt();
                System.out.println(toplama(a, b)); 
                break;
                case 2:
                System.out.print("Çıkarma işlemi için ilk değer: ");int c = read.nextInt();
                System.out.print("Çıkarma işlemi için ikinci değer: ");int d = read.nextInt();
                System.out.println(cikarma(c, d));
                break;
                case 3:
                System.out.print("Faktöriyel işlemi için değer: ");int e = read.nextInt();
                System.out.println(faktoriyel(e));
                break;
                default: System.out.println("Yanlış değer girdiniz");
            }
        System.out.println("Çıkmak isterseniz 0 girin. Menü için herhangi bir rakam.");
        int karar = read.nextInt();
        if (karar ==0) break;
        }while(1 !=0);
    }
}
//javac methodsCalc.java && java methodsCalc