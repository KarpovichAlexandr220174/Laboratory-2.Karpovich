import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(125, 0);
        list.add(127, 1);
        System.out.println(list.get(1));
        list.add(141);
        System.out.println(list.size());
        list.add(21312, 3);
        System.out.println(list.size());
        list.add(21312, 0);
        System.out.println(list.size());
        System.out.println(list.contains(21312));
        System.out.println(list.get(0));
        //System.out.println(list.get(0));
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(123123);
//        list.clear();
//        System.out.println(list.size());
//        list.add(1);
//        list.add(2);
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        list.add(2131, 2);
//        System.out.println(list.get(2));
//        list.remove1(123123);
//        System.out.println(list.contains(123123));
//        System.out.println(list.size());
//        list.remove1(2);
//        System.out.println(list.contains(2));
//        System.out.println(list.size());
//        list.clear();
        //System.out.println(list.size());
        //System.out.println(list.size());
//        list.remove(0);
//        //list.remove(1);
//        //list.remove(2);
//        System.out.println(list.contains(1));
//        System.out.println(list.size());
//        Comparator<Integer> integerComparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        };
//
//        Comparator<String> stringComparator = new Comparator<String>() {
//
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        MyArrayList<String> marr2 = new MyArrayList<>(stringComparator);
//        marr2.add("Sasha");
//        marr2.add("Borya");
//        marr2.add("Nikolay");
//        marr2.add("Raxat");
//        for (int i = 0; i < marr2.size(); i++) {
//            System.out.println(marr2.get(i));
//        }
//        System.out.println("-----------------");
//        marr2.sort();
//        for (int i = 0; i < marr2.size(); i++) {
//            System.out.println(marr2.get(i));
//        }
//        MyArrayList<Integer> marr = new MyArrayList<>(integerComparator);
//        marr.add(6);
//        marr.add(1231);
//        marr.add(8);
//        marr.add(3453);
//        marr.add(10);
//        marr.add(5345);
//        marr.add(12);
//        for (int i = 0; i < marr.size(); i++) {
//            System.out.println(marr.get(i));
//        }
//        marr.sort();
//        for (int i = 0; i < marr.size(); i++) {
//            System.out.println(marr.get(i));
//        }
//        System.out.println(marr.indexOf(11));
        //
//        marr.add(3, 0);
//        marr.add(1231, 4);
//        System.out.println(marr.get(0));
//        System.out.println(marr.get(4));
        //marr.add(100, 7);
//        System.out.println(marr.get(7));
//        marr.remove(7);
//        System.out.println(marr.get(6));
//        System.out.println(marr.contains(11));
//        MyArrayList<String> marr1 = new MyArrayList<>();
//        marr1.add("Sasha");
//        System.out.println(marr1.get(0));
//        System.out.println(marr1.contains("Sasha"));
        //System.out.println(marr.contains(100));
//        marr.clear();
//        System.out.println(marr.size());
//        MyArrayList<String> src = new MyArrayList<>();
//        src.add("Sasha", 0);
//        System.out.println(src.get(0));
//        System.out.println(src.contains("Sasha"));
//        //src.remove("Sasha");
//        System.out.println(src.contains("Sasha"));
//        System.out.println(src.indexOf("Sasha"));
//          MyArrayList<String> src1 = new MyArrayList<>();
//          src1.add("Sasha", 0);
//          src1.add("Sasha1", 1);
//          src1.add("Sasha1", 2);
//          src1.add("Sasha2", 3);
//          src1.add("Sasha3", 4);
////        System.out.println(src1.size());
////        System.out.println(src1.indexOf("Sasha1"));
////        System.out.println(src1.indexOf("Sasha3"));
//        System.out.println(src1.lastIndexOf("Sasha123"));
    }
}
