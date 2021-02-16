//A simple Example on how to use 'super' keyword

class Game
{
	Game(int i)
	{
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game
	{
	BoardGame(int i)
	{
	super(i);
	System.out.println("BoardGame constructor");
	}
}

public class SuperDemo1 extends BoardGame 
{
	SuperDemo1()
	{
	super(11);
	System.out.println("SuperDemo1 constructor");
	}
	public static void main(String[] args) 
	{
	SuperDemo1 x = new SuperDemo1();
	}
} 