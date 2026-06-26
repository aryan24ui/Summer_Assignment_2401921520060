interface Test {
    void square(int n);
}

class Arithmetic implements Test {
    public void square(int n) {
        System.out.println("Square = " + (n * n));
    }
}

class Outer {
    void display() {
        System.out.println("Display of Outer Class");
    }

    class Inner {
        void display() {
            System.out.println("Display of Inner Class");
        }
    }
}

class Point {
    private int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

class Box {
    protected double length, breadth;

    Box(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    double height;

    Box3D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class OOPS {
    public static void main(String[] args) {

        // Q1
        Arithmetic a = new Arithmetic();
        a.square(5);

        // Q2
        Outer o = new Outer();
        o.display();
        Outer.Inner in = o.new Inner();
        in.display();

        // Q3
        Point p = new Point(10, 20);
        p.display();
        p.setXY(30, 40);
        p.display();

        // Q4
        Box b = new Box(5, 4);
        System.out.println("Area = " + b.area());

        Box3D b3 = new Box3D(5, 4, 3);
        System.out.println("Volume = " + b3.volume());
    }
}
