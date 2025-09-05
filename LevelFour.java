import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LevelFour {
     public static void main(String[] args) throws IOException {
          String number = "12345";

          while (true)
          {
               String link = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + number;

               URL url = new URL(link);
               BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
               String line = reader.readLine();
               
               Pattern lookingFor = Pattern.compile("[0-9]{5}");
               Matcher match = lookingFor.matcher(line);

               System.out.println(number);
               if(match.find()){
                    number = (match.group());
               }
          }
          
          
               
     }
}