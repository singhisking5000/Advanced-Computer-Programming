
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

     /** An ArrayList of purchased Gizmo objects, * instantiated in the constructor. */

    private ArrayList<Gizmo> purchases;

    /** Returns the number of purchased Gizmo objects that are electronic * whose manufacturer is maker, as described in part (a). */
    private int count;
     public int countElectronicsByMaker(String maker)
     {
        for (Gizmo object : purchases)
        {
            if (object.isElectronic() && object.getMaker() == maker)
            {
                count++;
            }
        }
        return count;
     }

     /** Returns true if any pair of adjacent purchased Gizmo objects are
     * equivalent, and false otherwise, as described in part (b).
     */
     public boolean hasAdjacentEqualPair()
     {
         /* to be implemented in part (b) */
     }
     // There may be instance variables, constructors, and methods not shown.

}