import java.util.Arrays;

public class Test1 {

    public static void main(String args[]) {
        int numbers[] = {5,3,7,8,3,6,12,44,44};

        Arrays.sort(numbers);

        int largest = numbers[numbers.length - 1];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = numbers.length - 2; i >= 0; i--){
            if(numbers[i] != largest){
                secondLargest = numbers[i];
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(largest);
        System.out.println(secondLargest);
    }
    }

