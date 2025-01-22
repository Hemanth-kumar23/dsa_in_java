
public class selectionShort {

    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            // Assume the first element of the unsorted part as the minimum
            int minimum = i;

            // Find the position of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j; // Update position of the minimum element
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {13, 4, 9, 5, 3, 16, 12};

        System.out.println("Original Array:");
        printArray(array);

        // Sort the array
        selectionSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
