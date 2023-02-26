/* problem : https://leetcode.com/problems/design-hashmap/description/ */
class MyHashMap {
    Set <Integer> set = new HashSet<>();
    int[] list = new int[1000000+1];
    
    public void put(int key, int value) {
        if(!set.contains(key)){
            set.add(key);
            list[key] = value;
        }
        else{
            list[key] = value;
        }
    }
    
    public int get(int key) {
        if(!set.contains(key)){
            return -1;
        }
        return list[key];
    }
    
    public void remove(int key) {
        list[key]=-1;
        set.remove(key);

        
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */