import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        int pilihan;
        do {
            System.out.println("\nMENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
                    System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
                            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan koordinat Titik 1 (x y): ");
                    int x1 = input.nextInt();
                    int y1 = input.nextInt();
                    titik1.inisialisasiTitik(x1, y1);
                    System.out.print("Masukkan koordinat Titik 2 (x y): ");
                    int x2 = input.nextInt();
                    int y2 = input.nextInt();
                    titik2.inisialisasiTitik(x2, y2);
                    break;
                case 2:
                    System.out.print("Titik 1: ");
                    titik1.tampilTitik();
                    System.out.print("Titik 2: ");
                    titik2.tampilTitik();
                    break;
                case 3:
                    System.out.print("Masukkan skalar: ");
                    int skalar = input.nextInt();
                    titik1.perkalihanSkalar(skalar);
                    titik2.perkalihanSkalar(skalar);
                    break;
                case 4:
                    titik1.pencerminanSumbuX();
                    titik2.pencerminanSumbuX();
                    break;
                case 5:
                    titik1.pencerminanSumbuY();
                    titik2.pencerminanSumbuY();
                    break;
                case 6:
                    double jarak = titik1.jarak(titik2);
                    System.out.println("Jarak antara dua titik: " + jarak);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}