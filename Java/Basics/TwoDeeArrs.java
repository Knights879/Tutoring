public class TwoDeeArrs {
    public static void main(String[] args) {
        // int[][] mat;
        int[][] table = new int[3][4];
        // int[][] matrix = { { 0, 1, 2 },
        //                    { 3, 4, 5 },
        //                    { 6, 7, 8 } };
        // String[][] sentences = { { "First", "sentence", "." },
        //                          { "Second", "sentence", "." } };

        // Initalize 'table'
        int row = table.length;
        int col = table[0].length;
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                table[i][j] = col * i + j;
            }
        }
    }
}
