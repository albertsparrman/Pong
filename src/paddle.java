public class paddle {
    private int x;
    private int y;
    private  int width = 10;

    public paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveDown() {
        y += 1;
    }

    public void moveUp() {
        y -= 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
}
