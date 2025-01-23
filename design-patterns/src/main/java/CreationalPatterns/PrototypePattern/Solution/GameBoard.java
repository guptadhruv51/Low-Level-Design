package CreationalPatterns.PrototypePattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard>
{
    private List<GamePiece> pieceList=new ArrayList<>();

    public void addPiece(GamePiece piece)
    {
        pieceList.add(piece);
    }

    public List<GamePiece> getPieceList()
    {
        return pieceList;
    }

    @Override
    public GameBoard clone() {
        GameBoard newboard=new GameBoard();
        for(GamePiece piece:pieceList)
        {
            newboard.addPiece(piece.clone());
        }
        return newboard;
    }

    public void showBoardState()
    {
        System.out.println("Current Board State");
    }
}
