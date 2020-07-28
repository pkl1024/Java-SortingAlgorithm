public class Demo {
    public static void main(String[] args) {

        int[] n = {5,30,25,48,19,1,0,99,201};

        //冒泡排序
        int[] nums = BubbleSort.bubbleSort(n);
        for (int a:nums) {
            System.out.println(a);
        }
    }
}
