import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("sayı1: ");
        int sayı1 = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.print("sayı2: ");
        int sayı2 = s2.nextInt();

        Scanner s3 = new Scanner (System.in);
        System.out.print("sayı3: ");
        int sayı3 = s3.nextInt();

        if(sayı1<sayı2&&sayı3<sayı2){
            System.out.println("en büyük sayı 2.sayıdır");
        }

        if(sayı2<sayı1&&sayı3<sayı1){
            System.out.println("en büyük sayı 1.sayıdır");
        }

        if(sayı1<sayı3&&sayı2<sayı3) {
            System.out.println("en büyük sayı 3. sayıdır");
        }
    }




}