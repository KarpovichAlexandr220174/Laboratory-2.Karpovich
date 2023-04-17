import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        MyArrayList<Integer> marr = new MyArrayList<>(integerComparator);
        marr.add(6);
        marr.add(1231);
        marr.add(8);
        marr.add(3453);
        marr.add(10);
        marr.add(5345);
        marr.add(12);
//        for (int i = 0; i < marr.size(); i++) {
//            System.out.println(marr.get(i));
//        }
        marr.sort();
        for (int i = 0; i < marr.size(); i++) {
            System.out.println(marr.get(i));
        }
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
