import java.util.Scanner;
public class grade {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println(s >=60?"及格":"重修");
    }
}
