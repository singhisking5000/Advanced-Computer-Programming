
public class CeaserCypher {
    
    private String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    public String ceaserCypher(String encoded, int distance)
    {
        encoded.toUpperCase();

        String decodedString = "";

        for (int i = 0; i < alphabet.length; i++)
        {
            if ((i + distance) < 26)
            {
                decodedString += alphabet[(i + distance)];
            } else
            {
                decodedString += alphabet[(i + distance) - 26];
            }
        }

        return decodedString;
    }
}
