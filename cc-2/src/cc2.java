import java.util.List;
import java.util.*;

public class cc2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int product : productOfPrevious1(numbers)) {
            System.out.print(product + " ");
        }
        for (int product : productOfPrevious2(numbers)) {
            System.out.print(product + " ");
        }
    }

    private static int[] productOfPrevious1(int[] numbers) {
        int[] productNumbers = new int[numbers.length];
        int totalProduct = 1;
        for (int i = 0; i < numbers.length; i++) {
            totalProduct *= numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            productNumbers[i] = totalProduct / numbers[i];
        }

        return productNumbers;
    }

    private static int[] productOfPrevious2(int[] numbers) {
        int right = 1;
        int[] productNumbers = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            productNumbers[i] = right;
            right *= numbers[i];
        }
        int left = 1;
        for (int i = 0; i < numbers.length; i++) {
            productNumbers[i] *= left;
            left *= numbers[i];
        }
        return productNumbers;
    }
}
