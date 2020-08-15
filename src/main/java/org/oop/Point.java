package org.oop;

interface GenericPoint {
    double x = 0;
    double y = 0;

    double distance();

    double direction();
}

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        double xDistance = this.x - to.x;
        double yDistance = this.y - to.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point from) {
        double xDistance = this.x - from.x;
        double yDistance = this.y - from.y;
        return Math.atan2(yDistance, xDistance);
    }
}