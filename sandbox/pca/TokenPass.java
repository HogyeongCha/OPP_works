package sandbox.pca;

import java.util.Arrays;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        this.board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            this.board[i] = (int) (Math.random() * 10);
        }
        this.currentPlayer = (int) (Math.random() * playerCount);
        System.out.println("초기 보드 상태: " + Arrays.toString(board));
        System.out.println("현재 플레이어: " + currentPlayer);
    }

    public void distributeCurrentPlayerTokens() {
        int initialToken = board[currentPlayer];
        System.out.println("분배할 토큰 수: " + initialToken);

        board[currentPlayer] = 0;
        int nextPlayer = (currentPlayer + 1) % board.length;
        for (int i = 0; i < initialToken; i++) {
            board[nextPlayer]++;
            nextPlayer = (nextPlayer + 1 ) % board.length;
        }
        System.out.println("분배 후 보드 상태: " + Arrays.toString(board));
    }

    public static void main(String[] args) {
        TokenPass game = new TokenPass(4);
        game.distributeCurrentPlayerTokens();
    }
}
