/**
 * Created by Rogier on 16-12-16 in Enschede.
 */
public final class Move {
    private GridMark mark;
    private int y;
    private int x;
    private int z;


    public Move(String moveString, GridMark mark) {
    }

    public Move(int x, int y, GridMark mark){
        this.x = x;
        this.y = y;
        this.mark = mark;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setZ(int z){
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public GridMark getMark() {
        return mark;
    }

    @Override
    public String toString() {
        switch (y){
            case 0:
                return "a" + x;
            case 1:
                return "b" + x;
            case 2:
                return "c" + x;
            case 3:
                return "d" + x;
            default:
                return "error";
        }
    }
}
