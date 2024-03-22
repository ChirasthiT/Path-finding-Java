public class Map {
    EntryArraylist map;

    public Map() {
        map = new EntryArraylist();
    }
    
    public void put(Cell key, Cell value) {
        map.add(new Entry(key, value));
    }
    
    public boolean containsKey(Cell key) {
        return map.contains(key);
    }

    public Cell get(Cell key) {
        return map.gethelper(key);
    }
}
