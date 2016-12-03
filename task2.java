import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class task2
{
    public static void main(String[] args) throws IOException{
        
        String[][] students = new String[5][3];
        students[0][0] = "Sophie";
        students[0][1] = "Standfield";
        students[0][2] = "Class 5";
        students[1][0] = "James";
        students[1][1] = "Kitson";
        students[1][2] = "Class 5";
        students[2][0] = "Zoe";
        students[2][1] = "Gaskill";
        students[2][2] = "Class 1";
        students[3][0] = "Paul";
        students[3][1] = "Johns";
        students[3][2] = "Class 1";
        students[4][0] = "Freya";
        students[4][1] = "Moore";
        students[4][2] = "Class 5";
        
        FileWriter fw = new FileWriter(".\\data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i<5; i++){
            String studentString = (students[i][0] + "\t" + students[i][1] + "\t" + students[i][2]);
            bw.newLine();
            bw.write(studentString);
        }
        
        bw.close();
    }
}
