package ch.hslu.oop.sw05;

public final class Circle extends Shape{

    private int diameter;

    public Circle(final int x, final int y,
                     final int diameter) {
        super(x, y);
        this.diameter = diameter;


    }

    @Override
    public int getPerimeter() {
        return (this.diameter * (int)Math.PI);
    }
}
