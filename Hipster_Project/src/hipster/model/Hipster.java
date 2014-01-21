package hipster.model;
/**
 * Creates a Hipster object and gives it values
 * @author SpencerG
 * @version 1.3 11/20/13  Added getter/setters. Overloaded constructor.
 *
 */
public class Hipster
{
	/**
	 * the name of the hipster
	 */
	private String name;
	/**
	 * the type of the hipster
	 */
	private String hipsterType;
	/**
	 * the hipster's phrase
	 */
	private String hipsterPhrase;
	/**
	 * the hipster's books
	 */
	private String [] hipsterBooks;
	/**
	 * Gives the Hipster values.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Spencer";
		hipsterType = "Student Hipster";
		hipsterPhrase = "silly";
		
		fillTheBooks();
	}
	/**
	 * Initializes the hipster
	 * @param name Initializes the hipster's name
	 * @param hipsterType Initializes the hipster's type
	 * @param hipsterPhrase Initializes the hipster's phrase
	 * @param hipsterBooks Initializes the hipster's books
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	

	public String getName()
	{
		return name;
	}

	public String getHipsterType()
	{
		return hipsterType;
	}

	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	/**
	 * Puts books in the hipsterBooks array.
	 */
	public void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "The way of Kings";
		hipsterBooks[2] = "Ender's Game";
		hipsterBooks[3] = "Xenacide";
		hipsterBooks[4] = "Eragon";
	}
}
