/**
 * ShowPolymorphism
 * @author Nicolas Le
 */
public class ShowPolymorphism 
{
	/**
     * main method
     * @param astrCommandLine - not used
     */ 
	public static void main( String astrCommandLine[ ] )
	{
						
		int intIndex = 0;
		
		 // make zoo
        CAnimal aclsZoo[] = new CAnimal[7];
        System.out.print("Polymorphism - Let's go to the zoo\n\n");
        
        // populate zoo = polymorphism 
        CDog clsBuster = new CDog();
        clsBuster.SetName("Buster");
        clsBuster.SetType("Dog");
        clsBuster.SetAge(11);
        clsBuster.SetWeight(40);
        
        CCat clsSunny = new CCat();
        clsSunny.SetName("Sunny");
        clsSunny.SetType("Cat");
        
        CDuck clsDaffy = new CDuck();
        clsDaffy.SetName("Daffy");
        clsDaffy.SetType("Duck");
        
        CCow clsBessie = new CCow();
        clsBessie.SetName("Bessie");
        clsBessie.SetType("Cow");
        clsBessie.SetColor("Brown");
        
        CDragon clsDragon = new CDragon();
        clsDragon.SetName("Smaug");
        clsDragon.SetType("Dragon");
        clsDragon.SetHeadCount(3);
        
        CTrainedDog clsFifi = new CTrainedDog();
        clsFifi.SetName("Fifi");
        clsFifi.SetType("Trained Dog");
        clsFifi.SetAge(2);
        clsFifi.SetWeight(10);
        clsFifi.SetBreed("Poodle");

        aclsZoo[0] = clsBuster;
        aclsZoo[1] = clsSunny;
        aclsZoo[2] = clsDaffy;
        aclsZoo[3] = null;  
        aclsZoo[4] = clsBessie;
        aclsZoo[5] = clsDragon;
        aclsZoo[6] = clsFifi;
		
		// Display zoo animals 
		for ( intIndex = 0; intIndex < aclsZoo.length; intIndex += 1 )
		{
			// is there an animal in the cage
			if ( aclsZoo [ intIndex ] != null )
			{
				// polymorph
				System.out.println( "Animal in cage #" + (intIndex + 1));
				System.out.println( "Name: " + aclsZoo [ intIndex ].GetName( ) );
				System.out.println( "Type: " + aclsZoo [ intIndex ].GetType( ) );
				aclsZoo [ intIndex ].MakeNoise( );
				
				// Declare strAnimalType
				String strAnimalType = aclsZoo[intIndex].GetType();
				
				// if this typeDog, call the fetch method
				if(strAnimalType.equals("Dog") == true)
				{
					// Order we want:
					// 1) Get array element
					// 2) explicit cast
					// 3) call child-specific method
					((CDog)aclsZoo[intIndex]).Fetch();
				}
				// if this is type Trained dog, call PlayDead method and print method
				else if((strAnimalType.equals("Trained Dog")== true))
				{
					((CTrainedDog)aclsZoo[intIndex]).PlayDead();
					((CTrainedDog)aclsZoo[intIndex]).Print();
				}
				// if this is a cow, call graze method and print the color
				else if((strAnimalType.equals("Cow")== true))
				{
					((CCow)aclsZoo[intIndex]).Graze();
					System.out.println("Color is " + ((CCow)aclsZoo[intIndex]).GetColor());
				}
				// if this is a dragon, call BreatheFire method
				else if(strAnimalType.equals("Dragon") == true)
				{
					((CDragon)aclsZoo[intIndex]).BreatheFire();
				}
				
				System.out.println("");
				
			}
		}
			
	}

}
