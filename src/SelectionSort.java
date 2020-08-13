/**
 * 选择排序
 */
class SelectionSort {
    /**
     * 选择排序
     * @param nums 需要排序的数组。
     * @return 返回排序后的结果。
     * @throws InterruptedException
     */
    public static int[] selectionSort(int[] nums) throws InterruptedException {
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                //分步显示，帮助理解排序过程
                /*for (int a:nums){
                    System.out.print(a+" ");
                }
                System.out.println();
                Thread.sleep(1000);*/
            }
        }
        return nums;
    }
}
