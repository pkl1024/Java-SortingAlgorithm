class BubbleSort {
    public static int[] bubbleSort(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
