package first.model;

public class Thingy
{
	//Declaration Section
	/**
	 * Thingy Name
	 */
	private String name;
	
	/**
	 * Thingy favorite food
	 */
	private String food;
	
	/**
	 * Thingy favorite movie
	 */
	private String movie;

	public Thingy()
	{
		name = "Potato Head";
		food = "mexican";
		movie = "lots of plot";
	}
	
	public void setFood(String Food)
	{
		this.food = food;
	}
	
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMovie()
	{
		return movie;
	}
	
	public String getFood()
	{
		return food;
	}
}
