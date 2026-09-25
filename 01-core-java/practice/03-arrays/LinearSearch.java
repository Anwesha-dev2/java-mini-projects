import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int position = -1;

        for (int i = 0; i < size; i++) {

            if (numbers[i] == target) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index " + position);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
