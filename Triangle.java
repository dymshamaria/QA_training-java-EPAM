package com.epam.rd.autotasks.triangle;

class Triangle {

    Point a, b, c;
    double length1, length2, length3;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException();
        }

        this.a = a;
        this.b = b;
        this.c = c;

        length1 = length1();
        length2 = length2();
        length3 = length3();

        if (length1 + length2 <= length3 || length1 + length3 <= length2 || length2 + length3 <= length1) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        return Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) -
                (c.getY() - a.getY()) * (b.getX() - a.getX())));
    }

    private double length3() {
        double xDistanceSquare = Math.pow(c.getX() - b.getX(), 2.0);
        double yDistanceSquare = Math.pow(c.getY() - b.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    private double length2() {
        double xDistanceSquare = Math.pow(a.getX() - c.getX(), 2.0);
        double yDistanceSquare = Math.pow(a.getY() - c.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    private double length1() {
        double xDistanceSquare = Math.pow(a.getX() - b.getX(), 2.0);
        double yDistanceSquare = Math.pow(a.getY() - b.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    public Point centroid() {
        double xc = (((a.getX() + b.getX() + c.getX()) / 3));
        double yc = (((a.getY() + b.getY() + c.getY()) / 3));
        return new Point(xc, yc);
    }
}
