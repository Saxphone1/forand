/**
 * 得到Class类的对象有三种方式：
 * 第一种形式：Object类中的getClass()方法
 * 第二种形式：类.class
 * 第三种形式：通过Class类的forName方法

 **/
public class Test1 {
    public static void main(String[] args) {
       //法一
        Dog dog = new Dog("小白",2,"whilt");
        Class dogClass = dog.getClass();

        //法二
        Class dogClass1 = Dog.class;

        //法三
        try {
            Class dogClass2 =Class.forName("Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
