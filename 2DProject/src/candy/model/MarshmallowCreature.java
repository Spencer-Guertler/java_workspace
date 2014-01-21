package candy.model;

public class MarshmallowCreature
{
	//Declaration Section
	private String name;
	private int eyes;
	private int legs;
	private int arms;
	private boolean hasButton;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
	
	public void setLegs(int legs)
	{
		this.legs = legs;
	}
	
	public void setArms(int arms)
	{
		this.arms = arms;
	}
	
	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEyes()
	{
		return eyes;
	}
	
	public int getlegs()
	{
		return legs;
	}
	
	public int getArms()
	{
		return arms;
	}
	
	public boolean getHasButton()
	{
		return hasButton;
	}
	/**
	 * Create a MarshmallowCreature
	 * @param name The name of the creature.
	 * @param eyes The number of eyes the creature has.
	 * @param legs The number of legs the creature has.
	 * @param arms The number of legs the creature has.
	 * @param hasButton Whether or no the creature has a button.
	 */
	
	public MarshmallowCreature(String name, int eyes, int legs, int arms, boolean hasButton)
	{
		this.name = name;
		this.eyes = eyes;
		this.legs = legs;
		this.arms = arms;
		this.hasButton = hasButton;
	}
}
