public class LargestNumberIndex {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 78, 56, 99, 34};

        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLargest Number = " + arr[maxIndex]);
        System.out.println("Index of Largest Number = " + maxIndex);
    }
}
