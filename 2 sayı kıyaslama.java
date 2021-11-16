import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.print("say1:");
        int sayı1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.print("sayı2:");
        int sayı2=b.nextInt();

       if (sayı2<sayı1) {
           System.out.println("sayı1 sayı2 den büyüktür");
       }

       if (sayı1!=sayı2){
           System.out.println("sayılar eşit değildir");
       }

       if (sayı1<sayı2){
           System.out.println("sayı2 sayı1 den büyüktür");
       }

       if (sayı1==sayı2){
           System.out.println("sayılar eşittir");
       }

    }


}