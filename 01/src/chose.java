import java.util.Scanner;

public class chose {
    public static void main(String[] args) {
        System.out.println("是选择外出吗，1。是；2.不是");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i == 1) {
            System.out.println("外出（1.逛街；2.散步）");
            int i1 = input.nextInt();
            if (i1 == 1) {
                System.out.println("逛街");
            } else {
                System.out.println("散步");
            }
        } else {
            System.out.println("在家（1，看电影 2，玩游戏）");
            int i1 = input.nextInt();
            if (i1 == 1) {
                System.out.println("看电影");
            } else {
                System.out.println("玩游戏");
            }
        }
    }
}
