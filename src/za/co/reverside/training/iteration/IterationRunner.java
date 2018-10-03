/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.reverside.training.iteration;

/**
 *
 * @author Mtimkulu Jabulane
 */
public class IterationRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Array Declaration
        int[] arNum = new int[7];
        arNum[0] = 55;
        arNum[1] = 88;
        arNum[2] = 120;
        arNum[3] = 100;
        arNum[4] = 55;
        arNum[5] = 120;
        arNum[6] = 120;
        
        IterationClass ic = new IterationClass();
        System.out.println("Exercise 1 - " + ic.getLargeNum(arNum) 
                + " is the largest number");
        
        System.out.println("Exercise 2 - " + ic.getSecLargeNum(arNum) 
                + " is the second largest number");
        
        System.out.println("Exercise 3 - " + ic.getNumExist(arNum,5) );
        
        System.out.println("Exercise 4 - " + ic.getNumOcc(arNum,55) );
        
        System.out.println("Exercise 5 - " + ic.getMaxOcc(arNum) );
        
        String line = "I am an intern at Reverside";
        
        System.out.println("Exercise 6 - " + ic.getSpaceNum(line) );
        
        System.out.println("Exercise 7 - " + ic.getWordNum(line) );
        
        System.out.println("Exercise 8 - " + ic.getReplaceWord(line) );
        
        System.out.println("Exercise 9 - ");
             ic.getSort(arNum); 
        
        System.out.println("Exercise 10 - ");
            ic.getEven(arNum);

        System.out.println("Exercise 11 - ");
            ic.getFib(5);
            
        System.out.print("Exercise 12 - ");
            ic.getReverseString("Stan");
        
        System.out.println("");
        System.out.println("Exercise 13 - " + ic.strToInt("1234"));
        
        System.out.println("Exercise 14 - " + ic.maxDiff(arNum, 7) );
            
        System.out.println("Exercise 14 - " + ic.getCount(125548) );
        
        System.out.println("Exercise 15 - " + ic.getSumDgt(1231) );
        
        System.out.println("Exercise 16 - " + ic.getSumDgtOdd(1225)  );
        
        System.out.println("Exercise 17 - " + ic.reverseLast(1258)  );
        
        System.out.println("Exercise 18 - " );
            ic.vowel('J');
        
        System.out.println("");
        
        System.out.println("Exercise 19 - " + ic.getIntRev(1258) );
        
    }

}
