public class Point2D
{
    private int x;
    private int y;

    public String toString()
    {
        return "A point at(" x + ", " + y +" )";
    }

    public boolean equals(Point2D other)
    {
        return (x == other.x) && (y == other.y);
    }

    public int getX() {return x;}
    public int getY() {return y;}
    
}
