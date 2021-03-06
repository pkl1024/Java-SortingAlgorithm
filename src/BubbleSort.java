/**
 * 冒泡排序:
 * 从左到右遍历数组，当后一位比前一位小，则将后一位挪到前一位来。
 * 时间复杂度为：O（n²）
 */
class BubbleSort {
    /**
     *
     * @param nums 需要排序的数组。
     * @return 排序完成的数组。
     * @throws InterruptedException
     */
    public static int[] bubbleSort(int[] nums) throws InterruptedException {
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
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
