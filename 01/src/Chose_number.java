import java.util.Arrays;
/**
 * 每一趟从待排序的数据元素中选出最小（或最大）的一个元素，
 * 顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。
 * 选择排序是不稳定的排序方法。
 */
public class Chose_number {
    public static void main(String[] args) {
        int[] arr = {34, 54, 6, 77, 24, 67, 22};
        int len = arr.length;
        for (int i = 0; i<len;i++) {  //控制当前轮数
            int minIndex = i;  //当前最小值的对应下标
            for (int j = i+1; j<len;j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
                 if (minIndex != i){
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }

        System.out.println(Arrays.toString(arr));
    }
}

