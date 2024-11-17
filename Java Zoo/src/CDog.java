/**
 * Class: CDog
 * this is a child class of CAnimal
 * @author Nicolas Le
 *
 */
public class CDog extends CAnimal
{
		
	// ----------------------------------------------------------------------
	// ----------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------
	// ----------------------------------------------------------------------
	// Never make public properties.  
	// Make protected or private with public get/set methods
	
	private int m_intAge = 0;
	private float m_sngWeight = 0;	
	
	/**
	 * CDog - default constructor
	 * Initializes a default dog object with no name, age 0, and weight 0.
	 */
	public CDog( )
	{
		Initialize( "", 0, 0 );
	}
	
	/**
	 * CDog 
	 * Constructor with a name parameter.
	 * @param strName the name of the dog
	 */
	public CDog( String strName )
	{
		Initialize( strName, 0, 0 );
	}
	

	/**
	 * CDog 
	 * Constructor with name and age parameters.
	 * @param strName the name of the dog
	 * @param intAge the age of the dog
	 */
	public CDog( String strName, int intAge )
	{
		Initialize( strName, intAge, 0 );
	}

	/**
	 * CDog
	 * Constructor with name, age, and weight parameters.
	 * @param strName the name of the dog
	 * @param intAge the age of the dog
	 * @param sngWeight the weight of the dog
	 */
	public CDog( String strName, int intAge, float sngWeight )
	{
		Initialize( strName, intAge, sngWeight );
	}

	/**
	 * Initialize
	 * This method initializes all values of the dog object.
	 * @param strName the name of the dog
	 * @param intAge the age of the dog
	 * @param sngWeight the weight of the dog
	 */
	public void Initialize( String strName, int intAge, float sngWeight )
	{
		// protected: can be accessed only by the class in which it was declared
		//			or by classes that inherit.
		SetType( "Dog" );
		SetName( strName );
		SetAge( intAge );
		SetWeight( sngWeight );
	}

	/**
	 * SetAge 
	 * Sets the age of the dog.
	 * @param intNewAge the new age of the dog, clipped to 0 if negative
	 */
	public void SetAge( int intNewAge )
	{
		// Negative?
		if( intNewAge < 0  )
		{
			// Yes, clip to 0
			intNewAge = 0;
		}
		
		m_intAge = intNewAge;
	}
	
	/**
	 * GetAge
	 * Retrieves the age of the dog.
	 * @return the age of the dog
	 */
	public int GetAge( )
	{
		return m_intAge;
	}
	
	/**
	 * SetWeight
	 * Sets the weight of the dog.
	 * @param sngNewWeight the new weight of the dog, clipped to 0.0 if negative
	 */
	public void SetWeight( float sngNewWeight )
	{
		// Negative?
		if( sngNewWeight < 0 )
		{
			// Yes, clip it
			sngNewWeight = 0.0f;
		}
		
		m_sngWeight = sngNewWeight;
	}
	
	/**
	 * GetWeight
	 * Retrieves the weight of the dog.
	 * @return the weight of the dog
	 */
	public float GetWeight( )
	{
		return m_sngWeight;
	}

	
	/**
	 * MakeNoise
	 * Produces the noise a dog makes by calling the Bark method.
	 */
	public void MakeNoise( )
	{
		Bark( );
	}
	

	/**
	 * Bark
	 * Produces barking sounds based on the dog's weight.
	 */
	public void Bark( )
	{
		// Big dog?
		if( GetWeight( ) < 15 )
		{
			// No, ankle biter
			System.out.println( "Yip, yip, yip" );
		}
		else
		{
			// Yes
			System.out.println( "Woof, woof" );
		}
	}

	/**
	 * Fetch
	 * Displays fetching behavior based on the dog's age.
	 */
	public void Fetch( )
	{
		// Old dog?
		if( GetAge( ) > 10 )
		{
			// Yes
			System.out.print( "Woah, woah, woah.\n" 
							+ "How about you fetch the stick this time.\n"
							+ "And some bacon.\n" );
		}
		else
		{
			// No
			System.out.println( "Fetching the tasty stick" );
		}
	}
	
	/**
	 * Print
	 * Prints the dog's details and performs Bark and Fetch actions.
	 */
	public void Print( )
	{
		System.out.println( "Name:   " + GetName( ) );
		System.out.println( "Age:    " + GetAge( ) );
		System.out.println( "Weight: " + GetWeight( ) );
		
		// Methods
		Bark( );
		Fetch( );
		
		System.out.println( "" );
		System.out.println( "" );
	}
	
}
