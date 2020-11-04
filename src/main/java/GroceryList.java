public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                arr[i] = "";
            }
        }
    }

    public String toString() {
        String str = "Grocery List: ";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "") {
                str += (arr[i] + " ");
            }
            else {
                count++;
            }
        }
        while (count > 0) {
            str += "null";
            count--;
        }
        return str;
    }
}