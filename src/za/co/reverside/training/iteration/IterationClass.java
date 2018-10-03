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
public class IterationClass {

    int num;
    int[] arNum = new int[num];

    public int getLargeNum(int[] arNum) {

        int high = 0;

        for (int i = 0; i < arNum.length; i++) {
            if (high < arNum[i]) {
                high = arNum[i];
            }

        }

        return high;
    }

    public int getSecLargeNum(int[] arNum) {

        int high = 1;
        int sec = 0;

        for (int i = 0; i < arNum.length; i++) {
            if (high <= arNum[i] & high > sec) {
                sec = high;
                high = arNum[i];

            }

        }

        return sec;
    }

    public boolean getNumExist(int[] arNum, int num) {

        boolean here = false;
        for (int i = 0; i < arNum.length; i++) {
            if (arNum[i] == num) {
                here = true;
                break;
            }
        }

        return here;
    }

    public int getNumOcc(int[] arNum, int num) {

        int occ = 0;
        for (int i = 0; i < arNum.length; i++) {
            if (arNum[i] == num) {
                occ++;
            }
        }

        return occ;
    }

    public String getMaxOcc(int[] arNum) {
        int max = 0, diffMax = 0;
        int occ = 0, diffOcc = 0;

        for (int i = 0; i < arNum.length; i++) {
            int checkNum = arNum[i];
            diffOcc = 0;
            for (int x = 0; x < arNum.length; x++) {
                if (checkNum == arNum[x]) {
                    diffMax = checkNum;
                    diffOcc++;
                }
            }

            if (occ < diffOcc) {
                max = diffMax;
                occ = diffOcc;
            }

        }

        return "The number " + max + " has maximum occurrences of " + occ;
    }

    public int getSpaceNum(String sentence) {

        int occ = 0;
        char space = ' ';

        for (int i = 0; i < sentence.length(); i++) {
            if (space == sentence.charAt(i)) {
                occ++;
            }
        }

        return occ;
    }

    public int getWordNum(String sentence) {

        int occ = 0;
        char space = ' ';

        for (int i = 0; i < sentence.length(); i++) {
            if (space == sentence.charAt(i)) {
                occ++;
            }
        }
        return occ + 1;
    }

    public String getReplaceWord(String sentence) {

        String word = sentence;
        char space = ' ';

        for (int i = 0; i < sentence.length(); i++) {
            if (space == sentence.charAt(i)) {
                word = sentence.replace(" ", "_");
            }
        }

        return word;
    }

    public void getSort(int[] arNum) {
        int[] copyArr = arNum;

        for (int i = 0; i < arNum.length; i++) {
            for (int j = 1; j < (arNum.length - i); j++) {
                if (arNum[j - 1] > arNum[j]) {
                    //swap elements  
                    int temp = arNum[j - 1];
                    arNum[j - 1] = arNum[j];
                    arNum[j] = temp;
                }

            }
        }

        for (int x = 0; x < arNum.length; x++) {
            System.out.println(arNum[x]);
        }

    }

    public void getEven(int[] arNum) {
        for (int x = 0; x < arNum.length; x++) {
            if (arNum[x] % 2 == 0) {
                System.out.println(arNum[x] + " is Even number");
            } else {
                System.out.println(arNum[x] + " is Odd number");
            }

        }
    }

    public void getFib(int n) {
        int next = 0, first = 0, second = 1;
        for (int x = 0; x < n; x++) {
            if (x <= 1) {
                next = x;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(next);
        }
    }

    public void getReverseString(String st) {
        String reverse = st;
        char arString[] = reverse.toCharArray();
        for (int i = arString.length - 1; i >= 0; i--) {
            System.out.print(arString[i]);
        }
    }

    public static int strToInt(String str) {
        int i = 0;
        int num = 0;

        //Process each character of the string;
        while (i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
        }

        return num;
    }

    int maxDiff(int arr[], int arr_size) {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++) {
            for (j = i + 1; j < arr_size; j++) {
                if (arr[j] - arr[i] > max_diff) {
                    max_diff = arr[j] - arr[i];
                }
            }
        }
        return max_diff;
    }

    int getCount(int num) {
        int count = 0;

        while (num != 0) {
            /* Increment digit count */
            count++;

            /* Remove last digit of 'num' */
            num /= 10;
        }
        return count;
    }

    int getSumDgt(int num) {
        int count = 0;

        while (num != 0) {
            int remainder = num % 10;
            count += remainder;
            num = num / 10;
        }
        return count;
    }

    int getSumDgtOdd(int num) {
        int count = 0;

        while (num != 0) {
            
            int remainder = num % 10;
            
            if( remainder%2 != 0 )
                count += remainder;
            
            num = num / 10;
        }
        return count;
    }
    
    
    public int reverseLast(int input) {
        String inputString = String.valueOf(input);
        String outputString;
        if (inputString.length() == 1) {
            outputString = inputString;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String remaining = inputString.substring(1, inputString.length() - 1);
            outputString = lastChar + remaining + firstChar;
        }
        int output = Integer.parseInt(outputString);
        return output;
    }
    
    
    void vowel(char i){
        char alph = i;

        if(alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u' )
            System.out.print(alph + " is vowel");
        else
            System.out.print(alph + " is consonant");
        
    }
    
    int getIntRev(int num){
        int rev = 0;
        int dgt;
        while( num !=0 )
        {
            dgt = num%10;
            rev = rev *10 +dgt;
            num /=10;
        }
        
        return rev;
    }
    
    
}
