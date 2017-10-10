package assignment;

public class Cow extends Animal {
	
	private String food;
	public void name()
	{
		System.out.println("It is a cow object...");
	}
	public void setFood(String _food)
	{
		food = _food;
	}
	public String getFood()
	{
		return food;
	}
}
