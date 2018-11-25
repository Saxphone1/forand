//接口应用—策略模式
//策略模式（Strategy Pattern），定义了一系列的算法，
// 将每一种算法封装起来并可以相互替换使用，
// 策略模式让算法独立于使用它的客户应用而独立变化。
public class Text8 {
    public static void main(String[] args) {
    ISave is = new FileSave();
    UserService bs = new UserService();
    bs.setIsave(is);
    bs.save("user");
    }
}

abstract class ISave{
    public abstract void save(String data);
}

class FileSave extends ISave{
    public void save(String data) {
        System.out.println("保存到文件中去"+data);
    }
}

class NetSave extends ISave{
    public void save(String data) {
        System.out.println("保存到网络中去"+data);
    }
}

abstract class BaseService{
    public ISave isave;
    public void setIsave(ISave isave) {
        this.isave = isave;
    }
    public void save(String data){
        isave.save(data);
    }
}

class UserService extends BaseService{

}

class StudentService extends BaseService{

}