abstract class Shape {
    private int x, y;
    private String color;
    public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
    }
    public int getX() {
    return x;
    }
    public void setX(int x) {
    this.x = x;
    }
    public int getY() {
    return y;
    }
    public void setY(int y) {
    this.y = y;
    }
    public String getColor() {
    return color;
    }
    public void setColor(String color) {
    this.color = color;
    }
    public abstract void draw();
    public void move(int deltaX, int deltaY) {
    x += deltaX;
    y += deltaY;
    System.out.println("Shape moved to (" + x + ", " + y + ")");
    }
    }
    class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, String color, int radius) {
    super(x, y, color);
    this.radius = radius;
    }
    public int getRadius() {
    return radius;
    }
    public void setRadius(int radius) {
    this.radius = radius;
    }
    public void draw() {
    System.out.println("Drawing Circle with radius " + radius + " at (" +
    getX() + ", " + getY() + ")");
    }
    public double getArea() {
    return Math.PI * radius * radius;
    }
    }
    class Square extends Shape {
    private int sideLength;
    public Square(int x, int y, String color, int sideLength) {
    super(x, y, color);
    this.sideLength = sideLength;
    }
    public int getSideLength() {
    return sideLength;
    }
    public void setSideLength(int sideLength) {
    this.sideLength = sideLength;
    }
    public void draw() {
    System.out.println("Drawing Square with side length " + sideLength + " at"
    + "{" + getX() + ", " + getY() + "}" );
    }
    public int getPerimeter() {
    return 4 * sideLength;
    }
    }
    class Rectangle extends Shape {
    private int width, height;
    public Rectangle(int x, int y, String color, int width, int height) {
    super(x, y, color);
    this.width = width;
    this.height = height;
    }
    public int getWidth() {
    return width;
    }
    public void setWidth(int width) {
    this.width = width;
    }
    public int getHeight() {
    return height;
    }
    public void setHeight(int height) {
    this.height = height;
    }
    public void draw() {
    System.out.println("Drawing Rectangle with width " + width + " and");
    }
    }
    public class DrawingappTT {
    public static void main(String[] args) {
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
    Shape[] shapes = new Shape[3];
    Circle circle = new Circle(15, 15, "purple", 10);
    shapes[0] = circle;
    Square square = new Square(20, 20, "black", 12);
    shapes[1] = square;
    Rectangle rectangle = new Rectangle(20, 20, "red", 8, 6);
    shapes[2] = rectangle;
    for (Shape shape : shapes) {
    shape.draw();
    }
    for (Shape shape : shapes) {
    shape.move(5, 5);
    shape.draw();
    }
    Circle c = (Circle) shapes[0];
    System.out.println("Circle area: " + c.getArea());
    Square s = (Square) shapes[1];
    System.out.println("Square perimeter: " + s.getPerimeter());
    }
    }