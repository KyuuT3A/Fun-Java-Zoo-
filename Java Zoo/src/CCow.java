/**
 * CCow child class
 * Defines the behavior of a cow as a specific type of animal.
 * @author Nicolas Le
 */
public class CCow extends CAnimal
{
	// properties
	private String m_strColor = "";
		
	 /**
     * Method: setColor
     * Sets the color of the cow.
     * @param strNewColor The new color of the cow.
     */
	public void SetColor(String strNewColor)
	{
		
		int intStopIndex = 0;
		
		// Brown by default
		if(strNewColor.equals("") == true)strNewColor = "Brown";
		
		// too long?
		intStopIndex = strNewColor.length();
		if(intStopIndex > 10)
		{
			// yes, clip to 10 characters
			intStopIndex = 10;
		}
		m_strColor = (strNewColor.substring(0, intStopIndex));
	}
	
	/**
     * Method: getColor
     * Gets the color of the cow.
     * @return The color of the cow.
     */
	public String GetColor()
	{
		return m_strColor;
	}

	/**
     * Method: graze
     * Simulates the cow grazing.
     */
	public void Graze()
	{
		System.out.println("Mmmm, this some tasty grass.");
	}
	
	/**
     * Method: makeNoise
     * Outputs the noise specific to a cow.
     */
    @Override
	public void MakeNoise( )
	{
		System.out.println( "Moooo" );
	}

	
}