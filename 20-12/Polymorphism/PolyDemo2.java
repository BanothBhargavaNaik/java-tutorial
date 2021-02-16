/* Polymorphism Example */

abstract class Shape
{
public abstract void draw(); 
public abstract void erase();
}

class Circle extends Shape 
{
public void draw() 
	{
		System.out.println("Circle.draw()");
	}
public void erase() 
	{
		System.out.println("Circle.erase()");
	}
}

class Square extends Shape 
{
public void draw() 
	{
		System.out.println("Square.draw()");
	}
public void erase() 
	{
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape 
{
public void draw() 
	{
		System.out.println("Triangle.draw()");
	}	
public void erase() 
	{
		System.out.println("Triangle.erase()");
	}
}

public class PolyDemo2
{
public static Shape randShape() 
	{
		switch((int)(Math.random() * 3))
		{
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
public static void main(String[] args) 
	{
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for(int i = 0; i < s.length; i++)
		s[i] = randShape();
		// Make polymorphic method calls:
		for(int i = 0; i < s.length; i++)
		s[i].draw();
	}
} 