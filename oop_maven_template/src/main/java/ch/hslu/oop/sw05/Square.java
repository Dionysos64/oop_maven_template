package ch.hslu.oop.sw05;

public final class Square extends Shape{
    private int width;

    protected Square(int x, int y, int width) {
        super(x, y);
        this.width = width;
    }


    @Override
    public int getPerimeter() {
        return (this.width * 4);
    }
}
