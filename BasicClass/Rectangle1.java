class Rectangle1 
{
    public int width = 0;
    public int height = 0;
   
    //two constructors
    public Rectangle1(int w,int h) {
		width=w;
		height=h;
    }

    double Rectangle1() {
        
		return width*height;
    }

    
	public static void main(String[] args) 
	{
		Rectangle1 r1= new Rectangle1(10,6);
		Rectangle1 r2= new Rectangle1(6,5);
		double area;
		area=r1.Rectangle1();
        System.out.println("the area of 1st rectangle is: "+area);

		area=r2.Rectangle1();
        System.out.println("the area of 2nd rectangle is: "+area);
	}
}
