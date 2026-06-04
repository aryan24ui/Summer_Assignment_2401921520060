class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top row
            for (int j = startCol; j <= endCol; j++)
                result.add(matrix[startRow][j]);
            startRow++;

            // right column
            for (int i = startRow; i <= endRow; i++)
                result.add(matrix[i][endCol]);
            endCol--;

            // bottom row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--)
                    result.add(matrix[endRow][j]);
                endRow--;
            }

            // left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--)
                    result.add(matrix[i][startCol]);
                startCol++;
            }
        }

        return result;
    }
}
