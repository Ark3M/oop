public interface Movable {

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

class MovablePoint implements Movable{

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){};


    public String toString(){
        return "It's movable point";
    }

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
