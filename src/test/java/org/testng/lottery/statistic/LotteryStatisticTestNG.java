/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.testng.lottery.statistic;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class LotteryStatisticTestNG {
    //test nó ở đây nè
    
    //We expect the probability to be 0.00000358309
    @Test
    public void testProbabilityOfWinningWithDifferentNumber() {
        int numbersToPick = 5;
        int totalNumbers = 35;
        double expectedProbability = 0.00000358309;

        LotteryStatistic lottery = new LotteryStatistic(numbersToPick, totalNumbers);
        double actualProbability = lottery.calculateProbability();

        Assert.assertEquals(actualProbability, expectedProbability, 0.00000000001, "Probability calculation is incorrect");
    }
    //incorrect: actual != expected
//    ---
    //We expect the probability to be 0.000000000001
    @Test
    public void testProbabilityOfWinningWithWrongNumber() {
        int numbersToPick = 6;
        int totalNumbers = 100;
        double expectedProbability = 0.000000000001;

        LotteryStatistic lottery = new LotteryStatistic(numbersToPick, totalNumbers);
        double actualProbability = lottery.calculateProbability();

        Assert.assertEquals(actualProbability, expectedProbability, 0.0000000000001, "Probability calculation is incorrect");
    }
    //incorrect: actual != expected
//    ---
    //We expect the probability to be 0.00000358309
    @Test
    public void testProbabilityOfWinningWithCorrectNumber() {
        int numbersToPick = 5;
        int totalNumbers = 35;
        double expectedProbability = 0.00000358309;

        LotteryStatistic lottery = new LotteryStatistic(numbersToPick, totalNumbers);
        double actualProbability = lottery.calculateProbability();

        Assert.assertEquals(actualProbability, expectedProbability,0.00000358309, "Probability calculation is correct");
    }
    //Correct: actual == expected
}
