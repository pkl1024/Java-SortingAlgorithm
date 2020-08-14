import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 插入排序
 */
class InsertSort {
    public static int[] insertSort(int[] nums) throws InterruptedException {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            tag:for (int j=i-1;j>=0;j--){
                if (temp < nums[j]){
                    nums[j+1] = nums[j];
                    nums[j] = temp;

                //分步显示，帮助理解排序过程
                /*for (int a:nums){
                    System.out.print(a+" ");
                }
                System.out.println();
                Thread.sleep(1000);*/

                }else {
                    break tag;
                }


            }
        }
        return nums;
    }

}
