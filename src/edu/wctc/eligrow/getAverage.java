package edu.wctc.eligrow;

public class getAverage {
    public static String getAverage(double[] a, int c)throws InvalidTestScore{
        double avg = 0;

        for(int arrayCounter = 0; arrayCounter < c; arrayCounter++){
            if(a[arrayCounter] > 100) throw new InvalidTestScore("Error: The score is greater than 100");
            if(a[arrayCounter] < 0) throw new InvalidTestScore("Error: The score is less than 0");
            avg += a[arrayCounter];
        }
        return "Average\t|\t" +  avg;
    }
}
