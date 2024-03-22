public class Map {
    EntryArraylist map;

    public Map() {
        map = new EntryArraylist();
    }
    
    public void put(Entry entry) {
        map.add(entry);
    }
    
    public boolean containsKey(Cell key) {
        return map.contains(key);
    }

    public Cell get(Cell key) {
        return map.gethelper(key);
    }
}
