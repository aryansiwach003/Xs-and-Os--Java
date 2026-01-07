import java.util.*;
class game{
     public static void main(String[] args){
         char [][] board=new char[3][3];
         for(int row=0;row<board.length;++row){
              for(int col=0;col<board[0].length;++col){
                   board[row][col]=' ';
              }
         }
          Scanner sc=new Scanner(System.in);
        char player='X';
        boolean game=false;
        while(!game){
            printBoard(board);
            System.out.println("Player"+ player + "enter : ");
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(board[r][c]==' '){
                board[r][c]=player;
                game=check(board,player);
                if(game){
                     System.out.println("Player"+ player + "won");
                }
                else{
                    if(player=='X'){
                        player='O';
                    }
                    else{
                        player='X';
                    }
                }
            }
            else{
                System.out.println("Invalid Move");
            }
            printBoard(board);

        }
     }
     public static void printBoard(char [][] board){          
         for(int row=0;row<board.length;++row){
              for(int col=0;col<board[0].length;++col){
                   System.out.print(board[row][col]+"|");
              }
              System.out.println();
         }
     }
     public static  boolean check(char[][] board,char player){
           for(int row=0;row<board.length;++row){
                if(board[row][0]==player && board[row][1]==player && board[row][0]==player){
                      return true;
                }
           }
           for(int col=0;col<board[0].length;++col){
                if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                      return true;
                }
           }
           if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
               return true;
           }
           if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
               return true;
           }
           return false;
     }
     
}