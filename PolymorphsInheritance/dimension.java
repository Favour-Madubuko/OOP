public class dimension{
    public static void main(String[] args) {
        int nRows = 3, nCols = 3;
        char[][] symbols = new char[nRows][nCols];

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                int num = i * nCols + j;
                symbols[i][j] = (char) ('0' + num);
            }
        }
    }
}