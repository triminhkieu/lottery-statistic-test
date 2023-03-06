/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.testng.lottery.statistic;

/**
 *
 * @author Admin
 */
public class LotteryStatistic {
    /// thuật toán
    private int numbersToPick; //representing the number of numbers to pick
    private int totalNumbers; //representing the total number of possible numbers

    public LotteryStatistic(int numbersToPick, int totalNumbers) {
        this.numbersToPick = numbersToPick;
        this.totalNumbers = totalNumbers;
    }
    //method that returns the probability of winning the lottery
    public double calculateProbability() {
        int possibleOutcomes = 1;
        for (int i = 1; i <= numbersToPick; i++) {
            possibleOutcomes *= (totalNumbers - i + 1);
        }
        int winningOutcomes = 1;
        for (int i = 1; i <= numbersToPick; i++) {
            winningOutcomes *= i;
        }
        return 1.0 / (possibleOutcomes / winningOutcomes);
    }
}
