public class Sum_factorial {
    //Java阶乘求和 1！+2！+...+10！
    public static void main(String[] args) {
        int i=1;
        int result = 0;
        do {
            int j=1;
            int num =j;
            do {
                num*=j;
                j++;
            }while (j<=i);
            result += num;
            i++;
        }while (i<=10);
        System.out.println(result);
    }
}
