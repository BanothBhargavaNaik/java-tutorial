public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
	origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
	origin = p;
    }
    public Rectangle(int w, int h) {
	this(new Point(0, 0), w, h);
    }
    public Rectangle(Point p, int w, int h) {
	origin = p;
	width = w;
	height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
	origin.x = x;
	origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int area() {
	return width * height;
    }

	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.move(10,20);
		System.out.println("r1 area :" +r1.area());

		Rectangle r2 = new Rectangle(new Point(5,5));
		r2.move(10,20);
		System.out.println("r2 area :" +r2.area());

		Rectangle r3 = new Rectangle(70,50);
		r3.move(10,20);
		System.out.println("r3 area :" +r3.area());

		Rectangle r4 = new Rectangle(new Point(5,5),60,40);
		r4.move(10,20);
		System.out.println("r4 area :" +r4.area());
}
}