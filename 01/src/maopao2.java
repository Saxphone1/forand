import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class maopao2 {
    public static void main(String[] args) {
        int[] arr = {44, 78, 34, 56, 12};
        int len = arr.length;
        for (int i = 0; i < len; i++) { //轮数
            for (int j = 0; j <len - i-1; j++) {//len减一为了防止数组越界
                if (arr[j] > arr[j + 1]) {  //比较相邻两个数
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
