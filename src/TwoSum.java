import java.util.Map;
import java.util.HashMap;

public class TwoSum {



    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i< nums.length ; i++){
            int  cha = target - nums[i];
            if(map.containsKey(cha)){
                return new int[]{map.get(cha), i};
            }

            map.put(nums[i],i);
        }

        return null;
    }

    public static void main(String[] args){

        TwoSum sol = new TwoSum();
        int[] nums = {2, 6, 8, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

    }
}