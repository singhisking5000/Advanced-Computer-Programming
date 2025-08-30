import java.util.ArrayList;


public class Gizmo
 {
     /** Returns the name of the manufacturer of this Gizmo. */
     public String getMaker()
     {
         /* implementation not shown */
     }
     /** Returns true if this Gizmo is electronic, and false
     * otherwise.
     */
     public boolean isElectronic()
     {
         /* implementation not shown */
     }
     /** Returns true if this Gizmo is equivalent to the Gizmo
     * object represented by the
     * parameter, and false otherwise.
     */
     public boolean equals(Object other)
     {
         /* implementation not shown */
     }
     // There may be instance variables, constructors, and methods not shown.
}



public class OnlinePurchaseManager {

    private ArrayList<Gizmo> purchases;

    public int countElectronicsByMaker(String maker)
    {
    int count;

    for (Gizmo object : purchases)
    {
        if (object.isElectronic() && object.getMaker() == maker)
        {
            count++;
        }
    }
    return count;
    }

    
    public boolean hasAdjacentEqualPair()
    {
        for (int i = 0; i < purchases.size() - 1; i++)
        {
        if (purchases.get(i).equals(purchases.get(i+1)))
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    }
}