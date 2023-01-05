import java.lang.reflect.Array;
import java.util.*;

class students
{
        String name, surname;
        int age;

        public students(String na, String surna, int age)
        {
                this.name = na;
                this.surname = surna;
                this.age = age;
        }
}

public class hashMaphmz
{
        public static void main(String[] args) 
        {
                HashMap<Integer,students> hm = new HashMap<Integer,students>();
                Scanner read = new Scanner(System.in);
                int hamzaNo, veliNo, aliNo;

                students hamza = new students("Hamza", "Bayar", 20);
                students veli = new students("veli", "kazim", 25);
                students ali = new students("ali", "lazim", 98);

                System.out.println("please enter the students number:\n");
                        
                System.out.printf("enter the number for Hamza Bayar => ");
                hamzaNo = read.nextInt();
                System.out.printf("enter the number for Veli Kazim => ");
                veliNo = read.nextInt();
                System.out.printf("enter the number for Ali Lazim  => ");
                aliNo = read.nextInt();

                hm.put(hamzaNo, hamza);
                hm.put(veliNo, veli);
                hm.put(aliNo, ali);

                //System.out.println(hm.values());

                System.out.println("id: " + hamzaNo + " => " + hm.get(hamzaNo).age + hm.get(hamzaNo).name + hm.get(hamzaNo).surname);
                System.out.println("id: " + veliNo + " => " + hm.get(veliNo).age + hm.get(veliNo).name + hm.get(veliNo).surname);
                System.out.println("id: " + aliNo + " => " + hm.get(aliNo).age + hm.get(aliNo).name + hm.get(aliNo).surname);
        }
}