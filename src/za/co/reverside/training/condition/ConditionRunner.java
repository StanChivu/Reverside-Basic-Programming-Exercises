/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.reverside.training.condition;

/**
 *
 * @author Mtimkulu Jabulane
 */
public class ConditionRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Number amount 3 numbers
        ConditionClass cond = new ConditionClass(41,18,40);
        System.out.println("Exercise 1 - " + cond.getArArr3High() );
        System.out.println("Exercise 2 - " + cond.getArArr3SecondHigh() );
        
        // Number amount 7 numbers
        cond = new ConditionClass(41,18,40,44,55,88,10);
        System.out.println("Exercise 3 - " + cond.getArr7High() 
                + " is the highest  among 7 numbers");
        
        // FIZZ BUZZ FIZZBUZZ
        System.out.println("START OF FIZZ BUZZ FIZZBUZZ");
        cond.fizzBuzz(6);
        System.out.println("END OF FIZZ BUZZ FIZZBUZZ");
        
        
        // Question 5 - 6
        cond = new ConditionClass(1);
        System.out.println("Exercise 5 - " + cond.getNumCheck() );
        System.out.println("Exercise 6 - " + cond.getNumEvenOdd() );
        
        // Check Leap Year
        System.out.println("Exercise 7 - " + cond.getLeapYear(2018) );
        
        
        
    }
    
}
