/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package show.what.you.know2;
import java.util.Scanner;

/**
 *
 * @author shqia0005
 */
public class ShowWhatYouKnow2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        System.out.println("Please enter your favourite hockey/baseball/sports star statistics for the past 5 games");
        double average = 0.0;
        double total = 0.0;
        int[]statistics = new int[5];
        for(int i = 0;i<=4;i=i+1)
        {
            statistics[i] = keyedInput.nextInt();
        }
        for(int i = 0;i<=4;i=i+1)
        {
            total = total + statistics[i];
        }
        for(int i = 0;i<=4;i=i+1)
        {
            average = total / 5;
        }
        System.out.println("The average of statistics is " + average + ".");
        
        
    }
    
}
