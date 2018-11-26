public interface Movable {

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

class MovablePoint implements Movable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){};


    public String toString(){
        return "It's movable point";
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }
}

class MovableCircle implements Movable{

    private int radius;
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return "It's movable circle";
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }
}
