public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

	public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getWidth(){
        return this.width;
    }
    public int getDepth(){
        return this.depth;
    }

    public boolean overlaps(Plot other) {
        int otherX = other.x;
        int otherY = other.y;
        int otherWidth = other.width;
        int otherDepth = other.depth;

        if (x < otherX + otherWidth && x + width > otherX &&
                y < otherY + otherDepth && y + depth > otherY) {
            return true;
        }
        return false;
    }

    public boolean encompass(Plot other) {
        int otherX = other.x;
        int otherY = other.y;
        int otherWidth = other.width;
        int otherDepth = other.depth;

        if (x <= otherX && y <= otherY &&
                x + width >= otherX + otherWidth && y + depth >= otherY + otherDepth) {
            return true;
        }
        return false;
    }

    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}