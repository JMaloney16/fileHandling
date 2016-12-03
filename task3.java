import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class task3
{
    public static void main(String[] args) throws IOException
    {
        String[][] breakfast = new String[5][2];
        
        FileReader fr = new FileReader(".\\breakfast.txt");
        BufferedReader br = new BufferedReader(fr);
        int index = 0;
        String line = br.readLine();
        
        do {
            breakfast[index][0] = line.substring(0,5);
            breakfast[index][1] = line.substring(5, line.length());
            index ++;
        } while ((line = br.readLine()) != null);
    }
}
