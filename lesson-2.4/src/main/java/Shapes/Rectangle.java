package Shapes;

class Rectangle implements Shape {
    private double width;
    private double height;
    private Color color;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.color = new Color(fillColor, borderColor);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return color.getFillColor();
    }

    @Override
    public String getBorderColor() {
        return color.getBorderColor();
    }
}