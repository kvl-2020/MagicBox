
public class Main {
    public static void main(String[] args) {

        MagicBox<String> strBox = new MagicBox<>(5);
        boxPick(strBox);
        strBox.add("один");
        strBox.add("два");
        strBox.add("три");
        boxPick(strBox);
        strBox.add("четыре");
        strBox.add("пять");
        strBox.add("fff");
        boxPick(strBox);

        MagicBox<Integer> intBox = new MagicBox<>(4);
        boxPick(intBox);
        intBox.add(5);
        intBox.add(4);
        intBox.add(3);
        boxPick(intBox);
        intBox.add(2);
        intBox.add(1);
        boxPick(intBox);

    }

    public static <T> void boxPick(MagicBox<T> box) {
        try {
            System.out.println(box.pick());
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}