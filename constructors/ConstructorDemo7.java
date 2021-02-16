
class PointClass 
{
	double x;
	double y;

	PointClass(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	PointClass(final PointClass oldPoint)
	{
		x = oldPoint.x;
		y = oldPoint.y;
	}

	void move(double xDelta, double yDelta)
	{
		x = x + xDelta;
		y += yDelta;
	}

	double distance(final PointClass aPoint)
	{
		return Math.sqrt((x - aPoint.x)*(x - aPoint.x) + (y - aPoint.y)*(y - aPoint.y));
		//if u r using the jdk1.5 version then just call sqrt
	}

public String toString()
{
return "x :" + x + " y= "  +y;
}
	
	
}//PointClass is closed

class LineClass
{
	PointClass start;
	PointClass end;

	LineClass(final PointClass start, final PointClass end)
	{
		this.start = start;
		this.end = end;
	}
	LineClass(double xStart, double yStart, double xEnd, double yEnd)
	{
		start = new PointClass(xStart, yStart);
		end = new PointClass(xEnd, yEnd);
	}

	double length()
	{
		return start.distance(end);
	}

	public String toString() 
	{
		return "(" +start+ ");(" +end+ ")";
	}

	public PointClass intersects(final LineClass line1)
	{
		PointClass localPoint = new PointClass(0, 0);

		double num = (this.end.y - this.start.y)*(this.start.x - line1.start.x) - 
					 (this.end.x - this.start.x)*(this.start.y - line1.start.y);

		double denom = (this.end.y - this.start.y)*(line1.end.x - line1.start.x) -
					   (this.end.x - this.start.x)*(line1.end.y - line1.start.y);

		localPoint.x = line1.start.x + (line1.end.x - line1.start.x)* num/denom;
		localPoint.y = line1.start.y + (line1.end.y - line1.start.y)* num/denom;

		return localPoint;
	}
}//class Lineclass is closed

public class ConstructorDemo7
{
	public static void main(String[] args) 
	{
		PointClass start = new PointClass(0.0, 1.0);
		PointClass end = new PointClass(5.0, 6.0);
		System.out.println("Points created are " +start+ " and " +end);
		
		LineClass line1 = new LineClass(start, end);
		LineClass line2 = new LineClass(0.0, 3.0, 3.0, 0.0);
		System.out.println("Lines created are " +line1+ " and " +line2);

		System.out.println("Intersection is " +line2.intersects(line1));
		//move the end point of line1 and show new intersection
		end.move(1.0, -5.0);
		System.out.println("Intersection is " +line1.intersects(line2));
		System.out.println("length :" + line1.length());
		System.out.println("length :" + line2.length());
	}
}
