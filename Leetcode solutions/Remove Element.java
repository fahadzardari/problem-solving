import java.util.Stack;
class Solution {
    public int removeElement(int[] nums, int val) {
            
            Stack<Integer> s = new Stack<Integer>();
            for(int i : nums){
                if(i == val){
                    continue;
                }
                s.add(i);
            }

        for(int i = 0; i < s.size(); i++){
            nums[i] = s.get(i);
        }

        return s.size();


    }
}