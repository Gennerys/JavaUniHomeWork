public class ConsoleApp {

    public static void main(String[] args) {

        IList<Integer> integerList = new ListImplementation<Integer>(5);
        System.out.println(String.format("%d", integerList.size()));
        integerList.add(1);
        System.out.println(String.format("%d", integerList.size()));
        integerList.add(23);
        integerList.add(45);
        System.out.println(String.format("%d", integerList.getElement(1)));
        integerList.insert(1, 147);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.getElement(i));
        }

        integerList.remove(3);
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.getElement(i));
        }

        integerList.setElement(2, 200);
        System.out.println(integerList.getElement(2));

    }

}

