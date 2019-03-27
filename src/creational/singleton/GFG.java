package creational.singleton;

public class GFG {
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static GFG instance;

    private GFG()
    {
        // private constructor
    }

    //method to return instance of class
    public static GFG getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new GFG();
        }
        return instance;
    }
}