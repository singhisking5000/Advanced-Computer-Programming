public class Main {

    //public static MapOfSufferingAndDoom useMe;
    public static MapOfSufferingAndDoom thingy;
    public static LevelThree anotherone;
    public static void main(String[] args) 
    {    
        thingy.getCounts();
        anotherone.patternFinder();
        System.out.println("--------MAIN--------\n\n\n\n");
        System.out.println(CeaserCypher.ceaserCypher("map", 2) + " <--- Cyphered code");
        System.out.println("\n\n\n\n--------MAIN--------");  
    }
}
