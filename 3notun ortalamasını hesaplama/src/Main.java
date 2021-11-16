
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Ad:");
        String ad =s.next();

        System.out.print("Soyad:");
        String soyad =s.next();



        System.out.print("not1:");
        int not1 = s.nextInt();

        System.out.print("not2:");
        int not2 = s.nextInt();

        System.out.print("not3:");
        int not3 = s.nextInt();


        System.out.println("not1: " +not1);
        System.out.println("not2: "+not2);
        System.out.println("not3: "+not3);

        int ortalama;
        ortalama=(not1+not2+not3)/3;


        System.out.print("Ortalama " +ortalama);

    }
}