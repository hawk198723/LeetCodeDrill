import java.util.*;

public class RemoveAndSort{
    public static void main(String[] args){
        String str = "1 4 5 2 4 90 67 56 3 4 2 5";

        String[] strArray = str.split(" ");

        Set<Integer> set = new HashSet<Integer>();

        for(String s: strArray){
            set.add(Integer.parseInt(s));
        }


        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);

        System.out.println(sortedSet);
    }
}