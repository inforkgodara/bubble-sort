import java.util.Scanner;

/**
 * This is an implementation of the bubble sort algorithm.
 * @author Ramesh Kumar
 *
 */
public class BubbleSort {

    /**
     * Bubble sort implementation.
     * @param list the array to be sorted.
     * @param length the integer which size of list.
     */
    static void sort(int list[], int length) {
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1]; 
                    list[j+1] = temp; 
                }
            } 
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter length of list : ");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] list = new int[length];

        for (int index = 0; index < length; index++) {
            list[index] = scanner.nextInt();
        }

        sort(list, length);

        System.out.print("Sorted list: ");

        for (int element: list) {
            System.out.print(element + " ");
        }
    }
}