package stupid;

public class Dumb
{
	private int blerg;
	private Car myCar;
	
	public Dumb()
	{
		myCar = new Car();
	}
	
	public Car getMyCar()
	{
		return myCar;
	}
	
	public void setBlerg(int blerg)
	{
		this.blerg = blerg;
	}
	
	public int getBlerg()
	{
		return blerg;
	}
}
