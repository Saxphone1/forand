import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import static java.lang.StrictMath.sqrt;

/**
 * 日期操作类
 1、Date类
 类 Date 表示特定的瞬间，精确到毫秒，也就是程序运行时的当前时间。
 Date date = new Date(); // 实例化Date对象，表示当前时间

 2、Calendar类
 Calendar，日历类，使用此类可以将时间精确到毫秒显示。
 //两种实例化方式
 Calendar c = Calendar.getInstance();
 Calendar c = new GregorianCalendar();

 3、 DateFormat类及子类SimpleDateFormat
 */


public class Date_print {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.random());
        System.out.println(sqrt(2));

        Random r = new Random();
        System.out.println(r.nextInt(50));

        Date date = new Date();
        System.out.println(date);


        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();

        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MARCH));
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
        System.out.println(c1.get(Calendar.MINUTE));
        System.out.println(c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.MILLISECOND));

        //
        StringBuffer sb = new StringBuffer(50);
        sb.append(c1.get(Calendar.YEAR)).append("年");
        System.out.println(sb.toString());

        DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss SSS");
        System.out.println(df.format(date));


    }

}
