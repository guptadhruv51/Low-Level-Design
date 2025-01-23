package CreationalPatterns.PrototypePattern.Problem;

public class Client
{
    public static void main(String[] args) {
        GameBoard gameBoard=new GameBoard();
        gameBoard.addPiece(new GamePiece("red",1));
        gameBoard.addPiece(new GamePiece("blue",2));
        gameBoard.addPiece(new GamePiece("yellow",5));
        gameBoard.showBoardState();
    }
}
