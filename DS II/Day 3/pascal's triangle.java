class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList();
        
        res.add(1);
        if (rowIndex == 0) return res;

        List<Integer> prevRow = getRow(rowIndex - 1);
        
        for (int i = 1; i <= rowIndex-1; i++) {
            res.add(prevRow.get(i-1) + prevRow.get(i));
        }
        res.add(1);
        
        return res;
    }
}