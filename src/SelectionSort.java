/**
 * 选择排序
 */
class SelectionSort {
    public static int[] selectionSort(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
