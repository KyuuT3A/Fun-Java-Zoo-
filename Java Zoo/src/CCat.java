/**
 * CCat child class
 * Defines the behavior of a cat as a specific type of animal.
 * @author Nicolas Le
 */
public class CCat extends CAnimal
{
	 /**
     * Method: makeNoise
     * Outputs the noise specific to a cat.
     */
    @Override
	public void MakeNoise( )
	{
		System.out.println( "Meow" );
	}
}