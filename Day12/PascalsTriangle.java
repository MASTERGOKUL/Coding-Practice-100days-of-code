/* https://leetcode.com/problems/pascals-triangle/description/*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList();
        List<List<Integer>> result = new ArrayList();
        for(int i=1;i<=numRows;i++){
        List<Integer> row = new ArrayList();
        for(int j=0;j<i;j++){
            if(j==0||j==i-1){
                row.add(1);
            }
            else{
                row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));// here i starts from 1, and the list starts from 0 , so to get the previous index of the list we do i-2.
                System.out.println("i : "+i+ " i - 2 : "+(i-2) + " j : "+j+" j-1 :"+(j-1));
                System.out.println("result.get(i-2): "+result.get(i-2)+ " result.get(i-2).get(j) : "+result.get(i-2).get(j) + " result.get(i-2).get(j-1) : "+result.get(i-2).get(j-1));
            }
        }
        result.add(row);
        }
        return result;
    }
}