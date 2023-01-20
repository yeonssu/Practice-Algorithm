package Implements;

public class BoardGame {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        System.out.println(boardGame(board1, "RRDLLD")); // 4

        int[][] board2 = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        System.out.println(boardGame(board2, "UUUDD")); // null

        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(boardGame(board3, "DDRRRUDUDUD")); // 0
    }
    public static Integer boardGame(int[][] board, String operation) {
        int x = 0;
        int y = 0;
        Integer result = 0;

        String[] move = operation.split("");
        for (String s : move){
            if(s.equals("U")){
                x--;
            } else if (s.equals("D")) {
                x++;
            } else if (s.equals("L")) {
                y--;
            } else if (s.equals("R")) {
                y++;
            }
            if (x<0||y<0||x>board.length||y>board.length) return null;
            if(board[x][y]==1) result++;
        }
        return result;
    }
}
