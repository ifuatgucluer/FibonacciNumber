import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_FibonacciSayilariniYazdir {
    public static void main(String[] args) {
        // Kullanıcıdan pozitif bir tamsayı alıp,
        // O tamsayıdan küçük Fibonacci sayılarını bir liste olarak yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Fibonacci sayılarını yazdırmak için üst sayı sınırını girin: ");
        int maxSayi = scanner.nextInt(); // Kullanıcının girdiği üst sınır

        // Fibonacci sayılarını hesaplayan ve liste döndüren metot çağrılıyor
        List<Integer> fibonacciListesi = fibonacciSayilariniHesapla(maxSayi);

        System.out.println("Fibonacci sayıları: " + fibonacciListesi);
    }

    // Verilen pozitif bir tamsayıyı alıp,
    // o tamsayıdan küçük Fibonacci sayılarını bir liste olarak döndüren metot.
    public static List<Integer> fibonacciSayilariniHesapla(int maxSayi) {
        List<Integer> fibonacciListesi = new ArrayList<>();

        int f1 = 0, f2 = 1;

        // İlk sayıyı ekliyoruz
        if (maxSayi >= f1) {
            fibonacciListesi.add(f1);
        }

        // Üst sınırdan küçük olan tüm Fibonacci sayıları listeye eklenir
        while (f2 <= maxSayi) {
            fibonacciListesi.add(f2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

        return fibonacciListesi;
    }
}
