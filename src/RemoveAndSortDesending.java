import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class RemoveAndSortDesending {

        public static void main(String[] args){
            String str = "1 4 5 2 4 90 67 56 3 4 2 5";

            String[] strArray = str.split(" ");

            Set<Integer> set = new HashSet<Integer>();

            for(String s: strArray){
                set.add(Integer.parseInt(s));
            }


            TreeSet<Integer> sortedSet = new TreeSet<Integer>(Collections.reverseOrder());

            sortedSet.addAll(set);
            System.out.println(sortedSet);
        }
}
