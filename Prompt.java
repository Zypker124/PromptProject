package other_programs;

import java.util.Scanner;
/**
 *    Prompt.java
 *    Provide some utilities for user input.  We want to enhance the Scanner class,
 *    so that our programs can recover from "bad" input, and also provide a way to
 *    limit numerical input to a range of values.
 *
 *    @author Angus Jyu
 *    @version 8-17-16
 */
public class Prompt
{
    /**
     *    Prompts the user for string of characters and returns the string.
     * @param ask  the prompt line
     * @return     the string input from the user
     * One for each parameter
     */
    public static String getString (String ask)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(ask + " -> ");
        String input = keyboard.nextLine();
        return input;
    }
    
    /**
     *    
     */
    public static char getChar (String ask)
    {
        // ...
        return ' ';
    }
    
    /**
     *    Prompts the user for an integer and returns the integer.
     *     @param ask  the prompt line
     *  @return    the integer input by user
     */
    public static int getInt (String ask)
    {
        boolean badInput = false;
        String input = new String("");
        int value = 0;
        do {
            badInput = false;
            input = getString(ask);
            try {
                value = Integer.parseInt(input);
                }
                catch(NumberFormatException e){
                    badInput = true;
                }
        }while(badInput);
        return value;
    }
    
    /**
     *    Prompt the user for an integer using a range of min to max,
     * and return the integer.
     * @param ask    the prompt line
     * @param min    the minimum integer accepted
     * @param max    the maximum integer accepted
     * @return      the integer input by the user
     */
    public static int getInt (String ask, int min, int max)
    {
        int value = 0;
        do {
            value = getInt(ask + "  (" + min + " - " + max + ")");
        } while (value < min || value > max);
        return value;
    }
    
    /**
     *    Prompts the user for a doubleand returns the double.
     *  @param ask   the prompt line
     *  @return      the double input by user
     */
    public static double getDouble (String ask)
    {
        boolean badInput = false;
        String input = new String("");
        double value = 0.0;
        do {
            badInput = false;
            input = getString(ask);
            try {
                value = Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                badInput = true;
            }
        }while(badInput);
        return value;
    }
    
    /**
     *    Javadoc comments go here
     */
    public static double getDouble (String ask, double min, double max)
    {
        // ...
        return 0.0;
    }
}