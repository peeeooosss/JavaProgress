class Solution {
  public static void main(String[] arg){
     int[] num = {2,3,4,5,6,7,1};
     int target = 6;
     System.out.print(twoSum(num,target));
  }
  static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
