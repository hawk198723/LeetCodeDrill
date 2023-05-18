import java.util.Arrays;
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 9, 5, 2, 8};

        Arrays.sort(numbers);

        int secondLargest = numbers[numbers.length - 2];
        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}
