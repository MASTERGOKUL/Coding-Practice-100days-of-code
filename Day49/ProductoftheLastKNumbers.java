/*problem : https://leetcode.com/problems/product-of-the-last-k-numbers/description/ */
class ProductOfNumbers {
    final List<Integer> list;
    int lastProduct;
    public ProductOfNumbers() {
        this.list = new ArrayList<Integer>();
        lastProduct = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            list.clear();
            lastProduct = 1;
        }    
        else{
            lastProduct = lastProduct * num;
            list.add(lastProduct);
        }
    }
    
    public int getProduct(int k) {
        int idx = list.size() - k;
        if(idx > 0){
            return lastProduct / list.get(idx - 1);
        }
        if(idx == 0){
            return lastProduct;
        }
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */