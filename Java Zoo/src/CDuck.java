/**
 * CDuck child class
 * Defines the behavior of a duck as a specific type of animal.
 * @author Nicolas Le
 */
public class CDuck extends CAnimal
{
	/**
     * Method: makeNoise
     * Outputs the noise specific to a duck.
     */
    @Override
	public void MakeNoise( )
	{
		System.out.println( "Quack" );
	}
}