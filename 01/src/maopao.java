import java.util.Arrays;
/**
 *相邻的元素。如果第一个比第二个大，就交换他们两个。
 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 针对所有的元素重复以上的步骤，除了最后一个。
 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定排序算法。

 * */
public class maopao {
    public static void main(String[] args) {
        int[] arr = {34, 54, 6, 77, 24, 67, 22};
        int len = arr.length;
        for (int i = 0; i < len; i++) {//控制当前轮数
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
