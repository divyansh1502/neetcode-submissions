class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            long res = 1;
            for(int i = 1; i <= row; i++) {
                res = res * (row - i + 1) / i;
                currentRow.add((int)res);
            }
            triangle.add(currentRow);
        }
        return triangle;
    }
}