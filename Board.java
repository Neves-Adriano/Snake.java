public class Board {

    final int ROW_COUNT, COL_COUNT;
    private cells[][] Cells;
    private Object cells;

    public Board(int rowCount, int columnCount)
    {
        ROW_COUNT = rowCount;
        COL_COUNT = columnCount;

        cells[][] Cell = new cells[ROW_COUNT][COL_COUNT];
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int column = 0; column < COL_COUNT; column++)Cells[row][column] = new cells(row, column);
            
        }
    }
    public cells[][] getCells()
    {
        return Cells;
    }

    public void setCells(CellType[][] celss)
    {
        this.cells = cells;

    }

    public void generateFood()
    {
        System.out.println ("vai gerar comida");
        while(true){
            int row = (int)(Math.random() * ROW_COUNT);
            int column = (int)(Math.random() * COL_COUNT);
            if(Cells[row][column].getCellType()!=CellType.SNAKE_NODE)
            break;
        }
        Cells[ROW_COUNT][COL_COUNT].setCellType(CellType.FOOD);
        System.out.println("Comida é gerada em: " + ROW_COUNT + " " + COL_COUNT);
    }
}
 