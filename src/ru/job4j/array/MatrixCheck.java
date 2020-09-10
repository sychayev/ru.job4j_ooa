package ru.job4j.array;
/*
Создал клас MatrixCheck.Проверяет
выигрышные комбинации в сокобан.
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rst = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                rst = false;
                break;
            }
        }
        return rst;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] mass = new char[][]{
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}};
        System.out.println(MatrixCheck.monoHorizontal(mass, 1));

        char[][] mass1 = new char[][]{
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}};
        System.out.println(MatrixCheck.monoVertical(mass1, 2));
        char[][] mass2 = new char[][]{
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}};
        System.out.println(MatrixCheck.extractDiagonal(mass2));

        char[][] mass3 = new char[][]{
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        System.out.println(MatrixCheck.isWin(mass3));
        char[][] mass4 = new char[][]{
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        System.out.println(MatrixCheck.isWin(mass4));
        char[][] mass5 = new char[][]{
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        System.out.println(MatrixCheck.isWin(mass5));
    }
}
