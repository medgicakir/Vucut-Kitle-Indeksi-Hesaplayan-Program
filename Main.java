import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo,boy,indeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo=input.nextDouble();

        indeks=(kilo/(boy*boy));


        System.out.println("Vücut Kitle İndeksiniz :" + indeks);
    }
}