public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        for (int i = 0; i < 3; i++) {
            System.out.println(listInt.get(i));
        }
        listInt.get(4);
        System.out.println(listInt.get(6));
    }
}
