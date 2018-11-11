import java.util.Scanner;

public class two {
    int arr[] = {22, 33, 44, 55, 66, 77, 88};

    public static int selection(int[] arr, int val) {
        int start = 0;
        int end = arr.length;
        do {
            int i = (start + end) / 2;
            if (val > arr[i]) {
                start = i + 1;
            } else if (val < end) {
                end = 1;
            } else {
                return i;
            }}
            while (start < end) ;
            {
                return -1;
            }
    }
}



