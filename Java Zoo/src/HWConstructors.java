/**
 * Class: Java 
 * Demonstrate OOP Concepts
 * This class contains methods to demonstrate constructors, overloading,
 * inheritance, and the use of the `super` keyword in Java.
 * @author Nicolas Le
 */
public class HWConstructors 
{
	/**
     * Main method - this is where the program starts.
     * @param astrCommandLine an array of command-line arguments passed to the program
     */
	public static void main( String astrCommandLine[] )
	{				
		Step1ConstructorsAndOverloading( );		
		Step2InheritanceAndSuper( );		
	}	
		
	/**
     * Name: Step1ConstructorsAndOverloading
     * Abstract: Demonstrates the use of constructors and overloading by creating
     * instances of the CDog class with varying parameters.
     */
	public static void Step1ConstructorsAndOverloading( )
	{
		System.out.println( "Step 1 - Constructors and overloading" );
		System.out.println( "----------------------------------------" );

		CDog clsBuster1 = new CDog( );
		CDog clsBuster2 = new CDog( "Buster2" );
		CDog clsBuster3 = new CDog( "Buster3", 11 );
		CDog clsBuster4 = new CDog( "Buster4", 11, 40 );
		
		clsBuster1.Print( );
		clsBuster2.Print( );
		clsBuster3.Print( );
		clsBuster4.Print( );
	}	

	/**
     * Name: Step2InheritanceAndSuper
     * Abstract: Demonstrates inheritance and the use of the `super` keyword
     * by creating instances of the CTrainedDog class.
     */
	public static void Step2InheritanceAndSuper( )
	{
		System.out.println( "Step 2 - Inheritance and super" );
		System.out.println( "----------------------------------------" );
		
		CDog clsSuperBuster1 = new CTrainedDog( );
		CDog clsSuperBuster2 = new CTrainedDog( "2SuperBuster" );
		CDog clsSuperBuster3 = new CTrainedDog( "3SuperBuster", 11 );
		CDog clsSuperBuster4 = new CTrainedDog( "4SuperBuster", 11, 40 );
		CDog clsSuperBuster5 = new CTrainedDog( "5SuperBuster", 11, 40, "Basset Hound" );

		clsSuperBuster1.Print( );
		clsSuperBuster2.Print( );
		clsSuperBuster3.Print( );
		clsSuperBuster4.Print( );
		clsSuperBuster5.Print( );
	}	
				
}