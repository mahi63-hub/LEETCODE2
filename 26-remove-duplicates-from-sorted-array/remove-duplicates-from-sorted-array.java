class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i:nums){
            if(!ls.contains(i)){
                ls.add(i);
            }
        }

         for (int i = 0; i < ls.size(); i++) {
            nums[i] = ls.get(i);
        }

        return ls.size();
    }
}