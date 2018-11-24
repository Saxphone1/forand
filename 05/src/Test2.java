import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        SortCosmeticManager cm = new SortCosmeticManager();
        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
        cm.add(new Cosmetic("香奈儿","进口",800));
        cm.add(new Cosmetic("大宝","国产",20));
        cm.add(new Cosmetic("郁美净","国产",5));
        cm.show();
    }
}
//分类，继承父类CosmeticManager
class SortCosmeticManager extends CosmeticManager{
    public void show(){
        Cosmetic[] css = Arrays.copyOf(cs,cs.length);
        //从小到大排序
        for(int i=0;i<count;i++){
            for(int j=i;j<count;j++){
                if(css[i].getPrice() > css[j].getPrice()){
                    Cosmetic temp = css[i];
                    css[i] = css[j];
                    css[j] = temp;
                }
            }
        }
        //防止空指针
        for (Cosmetic c:css) {
            if(null != c){
                c.print();
            }
        }
    }
}
//开辟存储空间
class CosmeticManager{
    protected Cosmetic[] cs = new Cosmetic[5];
    protected int count = 0;

//若空间不足，扩容
    public void add(Cosmetic c){
        if(this.cs.length == this.count){
            int len = this.cs.length*2;
            cs = Arrays.copyOf(cs,len);
        }
        cs[count] = c;
        count++;
    }
//防空指针
    public void show(){
        for (Cosmetic c:cs) {
            if(null != c){
                c.print();
            }
        }
    }

}

class Cosmetic{
    private String name;
    private String type;
    private int price;
    public Cosmetic(String name,String type,int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
//方法重载
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.println(this.name+","+this.type+","+this.price);
    }
}
