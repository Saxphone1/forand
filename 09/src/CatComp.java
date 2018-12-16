import java.util.Comparator;

public class CatComp implements Comparator {

    public int compare(Cat o1,Cat o2){
        return o1.getAge()-o2.getAge();
    }

}