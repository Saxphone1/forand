import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//双色球
public class Color_balls {
    //随机在球池里面摇号
    //balls———可选红球
    //redBalls———选择完成的球存放的位置
    public static void computerSelection(int[] balls,int[] redBalls){
        Random r = new Random();
        for(int i=0;i<redBalls.length;i++){
            int index = r.nextInt(balls.length - i);
            redBalls[i] = balls[index];
            int temp = balls[index];
            balls[index] = balls[balls.length - 1- i];
            balls[balls.length - 1- i] = temp;
        }
    }
    public static void main(String[] args) {
        //创建红球区
        int[] redBalls = new int[33];
        int len = redBalls.length;
        for (int i=0;i<len;i++){
            redBalls[i] = i+1;
        }
        //用户选择的红球
        int[] userReds = new int[6];
        //用户选择的蓝球
        int userBlue = 0;
        //系统生成的中奖红球
        int[] sysReds = new int[6];
        //系统生成的中奖蓝球
        int sysBlue = 0;
        //表示红球选中数
        int selectionRedNum = 0;
        //表示蓝球选中数
        int selectionBlueNum = 0;

        System.out.println("请选择摇号方式：1.机选  2.人选");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Random r =new Random();    //random即随机
        switch (num){
            case 1:
                //机选
               computerSelection(redBalls,userReds);
                userBlue = r.nextInt(16) + 1;   //从0到15，所以加一，满足1到16的要求
                break;
            case 2:  //人选
                System.out.println("请输入6个红球(1~33)");
                for (int i=0;i<userReds.length;i++){
                    userReds[i] = input.nextInt();
                }
                System.out.println("请输入1个篮球（1~16）");
                userBlue = input.nextInt();
                break;
        }
        computerSelection(redBalls,sysReds);
        sysBlue = r.nextInt(16)+1;
/*
 * 验证中奖，与位置无关
 */
        //比较是否红球中奖
        for(int i=0;i<6;i++){
            int sysLen = sysReds.length - selectionRedNum;
            for(int j=0;j<sysLen;j++){
                if(userReds[i] == sysReds[j]){  //减少对比
                    int temp = sysReds[j];
                    sysReds[j] = sysReds[sysLen-1];
                    sysReds[sysLen-1] = temp;
                    selectionRedNum++;     //中奖红球
                    break;
                }
            }
        }
        //对比蓝球是否中奖
        if(userBlue == sysBlue){
            selectionBlueNum++;
        }

        //排序码齐
        Arrays.sort(userReds);
        Arrays.sort(sysReds);
/*
*输出用户选号
*公布本期中奖号码
*/
        System.out.println("    您的选号为："+Arrays.toString(userReds)+"+"+userBlue);
        System.out.println("本期中奖号码为："+Arrays.toString(sysReds)+"+"+sysBlue);

        if(selectionRedNum <=3 && selectionBlueNum==0){
            System.out.println("别伤心，没中很正常");
        }else if(selectionBlueNum == 1 && selectionRedNum < 3){
            System.out.println("恭喜六等奖，5元到手");
        }else if((selectionRedNum==3&& selectionBlueNum==1) || (selectionRedNum==4&& selectionBlueNum==0)){
            System.out.println("恭喜五等奖，10元到手");
        }else if((selectionRedNum==4&& selectionBlueNum==1) || (selectionRedNum==5&& selectionBlueNum==0)){
            System.out.println("恭喜四等奖，200元到手");
        }else if(selectionRedNum==5&& selectionBlueNum==1){
            System.out.println("恭喜三等奖，3000元到手");
        }else if(selectionRedNum==6&& selectionBlueNum==0){
            System.out.println("恭喜二等奖，1万元到手");
        }else if(selectionRedNum==6&& selectionBlueNum==1){
            System.out.println("恭喜一等奖，500万元到手");
        }else{
            System.out.println("系统异常，2元不退");
        }
    }
}