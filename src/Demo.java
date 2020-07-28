public class Demo {
    public static void main(String[] args) {

        int[] n = {5,30,25,48,19,1,0,99,201};

        //冒泡排序
        int[] nums1 = BubbleSort.bubbleSort(n);
        for (int a1:nums1) {
            System.out.print(a1+"-");
        }

        System.out.println();
        //选择排序
        int[] nums2 = SelectionSort.selectionSort(n);
        for (int a2:nums2){
            System.out.print(a2+"-");
        }
    }
}
