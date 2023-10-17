import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double i,n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("N Sayısını Giriniz: ");
        n=scanner.nextDouble();
        double sonuc=0;
        for (i=1; i<=n; i++){
            sonuc += (1/i);
        }
        System.out.println("Sonuç: "+sonuc);
    }
}