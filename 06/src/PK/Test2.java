package PK;

public class Test2 {
    public static void main(String[] args) {
        try {
            int i = 10;
            div(10, 1);
        } catch (NullPointerException e) {
            e.printStackTrace();//栈
        }
    }

//throws 可能会抛出的异常
    //throw 与throws 不影响
    public static void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            //人为抛出的异常
            throw new NullPointerException("除数为1，没有意义");
        }
        int c = a / b;
        System.out.println("测试-----");

    }
}