import java.util.Scanner;

public class WeddingPresents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double guest = Double.parseDouble(scanner.nextLine());
        double presents = Double.parseDouble(scanner.nextLine());

        int cashCount = 0;
        int electricCount = 0;
        int vouchers = 0;
        int others = 0;

        for (int i = 1; i <= presents ; i++) {
            String text = scanner.nextLine();

            if (text.equals("A")) {
                cashCount++;
            } else if (text.equals("B")) {
                electricCount++;
            } else if (text.equals("V")) {
                vouchers++;
            } else if (text.equals("G")) {
                others++;
            }


        }
        System.out.printf("%.2f%%%n", cashCount / presents * 100);
        System.out.printf("%.2f%%%n", electricCount / presents * 100);
        System.out.printf("%.2f%%%n", vouchers / presents  * 100 );
        System.out.printf("%.2f%%%n", others / presents* 100 );
        System.out.printf("%.2f%%", presents / guest * 100);
    }
}
