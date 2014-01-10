package first.model;

public class Friend
{

	private String name;
	private String humorStyle;
	private int age;
	private String interest;
	private boolean likesPineapple;
	private double weight;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHumorStyle(String humorStyle)
	{
		this.humorStyle = humorStyle;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setInterest(String interest)
	{
		this.interest = interest;
	}
	
	public void setLikesPineapple(boolean likesPineapple)
	{
		this.likesPineapple = likesPineapple;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getHumorStyle()
	{
		return humorStyle;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getInterest()
	{
		return interest;
	}
	
	public boolean getLikesPineapple()
	{
		return likesPineapple;
	}
	
	public double getWeight()

	{
		return weight;
	}
	
	/**
	 * creates a default Friend with bad values
	 */
	public Friend()
	{
		name = "nameless";
		humorStyle = "less than none";
		age = -10;
		interest = "absolutly nothing";
		likesPineapple = false;
		weight = - 99.999999;
	}
	
	public Friend(String name, String humorStyle, int age, String interest, boolean likesPineapple, double weight)
	{
		this.name = name;
		this.humorStyle = humorStyle;
		this.age = age;
		this.interest = interest;
		this.likesPineapple = likesPineapple;
		this.weight = weight;
	}
	
}
