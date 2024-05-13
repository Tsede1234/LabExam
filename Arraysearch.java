package Package1;
import java.util.Scanner;
public class Arraysearch {
    public static void main(String[] args ) {

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

        System.out.println(" enter a number to be searched");// prompt for input
         int target = keyboard.nextInt(); // input method called




            int[] nums = {num1, num2, num3, num4, num5};

            int linearResult = linearSearch(nums, target);
            if (linearResult != -1) {
                System.out.println("Linear Search: Element found at index " + linearResult);
            } else {
                System.out.println("Linear Search: Element not found");
            }


        }

        public static int linearSearch(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target)
                    return i;
            }
            return -1;
        }





    }

