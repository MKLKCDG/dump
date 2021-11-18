import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner g = new Scanner(System.in);
        System.out.print("günü girin: ");
        int gün =g.nextInt();
		
		Scanner a = new Scanner(System.in);
		System.out.print("ayı girin: ");
		int ay =a.nextInt();
		
		Scanner y = new Scanner(System.in);
		System.out.print("yılı girin: ");
		int yıl = y.nextInt();
		
		System.out.println(g + "." a + "." y);
    }
}