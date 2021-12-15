import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("Beden Kitle İndeksini Hesaplayan Program");
        System.out.println("***************************************************");
        System.out.print("Lütfen Boyunuzu Metre(m) cinsinden giriniz : ");
        double boy = scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Kilogram(kg) cinsinden giriniz : ");
        double kilo = scanner.nextDouble();
        double vki = kilo/(boy*boy);
        System.out.println("***************************************************");
        System.out.println("Vücut Kitle İndeksiniz : "+vki);
        System.out.println("---------------------------------------------------");
    }
}
