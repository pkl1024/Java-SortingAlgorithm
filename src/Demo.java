public class Demo {
    public static void main(String[] args) throws InterruptedException {

        int[] n = {5,30,25,48,19,1,99,201,10,7,3,0};

        //冒泡排序
        int[] nums1 = BubbleSort.bubbleSort(new int[]{5,30,25,48,19,1,99,201,10,7,3,0});
        for (int i:nums1) {
            System.out.print(i+"-");
        }

        System.out.println();
        //选择排序
        int[] nums2 = SelectionSort.selectionSort(new int[]{5,30,25,48,19,1,99,201,10,7,3,0});
        for (int i:nums2){
            System.out.print(i+"-");
        }

        System.out.println();
        //选择排序
        int[] nums3 = SelectionSort.selectionSort(new int[]{5,30,25,48,19,1,99,201,10,7,3,0});
        for (int i:nums3){
            System.out.print(i+"-");
        }
    }
}
