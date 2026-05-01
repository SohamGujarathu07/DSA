import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(9);
        list.add(49);
        list.add(78);
        list.add(8951);
        list.add(77);
        list.add(894);
        list.add(85);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
