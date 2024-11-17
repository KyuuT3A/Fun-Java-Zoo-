/**
 * CDragon child class
 * Defines the behavior of a dragon as a specific type of animal.
 * @author Nicolas Le
 */
public class CDragon extends CAnimal
{
	
	// Properties
	private int m_intHeadCount = 1;

	/**
     * Method: setHeadCount
     * Sets the number of heads the dragon has.
     * @param intNewHeadCount The number of heads the dragon has.
     */
	public void SetHeadCount ( int intNewHeadCount)
	{
		if(intNewHeadCount > 0)
		{
			m_intHeadCount = intNewHeadCount;
		}
		else
		{
			System.out.println("Number of heads must be positive.");
		}
	}
	
	/**
     * Method: getHeadCount
     * Gets the number of heads the dragon has.
     * @return The number of heads the dragon has.
     */
	public int GetHeadCount()
	{
		return m_intHeadCount;
	}
	
	 /**
     * Method: breatheFire
     * Simulates the dragon breathing fire.
     */
	public void BreatheFire()
	{
		int intIndex = 0;
		// one head?
		if(GetHeadCount() == 1)
		{
			// yes
			System.out.println("The dragon beathes fire.");
		}
		else
		{
			// no, multi headed
			System.out.println("The dragon beathes from each of its " + GetHeadCount() + " heads");
			for(intIndex = 0; intIndex < GetHeadCount(); intIndex += 1)
			{
				System.out.println("*** Breathes Fire ***");
			}
		}
	}
	
	/**
     * Method: makeNoise
     * Outputs the noise specific to a dragon.
     */
    @Override
	public void MakeNoise( )
	{
		System.out.println( "Rawr" );
	}
 
}