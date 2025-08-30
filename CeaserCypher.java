
public class CeaserCypher {
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
