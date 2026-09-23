import java.util.Scanner;

public class ArrayInputDisplay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
