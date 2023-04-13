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
        System.out.println(marr.get(6));
        System.out.println(marr.contains(1231));
    }
}
