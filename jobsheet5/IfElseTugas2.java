import java.util.Scanner;

public class IfElseTugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Program Penilaian ---");
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = sc.nextInt();

        if (nilai >= 60) {
            System.out.println("Selamat, Anda Lulus!");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus.");
        }

        sc.close();
    }
}
