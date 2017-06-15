package edu.cnm.deepdive.chess;

public class Chess {
  
  public static final char[] BLACK_BACK = {'\u265C', '\u265E', '\u265D', '\u265B', '\u265A', '\u265D', '\u265E', '\u265C'};
  public static final char[] WHITE_BACK = {'\u2656', '\u2658', '\u2657', '\u2655', '\u2654', '\u2657', '\u2658', '\u2656'};
  public static final char BLACK_PAWN = '\u265F';
  public static final char WHITE_PAWN = '\u2659';
  
  public static void main(String[] args) {
    char[][] board = new char[8][];
    board[0] = WHITE_BACK;
    board[7] = BLACK_BACK;
    for(int i = 1; i < 7; i ++) {
      board[i] = new char[8];
    }
    for(int i = 0; i < 8; i++){
      board[1][i] = WHITE_PAWN;
      board[6][i] = BLACK_PAWN;
    }
    for(int i = 7; i >=0 ; i--) {
      for (char c : board[i]){
        System.out.print(c);
      }
      System.out.println();
    }

  }

}
