import java.util.Scanner;
import java.util.Stack;

public class FlipArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20 || size < 1)
                System.out.println("Size does not exceed 20");
        } while (size > 20 || size < 1);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            stack.push(array[i]);
            i++;
        }
        System.out.println("Flipped array is");
        while (!stack.isEmpty()) {
            System.out.printf("\t%s", stack.pop());
        }
    }
}
