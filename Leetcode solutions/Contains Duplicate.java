// NOT THE MOST OPTIMAL (TIME TAKEN BEATS 50% , MEMORY BEATS 34% ONLY)
import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer , Integer> it = new HashMap<Integer , Integer>();
        for(int i : nums){
            if(it.get(i) != null) {
              
                return true;

            }
            it.put(i , i);
        }
        return false;
    }
}