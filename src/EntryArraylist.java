public class EntryArraylist {
    private int size = 10;
    private Entry[] arr;
    private int index;

    public EntryArraylist() {
        arr = new Entry[size];
        index = 0;
    }


    public void add(Entry data) {
        if (index == size) {
            addHelper();
        }
        arr[index++] = data;
    }

    private void addHelper() {
        size *= 2;
        Entry[] newarr = new Entry[size];

        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }

        arr = newarr;
    }

    public boolean contains(Cell data) {
        for (Entry cell:arr) {
            if (cell.key == data) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return index;
    }

    public Entry get(int i) {
        return arr[i];
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            out.append(get(i)).append(" ");
        }
        return out.toString();
    }

    public Cell gethelper(Cell key) {
        for (Entry entry:arr) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }
}
