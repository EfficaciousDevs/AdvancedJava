package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public String getPriceDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        try {
            int size = sc.nextInt();
            int[] PriceArray = new int[size];
            System.out.println("Enter the price details");
            for (int i = 0; i < PriceArray.length; i++) {
                int price = sc.nextInt();
                PriceArray[i] = price;
            }
            int SearchedIndex = sc.nextInt();
            return "The array element is " + PriceArray[SearchedIndex];
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }
    }
    public static void main(String[] args) {
        ArrayException ae = new ArrayException();
        System.out.println(ae.getPriceDetails());
    }
}
