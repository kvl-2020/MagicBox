import java.util.Random;

public class MagicBox<T> {
    private int size;
    private T[] items;

    public MagicBox(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    boolean add(T item) {
        int freeIndex = getFreeIndex();
        if (freeIndex < 0) {
            return false;
        }
        items[freeIndex] = item;
        return true;
    }

    T pick() throws RuntimeException {

        int freeIndex = getFreeIndex();
        if (freeIndex < 0) {
            Random random = new Random();
            int randomInt = random.nextInt(size);
            return items[randomInt];
        } else {
            throw new RuntimeException("Нужно заполнить ещё " + (size - freeIndex) + " ячеек");
        }

    }

    int getFreeIndex() {
        int result = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                result = i;
                break;
            }
        }
        return result;
    }

}
