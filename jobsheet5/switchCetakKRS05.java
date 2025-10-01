import java.util.Scanner;

public class switchCetakKRS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester Anda: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("Cetak KRS Semester 1");
                break;
            case 2:
                System.out.println("Cetak KRS Semester 2");
                break;
            case 3:
                System.out.println("Cetak KRS Semester 3");
                break;
            case 4:
                System.out.println("Cetak KRS Semester 4");
                break;
            case 5:
                System.out.println("Cetak KRS Semester 5");
                break;
            case 6:
                System.out.println("Cetak KRS Semester 6");
                break;
            case 7:
                System.out.println("Cetak KRS Semester 7");
                break;
            case 8:
                System.out.println("Cetak KRS Semester 8");
                break;
            default:
                System.out.println("Semester tidak valid!");
        }

        sc.close();
    }
}
