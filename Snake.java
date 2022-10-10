//Para representar a cobra
import java.util.LinkedList;


public class Snake<Cell>{

    private LinkedList<Cell>
    snakePartList = new LinkedList<>();
    private Cell head;
    
    public Snake(Cell initPos)
    {

        head = initPos;
        snakePartList.add(head);
        ((CellType) head).setCellType(CellType.SNAKE_NODE);
    }
    
    public void grow() {snakePartList.add(head); }

    public void move(Cell nextCell)
    {
        System.out.println("Cobra esta se movendo para " + ((CellType) nextCell).getRow() + " " + ((CellType) nextCell).getCol());
        CellType tail = (CellType) snakePartList.removeLast();
        tail.setCellType(CellType.EMPTY);

        head = nextCell;
        ((CellType) head).setCellType(CellType.SNAKE_NODE);
        snakePartList.addFirst(head);
    }

    public boolean checkCrash(CellType nextCell)
    {
        System.out.println("Vai verificar para acidente");
        for (Cell cell : snakePartList) {
            if (cell == nextCell) {
                return true;
            }
        }
        return false;
    }
    public LinkedList<CellType> getSnakePartList()
    {
        return null;
    }

    public void
    setSnakePartList(LinkedList<Cell> snakePartList)
    {
        this.snakePartList = snakePartList;
    }

    public Cell getHead() { return head; }

    public void setHead(Cell head) {this.head = head; }

    public Cell getgethead() {
        return null;
    }
}