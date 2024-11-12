class week6 {
  
}

record Range(int min, int max) {

}

class RangeUtil {
    static int length(Range r) {
        return r.max() >= r.min() ? r.max() - r.min() + 1 : 0;
    }
    
    static int sum(Range r) {
        int sum = 0;
        for (int i = r.min(); i <= r.max(); i++)
            sum+=i;
        return sum;
    }
    
    static Range indexes(int[] array) {
        if (array.length == 0)
            return new Range(0, -1);
        return new Range(0, array.length - 1);
    }
    
    static Range expand(Range r, int n) {
        return n > 0 ? new Range(r.min(), r.max() + n) : new Range(r.min() + n, r.max());
    }
    
}

record Range(int min, int max) {
    boolean isEmpty() {
        return this.min > this.max;
    }
    
    int length() {
        if(this.min > this.max)
            return 0;
        return this.max - this.min + 1;
    }
    
    boolean includes(int n) {
        return this.min <= n && this.max >= n;
    }
    
    boolean excludes(int n) {
        return !this.includes(n);
    }
    
    boolean isValidFor(int[] array) {
        return this.min >= 0 && this.max <= array.length - 1;
    }
    
    boolean contains(Range r) {
        return r.min() >= this.min && r.max() <= this.max;
    }
    
    Range expand(int n) {
        return n > 0 ? new Range(this.min, this.max + n) : new Range(this.min + n, this.max);
    }
}

class ArrayFunctions {
    static int sum(int[] array, Range r) {
        int s = 0; 
        for (int i = r.min(); i <= r.max(); i++)
            s += array[i];
        return s;
    }
    
    static int[] subArray(int[] array, Range r) {
        int[] a = new int[r.max() - r.min() + 1];
            for (int i = r.min(); i <= r.max(); i++)
                a[i-r.min()] = array[i];
        return a;
    }
    
    static Range valueRange(int[] array) {
        Range r = new Range(array[0], array[0]);
        for (int i = 1; i < array.length; i++)
            if (r.excludes(array[i]))
                if (r.min() > array[i])
                    r = r.expand(array[i]-r.min());
                else
                    r = r.expand(array[i]-r.max());
        return r;
    }
}

record Dimension(int l, int h) {
    Dimension {
        assert l > 0 && h > 0;
    }
    
    int area() {
        return this.l * this.h;
    }
    
    int perimeter() {
        return this.l * 2 + this.h * 2;
    }
    
    boolean isSquare() {
        return this.l == this.h;
    }
    
    boolean isVertical() {
        return this.h > this.l;
    }
    
    boolean isHorizontal() {
        return this.l > this.h;
        
    }
    
    boolean largerThan(Dimension n) {
        return this.area() > n.area();
    }
    
    Dimension scale(int n) {
        return new Dimension(this.l*n, this.h*n);
    }
}

record Position(int line, int column) {
    Position top() {
        return new Position(this.line - 1, this.column);
    }

    Position right() {
        return new Position(this.line, this.column + 1);
    }

    Position bottom() {
        return new Position(this.line + 1, this.column);
    }

    Position left() {
        return new Position(this.line, this.column - 1);
    }

    Position[] adjacent() {
        return new Position[] { this.top(), this.right(), this.bottom(), this.left() };
    }

    Position[] adjacentNonNegative() {
        int len = 2;
        boolean topGood = false;
        if (this.line > 0) {
            len++;
            topGood = true;
        }
        if (this.column > 0)
            len++;
        Position[] pos = new Position[len];
        pos[0] = topGood ? this.top() : this.right();
        pos[1] = topGood ? this.right() : this.bottom();
        if (len > 2)
            pos[2] = topGood ? this.bottom() : this.left();
        if (len == 4)
            pos[3] = this.left();
        return pos;
    }

}

class positionUtil {
    static Position[] diagonal(int n) {
        Position[] p = new Position[n];
        for (int i = 0; i < n; i++)
            p[i] = new Position(i, i);
        return p;
    }
    
    static Position[] positions(Dimension d) {
        Position[] p = new Position[d.area()];
        for (int i = 0; i < d.h(); i++) {
            for (int j = 0; j < d.l(); j++) {
                p[(i*d.l())+j] = new Position(i, j);
            }
        }
        return p;
    }
    
    static boolean contains(Position[] array, Position p) {
        for (int i = 0; i < array.length; i++)
            if (array[i].equals(p))
                return true;
        return false;
    }
}

record Point(double x, double y) {
    boolean isOrigin() {
        return this.x == 0 && this.y == 0;
    }
    
    Point scale(double n) {
        return new Point(this.x * n, this.y * n);
    }
    
    Point sum(Point p) {
        return new Point(this.x + p.x(), this.y + p.y());
    }
    
    Point sum(double xx, double yy) {
        return new Point(this.x + xx, this.y + yy);
    }
    
    double distance(Point p) {
        return Math.sqrt(((p.x() - this.x) * (p.x() - this.x)) + ((p.y() - this.y) * (p.y() - this.y)));
    }
}