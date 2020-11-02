import java.util.Arrays;

public class GroceryList {
    private String[] arr;

    public GroceryList() {
        arr = new String[10];
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public String toString() {
        return Arrays.toString(arr);
    }
}