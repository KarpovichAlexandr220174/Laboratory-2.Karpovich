import java.util.Comparator;
import java.util.List;

//Main with checking all my project methods...
public class Main {
    public static void main(String[] args) {
        MyArrayListStack<Integer> mrlst = new MyArrayListStack<>();
        System.out.println(mrlst.isEmpty());

//        MyArrayList<Integer> mrtl = new MyArrayList<>();
//        Integer[]arr = new Integer[]{1,2,3,4,5,6};
//        mrtl.add(123);
//        mrtl.add(arr);
//        System.out.println(mrtl.get(1));
        //Comparator with compare method for using in collection

//        Comparator<Integer> integerComparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        };
//
//        MyLinkedList<Integer> mal = new MyLinkedList<>(integerComparator);
//        mal.add(1);
//        mal.add(2);
//        mal.add(1231);
//        mal.add(123);
//        mal.add(53453);
//        mal.add(34234);
//        mal.sort();
//        for(int s : mal){
//            System.out.println(s);
//        }
//        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
//        list.add(123, 0);
//        list.add(124, 1);
//        list.add(125, 2);
//        list.add(126, 3);
//        System.out.println(list.indexOf(125));
//        System.out.println(list.indexOf(128312));
//        list.add(128312);
//        System.out.println(list.indexOf(128312));
//        list.clear();
//        System.out.println(list.size());
//        System.out.println(list.indexOf(123));
//
//        MyLinkedList<String> mal = new MyLinkedList<String>();
//        mal.add("S", 0);
//        mal.add("S", 1);
//        mal.add("S", 2);
//        mal.add("S", 3);
//        mal.add("S", 4);
//        mal.add("S", 5);
//        mal.add("D", 6);
//        mal.add("D", 7);
//        System.out.println(mal.size());
//        System.out.println(mal.contains("D"));

//        System.out.println(mal.size());
//        System.out.println(mal.indexOf("S"));
//        System.out.println(mal.contains("S"));
//        System.out.println(mal.contains("D"));
        //System.out.println(mal.lastIndexOf("S"));

//        System.out.println(mal.size());
        //        MyArrayList<Integer> marrr = new MyArrayList<>();
//        marrr.add(123, 0);
//        System.out.println(marrr.size());
//        System.out.println(marrr.indexOf(124));
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
