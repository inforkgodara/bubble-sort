# Bubble Sort

A simple single class implementation of bubble sort in Java. The user will be prompted to input the number of elements in a list which they want to enter. Sort method works by repeatedly swapping the adjacent elements if they are in the wrong order.

## How to use it.
* Open a command prompt window and go to the directory where you saved the java program (BubbleSort.java).
* Type 'javac BubbleSort.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line.
* Now, type 'java BubbleSort' to run your program.
* You will be able to see an output line and asking input to enter the number of elements (integer) you want to enter.
* Next you will enter the number of elements it can be space-separated or in a new line.
* After completion of entering elements in list, the program will show sorted list.

## Code
```
import java.util.Scanner;

/**
 * This is an implementation of the bubble sort algorithm.
 * @author @inforkgodara
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
```
