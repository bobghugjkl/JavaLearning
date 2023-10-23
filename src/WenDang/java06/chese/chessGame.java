package WenDang.java06.chese;

public class chessGame {
    public static void nextStep(Piece piece){
        piece.runway();
    }
    public static void main(String[] args) {
        Horse horse = new Horse();
        chessGame.nextStep(horse);
        Cannon con = new Cannon();
        chessGame.nextStep(con);
    }
}
