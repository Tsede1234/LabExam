package Package5;
import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("enter a sequence of num1");// prompt for input
        num1 = keyboard.nextInt(); // input method called

        System.out.println("enter a sequence of num2");// prompt for input
        num2 = keyboard.nextInt(); // input method called

        System.out.println("enter a sequence of num3");// prompt for input
        num3 = keyboard.nextInt(); // input method called

        System.out.println("enter a sequence of num4");// prompt for input
        num4 = keyboard.nextInt(); // input method called

        System.out.println("enter a sequence of num5");// prompt for input
        num5 = keyboard.nextInt(); // input method called


        int[] array = {num1, num2, num3, num4, num5};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if(inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for(int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftH, int[] rightH) {
        int leftSize = leftH.length;
        int rightSize = rightH.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < leftSize && j < rightSize) {
            if(leftH[i] <= rightH[j]) {
                inputArray[k] = leftH[i];
                i++;
            }
            else {
                inputArray[k] = rightH[j];
                j++;
            }
            k++;
        }
        while(i < leftSize) {
            inputArray[k] = leftH[i];
            i++;
            k++;
        }
        while(j < rightSize) {
            inputArray[k] = rightH[j];
            j++;
            k++;
        }
    }
}
