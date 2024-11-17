/**
 * CTrainedDog child class
 * @author Nicolas Le
 */
public class CTrainedDog extends CDog 
{
    // Properties
    private String m_strBreed = "";

    /**
     * Method: displayInfo
     * Abstract: Displays the dog's details and actions.
     */
    public void Print() 
    {
        System.out.println("Name:     " + GetName());
        System.out.println("Age:      " + GetAge());
        System.out.println("Weight:   " + GetWeight());
        System.out.println("Breed:    " + GetBreed());

        // Methods
        Bark();
        Fetch();
        PlayDead();
        System.out.println("");
    }

    /**
     * Method: setBreed
     * Sets the breed of the dog, clipping to a maximum of 10 characters.
     * @param strNewBreed The breed of the dog.
     */
    public void SetBreed(String strNewBreed)
    {
        int intStopIndex = Math.min(strNewBreed.length(), 10);
        m_strBreed = strNewBreed.substring(0, intStopIndex);
    }

    /**
     * Method: getBreed
     * @return The breed of the dog.
     */
    public String GetBreed() 
    {
        return m_strBreed;
    }

    /**
     * Method: playDead
     * Simulates the dog playing dead based on age.
     */
    public void PlayDead() 
    {
        if (GetAge() < 5) 
        {
            System.out.println("Bang! Oh, you got me.");
        } else {
            System.out.println("Treat first. Trick second.");
        }
    }

    /**
     * Method: fetchNewPaper
     * Simulates fetching the paper based on the dog's age.
     */
    public void FetchNewPaper() 
    {
        if (GetAge() < 2) 
        {
            System.out.println("I'm too young.");
        } else {
            System.out.println("Here's your paper.");
        }
    }

    /**
     * Method: Initialize
     * Initializes the breed property.
     * @param strBreed The breed of the dog.
     */
    public void Initialize(String strBreed) 
    {
        SetType("Trained Dog");
        SetBreed(strBreed);
    }

    // Constructors
    /**
     * Default constructor.
     */
    public CTrainedDog() 
    {
        super();
       
    }

    /**
     * Constructor with name parameter.
     * @param strName The dog's name.
     */
    public CTrainedDog(String strName) 
    {
        super(strName);
        Initialize("");
    }

    /**
     * Constructor with name and age parameters.
     * @param strName The dog's name.
     * @param intAge The dog's age.
     */
    public CTrainedDog(String strName, int intAge)
    {
        super(strName, intAge);
        Initialize("");
    }

    /**
     * Constructor with name, age, and weight parameters.
     * @param strName The dog's name.
     * @param intAge The dog's age.
     * @param sngWeight The dog's weight.
     */
    public CTrainedDog(String strName, int intAge, float sngWeight) 
    {
        super(strName, intAge, sngWeight);
        Initialize("");
    }

    /**
     * Constructor with name, age, weight, and breed parameters.
     * @param strName The dog's name.
     * @param intAge The dog's age.
     * @param sngWeight The dog's weight.
     * @param strBreed The dog's breed.
     */
    public CTrainedDog(String strName, int intAge, float sngWeight, String strBreed) 
    {
        super(strName, intAge, sngWeight);
        Initialize(strBreed);
    }
}
