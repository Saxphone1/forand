//、静态代理模式
//代理模式（Proxy）：为其他对象提供一种代理以控制对这个对象的访问。
//代理模式说白了就是“真实对象”的代表，在访问对象时引入一定程度的间接性，
// 因为这种间接性可以附加多种用途。
public class Text11{
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        ProxyUserImpl pui = new ProxyUserImpl(user);
        pui.Buy();
    }
}

class ProxyUserImpl implements IShopping{
    public IShopping is;//被代理对象
    public ProxyUserImpl(IShopping is){
        this.is = is;
    }
    public void Buy(){
        long startTime = System.currentTimeMillis();
        is.Buy();
        long endTime = System.currentTimeMillis();
        System.out.println("一共花费时间为："+(endTime - startTime));

    }
}

interface IShopping{
    public void Buy();
}
class UserImpl implements IShopping{
    public void Buy(){
        for(int i=0;i<10;i++){
            System.out.println("我在shopping....");
        }
    }
}