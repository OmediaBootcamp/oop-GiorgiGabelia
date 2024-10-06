package dev.omedia.section7.exc33;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return d(this.x, this.y, 0, 0);
    }

    public double distance(Point point) {
        return d(this.x, this.y, point.getX(), point.getY());
    }


    public double distance(int xB, int yB) {
        return d(this.x, this.y, xB, yB);
    }

    private double d(double xA, double yA, double xB, double yB) {
        return Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
    }
}

