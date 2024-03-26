public class CustomArrayList {
    private int size = 10;
    private Cell[] arr;
    private int index;

    public CustomArrayList() {
        arr = new Cell[size];
        index = 0;
    }


    public void add(Cell data) {
        if (index == size) {
           addHelper();
        }
        arr[index++] = data;
    }

    private void addHelper() {
        size *= 2;
        Cell[] newarr = new Cell[size];

        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }

        arr = newarr;
    }

    public boolean contains(Cell data) {
        for (Cell cell:arr) {
            if (cell == data) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return index;
    }

    public Cell get(int i) {
        return arr[i];
    }

    public CustomArrayList reverse() {
        CustomArrayList temp = new CustomArrayList();
        for (int i = index-1; i > -1 ; i--) {
            temp.add(arr[i]);
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            out.append(get(i)).append(" ");
        }
        return out.toString();
    }
}
