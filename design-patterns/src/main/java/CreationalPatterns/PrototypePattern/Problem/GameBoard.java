package CreationalPatterns.PrototypePattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class GameBoard
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

    public void showBoardState()
    {
        System.out.println("Current Board State");
    }
}
