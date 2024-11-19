import java.util.Random;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        System.out.print("\nOriginal Array: ");
        for (int i : arr)
            System.out.print(i + " ");

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;  // Exit the loop early if the array is already sorted
            }
        }

        System.out.print("\nSorted Array: ");
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(50);
        }
        bubbleSort(arr1);

        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubbleSort(arr2);

        int[] arr3 = { 5, 4, 3, 2, 1 };
        bubbleSort(arr3);

        int[] arr4 = { 5, 5, 5, 5, 5 };
        bubbleSort(arr4);

        int[] arr5 = {5};
        bubbleSort(arr5);

        int[] arr6 = {};
        bubbleSort(arr6);
    }
}
