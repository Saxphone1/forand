import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test1 {
    public static void main(String[] args) {
        linkedList();
    }

    public static void linkedList(){
        LinkedList l = new LinkedList();
        l.add("Tom");
        l.add("Jamry");
        l.add("Rose");
        l.add("Lucy");


        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

    }
    public static void vector(){
        List<String> v = new Vector<>();
        v.add("Tom");
        v.add("Jamry");
        v.add("Rose");
        v.add("Lucy");

        for (int i= 0;i<v.size();i++){
            System.out.println(v.get(i));

        }
    }

}
