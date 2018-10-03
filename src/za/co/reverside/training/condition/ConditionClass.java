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
public class ConditionClass {

    private int[] arArr3 = new int[3], arArr7 = new int[7];
    private int num = 0;

    public ConditionClass(int num1, int num2, int num3) {
        setArr3(num1, num2, num3);
    }

    public ConditionClass(int num1, int num2, int num3, int num4,
            int num5, int num6, int num7) {
        setArr7(num1, num2, num3, num4, num5, num6, num7);
    }

    public ConditionClass(int num) {
        setNum(num);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNumCheck() {
        String check = "";
        if (num == 0) {
            check = num + " Zero";
        } else if (num < 0) {
            check = num + " is negative";
        } else {
            check = num + " positive";
        }

        return check;
    }

    public String getNumEvenOdd() {
        String check = "";
        if (num == 0) {
            check = num + " is even";
        } else {
            check = num + " is odd";
        }
        return check;
    }

    public String getLeapYear(int year) {
        String leap;
        if (year % 4 == 0) {
            leap = year + " is Leap Year";
        } else {
            leap = year + " is Not a Leap Year";
        }
        return leap;
    }

    private void setArr3(int num1, int num2, int num3) {
        arArr3[0] = num1;
        arArr3[1] = num2;
        arArr3[2] = num3;
    }

    private void setArr7(int num1, int num2, int num3, int num4,
            int num5, int num6, int num7) {
        arArr7[0] = num1;
        arArr7[1] = num2;
        arArr7[2] = num3;
        arArr7[3] = num4;
        arArr7[4] = num5;
        arArr7[5] = num6;
        arArr7[6] = num7;
    }

    // FIZZ BUZZ EXERCISE
    public void fizzBuzz(int n) {
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 3 && i % 5 == 0) {
                System.out.print( "\t" + i + " - FIZZBUZZ \n");
            } else if (i % 3 == 0) {
                System.out.print("\t" + i + " - FIZZ \n");
            } else if (i % 5 == 0) {
                System.out.print("\t" + i + " - BUZZ \n");
            }else{
                System.out.print("\t" + i +"\n" );
            }
            
        }
    }

    public String getArArr3High() {
        String high = "";
        if (arArr3[0] >= arArr3[1] & arArr3[0] >= arArr3[2]) {
            high = arArr3[0] + " is largest among 3 numbers";
        } else if (arArr3[1] >= arArr3[0] & arArr3[1] >= arArr3[2]) {
            high = arArr3[1] + " is largest among 3 numbers ";
        } else {
            high = arArr3[2] + " is largest among 3 numbers";
        }

        return high;
    }

    public String getArArr3SecondHigh() {
        String high = "";

        if (arArr3[0] >= arArr3[1] & arArr3[0] >= arArr3[2]) {
            if (arArr3[1] >= arArr3[2]) {
                high = arArr3[1] + " is the second Largest among 3 numbers ";
            } else {
                high = arArr3[2] + " is the second Largest among 3 numbers ";
            }
        } else if (arArr3[1] >= arArr3[2] & arArr3[1] >= arArr3[0]) {
            if (arArr3[0] >= arArr3[2]) {
                high = arArr3[0] + " is the second Largest among 3 numbers ";
            } else {
                high = arArr3[2] + " is the second Largest among 3 numbers ";
            }
        } else {
            if (arArr3[1] >= arArr3[2]) {
                high = arArr3[1] + " is the second Largest among 3 numbers ";
            } else {
                high = arArr3[2] + " is the second Largest among 3 numbers";
            }
        }

        return high;
    }

    public int getArr7High() {
        int large = 0;
        for (int x = 0; x < arArr7.length; x++) {
            if (large <= arArr7[x]) {
                large = arArr7[x];
            }
        }
        return large;
    }

}
