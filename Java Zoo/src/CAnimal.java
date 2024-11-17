/**
 * CAnimal class represents a generic animal.
 * It serves as a base class for other specific animal types.
 */
public class CAnimal
{
	// Properties
	private String m_strName = "";
	private String m_strType = "";
	
	// Methods
    
    /**
     * Sets the name of the animal.
     * If the name exceeds 50 characters, it is truncated.
     *
     * @param strNewName the new name of the animal
     */
	//Set the name
	public void SetName( String strNewName )
	{
		int intLength = 0;
		
		intLength = strNewName.length( );
		
		//Too Long?
		if ( intLength > 50 )
		{
			//if longer, clip to 5o characters
			intLength = 50;
		}
		m_strName = strNewName.substring ( 0, intLength );
	}
	/**
     * Gets the name of the animal.
     *
     * @return the name of the animal
     */
	public String GetName( )
	{
		return m_strName;
	}
	/**
     * Sets the type of the animal.
     * If the type exceeds 50 characters, it is truncated.
     *
     * @param strNewType the new type of the animal
     */
	public void SetType ( String strNewType )
	{
		//Negative?
		int intLength = 0;
		
		intLength = strNewType.length ( ) ;
		
		//Too Long?
		if ( intLength > 50 )
		{
			//if longer, clip to 5o characters
			intLength = 50;
		}
		m_strType = strNewType.substring ( 0, intLength );
	}
	 /**
     * Gets the type of the animal.
     *
     * @return the type of the animal
     */
	public String GetType( )
	{
		return m_strType;
	}
	/**
     * Makes a noise. This is a placeholder for the noise an animal makes.
     * The default implementation outputs "Undefined".
     */
	public void MakeNoise ( )
	{
		System.out.println( "Undefined" );
	}
}