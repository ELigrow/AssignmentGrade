package edu.wctc.eligrow;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String ans = "";
        int counter = 0;
        String[] classes = new String[7];
        double[] grades = new double[7];
        do{
            System.out.print("Enter the name of class #" + (counter+1) + ": ");
            classes[counter] = keyboard.nextLine();

            System.out.print("Enter the grade you received for class #" + (counter+1) + ": ");
            grades[counter] = keyboard.nextDouble();
            keyboard.nextLine();

            if (counter < 6){
                System.out.print("Do you wish to enter another class? Type \"y\" to continue, press any other key to" +
                        " quit and average your grades.");
                ans = keyboard.nextLine();
                counter++;
            }else{
                ans = "y";
            }
        }while (ans.equalsIgnoreCase("y"));

        for(int arrayCounter = 0; arrayCounter < counter; arrayCounter++){
            System.out.println(classes[arrayCounter] + "\t|\t" + grades[arrayCounter]);
        }
        try {
            getAverage.getAverage(grades, counter);
        } catch (InvalidTestScore e){
            System.out.print("Unable to generate average.");
        }
    }
}
