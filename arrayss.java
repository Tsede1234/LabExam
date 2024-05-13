package Package6;

public class arrayss {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;

        int[] modifiedArray = deleteElement(array, indexToDelete);

        if (modifiedArray != null) {
            System.out.print("Modified Array: ");
            for (int num : modifiedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[] deleteElement(int[] array, int index) {
        // Check if the index is valid
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array; // Return the original array unchanged
        }

        // Create a new array with one less element
        int[] modifiedArray = new int[array.length - 1];

        // Copy elements from the original array to the modified array
        int j = 0; // Index for modifiedArray
        for (int i = 0; i < array.length; i++) {
            // Skip the element at the specified index
            if (i == index) {
                continue;
            }
            modifiedArray[j++] = array[i];
        }

        return modifiedArray;
    }
}
