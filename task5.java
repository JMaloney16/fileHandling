import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class task5
{
    public static void SearchByTerm(String[][] database, String search){
        boolean found = false;
        for (int i = 0; i<10; i++){
            if (database[i][0].equals(search)){
                System.out.println("FOUND: " + database[i][1]);
                found = true;
            }
        }
        if (found == false){
            System.out.println("TERM NOT FOUND");
        }
    }
    
    public static void SearchDescriptionsForKeyword(String[][] database, String search){
        boolean found = false;
        for (int i = 0; i<10; i++){
            if ((database[i][1].toLowerCase()).contains(search.toLowerCase())){
                System.out.println("FOUND for " + database[i][0]);
                System.out.println(database[i][1]);
                found = true;
            }
        }
        if (found == false){
            System.out.println("NO DESCRIPTIONS FOUND containing this key word");
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader(".\\computingterms.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner input = new Scanner(System.in);
        
        String[][] database = new String[10][2];
        int index = 0;
        int isTerm = 1;
        String choice = "0";
        String line = br.readLine();
        do {
            if (isTerm == 1){
                database[index][0] = line;
                isTerm = 0;
            } else{
                database[index][1] = line;
                isTerm = 1;
                index ++;
            }
        } while ((line = br.readLine()) != null);
        while (!choice.equals("3")){
            System.out.println("1. Search for a term\n2. Search for a keyword in the descriptions\n3. End\nKey in choice ");
            choice = input.nextLine();
            if (choice.equals("1")){
                System.out.println("Please enter a search term: ");
                String search = input.nextLine();
                SearchByTerm(database, search);
            } else if (choice.equals("2")){
                System.out.println("Please enter a keyword: ");
                String search = input.nextLine();
                SearchDescriptionsForKeyword(database, search);
            }
    
        }
    }
}
