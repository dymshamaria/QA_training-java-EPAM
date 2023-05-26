package com.epam.rd.autotasks.segments;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Segment {

    final Point start;
    final Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null || start.equals(end))
            throw new IllegalArgumentException();
        this.start = start;
        this.end = end;
    }

    double length() {
        double x1 = Math.pow(start.getX() - end.getX(), 2);
        double y1 = Math.pow(start.getY() - end.getY(), 2);
        return Math.sqrt(x1 + y1);
    }

    Point middle() {
        return new Point((start.getX() + end.getX()) / 2,
                (start.getY() + end.getY()) / 2);
    }

    Point intersection(Segment another) {
        if (another.start == null || another.end == null || another.start.equals(another.end)) {
            throw new IllegalArgumentException();
        }
        double k1 = 0;
        double k2 = 0;

        if (end.getY() == start.getY()) {
            k1 = 0;
        } else {
            k1 = ((end.getY() - start.getY()) / (end.getX() - start.getX()));
        }

        if (another.start.getY() == another.end.getY()) {
            k2 = 0;
        } else {
            k2 = ((another.end.getY() - another.start.getY()) / (another.end.getX() - another.start.getX()));
        }
        double b1 = ((start.getY()) - (k1 * start.getX()));
        double b2 = ((another.start.getY()) - (k2 * another.start.getX()));

        if (k1 != k2) {
            double x = ((b2 - b1) / (k1 - k2));
            double y = ((k1 * x) + b1);
            if (x < max(min(start.getX(), end.getX()), min(another.start.getX(), another.end.getX())) ||
                    (x > min(max(start.getX(), end.getX()), max(another.start.getX(), another.end.getX())))) {
                return null;
            } else {
                return new Point(x, y);
            }
        }
        return null;
    }
}
