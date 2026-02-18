import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yığının boyutunu girin: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\n1. Yığına Eleman Ekle");
            System.out.println("2. Yığından Eleman Çıkar");
            System.out.println("3. Yığının Tepesindeki Elemanı Gör");
            System.out.println("4. Yığındaki Elemanları Yazdır");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Yığına eklemek istediğiniz sayıyı girin: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Çıkarılan eleman: " + poppedValue);
                    }
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("Yığının tepe elemanı: " + peekValue);
                    }
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 5:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }
        }
    }
}
