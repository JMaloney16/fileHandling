import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class task4
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter(".\\lotto.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        int[] lotteryNumbers = new int[50];
        int numberOfSelectedBalls = 0;
        int winningBall = 0;
        
        while (numberOfSelectedBalls != 6){
            do  {
                winningBall = (int)Math.ceil(Math.random() * 50);
            }   while(winningBall == 0);
            if (lotteryNumbers[winningBall] == 0){
                lotteryNumbers[winningBall] = 1;
                numberOfSelectedBalls += 1;
            }
        }
        for (int i = 0; i<49; i++){
            if (lotteryNumbers[i] == 1){
                bw.write(i + "\t");
            }
        }
        bw.newLine();
        bw.close();
    }
}
