
public class CeaserCypher {

    /*  
     *  A class for the a Ceaser Cypher Object
     *  (I am aware that this is spelled super wrong, but I
     *  realized this after I already coded all of this) 
     * 
     *  The Ceaser Cypher Object has a static function that 
     *  performs a ceaser cypher... suprising right?
     * 
     *  Put in encoded (or data to be encoded) and put in
     *  a digit to shift the letters in the alphabet.
     * 
     *  Written by Jamshed Kalsi 9/2/2025
     *  Advanced Computer Programming III
     */

    public static String ceaserCypher(String encoded, int distance)
    {
        encoded = encoded.toUpperCase();

        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','J','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String decodedString = "";

        for (int encodedLetter = 0; encodedLetter < encoded.length(); encodedLetter++)
        {   
            for (int letterIndex = 0; letterIndex < alphabet.length; letterIndex++)
            {
                if (encoded.charAt(encodedLetter) == alphabet[letterIndex])
                {
                    if ((letterIndex + distance) < 26)
                    {
                        decodedString += alphabet[letterIndex + distance];
                    } else
                    {
                        decodedString += alphabet[(letterIndex + distance) - 26];
                    }
                    
                }
            }
        }

        return decodedString;
    }
}