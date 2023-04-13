public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> marr = new MyArrayList<>();
        //int [] arr = new int[5];
        marr.add(6);
        marr.add(7);
        marr.add(8);
        marr.add(9);
        marr.add(10);
        marr.add(11);
        marr.add(12);
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
        marr.clear();
        System.out.println(marr.size());
        MyArrayList<String> src = new MyArrayList<>();
        src.add("Sasha", 0);
        System.out.println(src.get(0));
        System.out.println(src.contains("Sasha"));
        src.remove("Sasha");
        System.out.println(src.contains("Sasha"));
    }
}
