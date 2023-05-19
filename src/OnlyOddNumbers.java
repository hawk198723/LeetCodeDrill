import java.util.*;

public class OnlyOddNumbers {

    public static boolean onlyOddNum(List<Integer> list){
        for(int i:list){
            if (i%2 == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        boolean result = onlyOddNum(list);
        System.out.println("Does the list contain only odd numbers? " + result);
    }


}