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
        marr.add(3, 0);
        marr.add(1231, 4);
        System.out.println(marr.get(0));
        System.out.println(marr.get(4));
        marr.add(1231231, 7);
        //
        System.out.println(marr.get(7));
    }
}
