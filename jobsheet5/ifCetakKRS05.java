import java.util.Scanner;

public class ifCetakKRS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input status UKT
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // IF sederhana
        if (uktLunas) {
            System.out.println("KRS dapat dicetak.");
        }

        sc.close();
    }
}
