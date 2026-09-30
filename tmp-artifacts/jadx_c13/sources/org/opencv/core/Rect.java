package org.opencv.core;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Rect {
    public int height;
    public int width;
    public int x;
    public int y;

    public Rect(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public Rect() {
        this(0, 0, 0, 0);
    }

    public Rect(Point point, Point point2) {
        double d = point.x;
        double d2 = point2.x;
        int i = (int) (d < d2 ? d : d2);
        this.x = i;
        double d3 = point.y;
        double d4 = point2.y;
        int i2 = (int) (d3 < d4 ? d3 : d4);
        this.y = i2;
        this.width = ((int) (d <= d2 ? d2 : d)) - i;
        this.height = ((int) (d3 <= d4 ? d4 : d3)) - i2;
    }

    public Rect(Point point, Size size) {
        this((int) point.x, (int) point.y, (int) size.width, (int) size.height);
    }

    public Rect(double[] dArr) {
        set(dArr);
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.x = dArr.length > 0 ? (int) dArr[0] : 0;
            this.y = dArr.length > 1 ? (int) dArr[1] : 0;
            this.width = dArr.length > 2 ? (int) dArr[2] : 0;
            this.height = dArr.length > 3 ? (int) dArr[3] : 0;
            return;
        }
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rect clone() {
        return new Rect(this.x, this.y, this.width, this.height);
    }

    public Point tl() {
        return new Point(this.x, this.y);
    }

    public Point br() {
        return new Point(this.x + this.width, this.y + this.height);
    }

    public Size size() {
        return new Size(this.width, this.height);
    }

    public double area() {
        return this.width * this.height;
    }

    public boolean empty() {
        return this.width <= 0 || this.height <= 0;
    }

    public boolean contains(Point point) {
        double d = this.x;
        double d2 = point.x;
        if (d > d2 || d2 >= r0 + this.width) {
            return false;
        }
        int i = this.y;
        double d3 = i;
        double d4 = point.y;
        return d3 <= d4 && d4 < ((double) (i + this.height));
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.height);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.width);
        int i = (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.x);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.y);
        return ((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + i) * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return this.x == rect.x && this.y == rect.y && this.width == rect.width && this.height == rect.height;
    }

    public String toString() {
        return "{" + this.x + ", " + this.y + ", " + this.width + "x" + this.height + "}";
    }
}
