class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> tempArray = new ArrayList<>();

        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++)
            tempArray.add(matrix[x][y]);
        }

        int i = 0, j = tempArray.size() - 1;

        while (i <= j){
            int mid = (i + j) / 2;

            if (tempArray.get(mid) < target){
                i = mid + 1;
            }
            else if (tempArray.get(mid) > target){
                j = mid - 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
}
