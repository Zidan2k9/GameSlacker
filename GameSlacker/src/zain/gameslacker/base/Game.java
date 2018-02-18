/**
 * The base class for every game that will be added to a data bank
 * @author Zain Ul-Abdeen
 * @version 1.0 
 */

package zain.gameslacker.base;


public class Game
{
	private String titleOfGame;
	private int yearOfRelease;
	private String publisher;
	private String developer;
	private String director;
	private String producer;
	private String composer;
	
	
	/**
	 * Constructs a Game object with a specified title, publisher, developer and the year it was released.
	 * @param title The game title
	 * @param publisher The publisher of the game
	 * @param dev The developers of the game
	 * @param year The year the game was released
	 */
	public Game(String title,String publisher,String dev,int year)
	{
		this.titleOfGame = title;
		this.publisher = publisher;
		this.developer = dev;
		this.yearOfRelease = year;
	}
	
	/**
	 * Constructs a blank Game object
	 */
	
	public Game()
	{
		this.titleOfGame = "No title";
		this.publisher = "No publisher";
		this.developer = "No developer";
		this.yearOfRelease = 0000;
	}

	/**
	 * Returns the title of the game
	 * @return the title of the game
	 */
	public String getTitleOfGame() {
		return titleOfGame;
	}

	/**
	 * Returns the year in which the game was released
	 * @return the year of the game's release
	 */
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	
	/**
	 * Returns the publisher of the game
	 * @return the publisher of the game
	 */

	public String getPublisher() {
		return publisher;
	}
	
	/**
	 * Returns the developers of the game
	 * @return the developers of the game
	 */

	public String getDeveloper() {
		return developer;
	}
	
	/**
	 * Returns the director of the game
	 * @return the director of the game
	 * @exception NullPointerException if a developer is not set
	 */

	public String getDirector() {
		return director;
	}
	
	/**
	 * Returns the producer of the game
	 * @return the producer of the game
	 * @exception NullPointerException if a producer is not set
	 */

	public String getProducer() {
		return producer;
	}
	
	/**
	 * Returns the composer of the game's music
	 * @return the composer of the game's music
	 * @exception NullPointerException if a a composer is not set
	 */

	public String getComposer() {
		return composer;
	}
	
	/**
	 * Sets the title of the game
	 * @param titleOfGame the game's title
	 * @exception IllegalArgumentException if the parameter is not a String
	 */

	public void setTitleOfGame(String titleOfGame) {
		this.titleOfGame = titleOfGame;
	}
	
	/**
	 * Set's the year in which the game was released
	 * @param yearOfRelease the year in which the game was released
	 * @exception IllegalArgumentException if the parameter is not an int
	 */

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	/**
	 * Set's the publisher of the game
	 * @param publisher the publisher of the game
	 * @exception IllegalArgumentException if the parameter is not a String
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/**
	 * Set's the developers of the game
	 * @param developer the developers of the game
	 * @exception IllegalArgumentException if the parameter is not a String
	 */

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	/**
	 * Sets the director of the game
	 * @param director the director of the game
	 * @exception IllegalArgumentException if the parameter is not a String
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	/**
	 * Sets the producer of the game
	 * @param producer the producer of the game
	 * @exception IllegalArgumentException if the parameter is not a String
	 */

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	/**
	 * Sets the composer of the game's music
	 * @param composer the composer of the game's music
	 * @exception IllegalArgumentException if the parameter is not a String
	 */

	public void setComposer(String composer)
	{
		this.composer = composer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((composer == null) ? 0 : composer.hashCode());
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((titleOfGame == null) ? 0 : titleOfGame.hashCode());
		result = prime * result + yearOfRelease;
		return result;
	}

	/**
	 * Checks to see if 2 Game objects are the same
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Game))
			return false;
		Game other = (Game) obj;
		if (composer == null) {
			if (other.composer != null)
				return false;
		} else if (!composer.equals(other.composer))
			return false;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (titleOfGame == null) {
			if (other.titleOfGame != null)
				return false;
		} else if (!titleOfGame.equals(other.titleOfGame))
			return false;
		if (yearOfRelease != other.yearOfRelease)
			return false;
		return true;
	}

	/**
	 * Returns the title, publisher, developer, director, producer and composer of this game
	 */
	@Override
	public String toString()
	{
		return "Title of Game: " + titleOfGame
				+ "\nPublisher: " + publisher
				+ "\nDeveloper: " + developer
				+ "\nDirector: " + director
				+ "\nProducer: " + producer
				+ "\nComposer: " + composer;
	}
}