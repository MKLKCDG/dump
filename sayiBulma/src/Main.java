public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,3,5,7,9,0};
        int aranacak = 10;
        boolean varmi=false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varmi= true;
                break;
            }

        }

        if (varmi){
            System.out.println("sayı var");
        }else{
            System.out.println("sayı yok");
        }

    }
}
