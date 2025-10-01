import java.util.Scanner;

public class tugas3_perpustakaan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartu = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasi = sc.nextBoolean();

        if (kartu || registrasi) {
            System.out.println("Akses perpustakaan diberikan.");
        } else {
            System.out.println("Akses perpustakaan ditolak.");
        }

        sc.close();
    }
}
