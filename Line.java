package com.epam.rd.autotasks.intersection;

public class Line {
    final int k;
    final int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (k != b && this.k != other.k) {
            double x = (other.b - this.b) / (this.k - other.k);
            double y = this.k * x + this.b;
            return new Point((int) x, (int) y);
        } else {

            return null;
        }
    }
}
