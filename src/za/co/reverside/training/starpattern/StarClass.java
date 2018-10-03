/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.reverside.training.starpattern;

/**
 *
 * @author Mtimkulu Jabulane
 */
public class StarClass {

    public StarClass() {

    }

    public void getSquare() {
        int s = 0;
        while (s < 5) {
            System.out.println("*****");
            s++;
        }
    }

    public void hollowSquare() {
        int st = 0;
        while (st < 5) {
            if (st == 0 | st == 4) {
                System.out.println("*****");
            } else {
                System.out.println("*   *");
            }
            st++;
        }
    }

    public void hollowSquareDiagonal() {
        int st = 0;
        while (st < 5) {
            if (st == 0 | st == 4) {
                System.out.println("*****");
            } else if (st == 1 | st == 3) {
                System.out.println("** **");
            } else {
                System.out.println("* * *");
            }
            st++;
        }
    }

    void rhombusStar() {
        for (int v = 0; v < 5; v++) {
            for (int y = 5; y > v; y--) {
                System.out.print(" ");
            }
            System.out.println("******");
        }
    }

    void holloRhombusStar() {
        for (int v = 0; v < 5; v++) {
            for (int y = 5; y > v; y--) {
                System.out.print(" ");

            }

            if (v == 0 | v == 4) {
                System.out.println("*****");
            } else {
                System.out.println("*   *");
            }

            //System.out.println("******");
        }
    }

    void mirroredRhombus() {
        for (int v = 0; v < 5; v++) {
            for (int y = 0; y < v; y++) {
                System.out.print(" ");
            }
            System.out.println("******");
        }
    }

    void hollowMirrored() {
        for (int v = 0; v < 5; v++) {
            for (int y = 0; y < v; y++) {
                System.out.print(" ");
            }

            if (v == 0 | v == 4) {
                System.out.println("*****");
            } else {
                System.out.println("*   *");
            }
            //System.out.println("******");
        }
    }

    void rightT() {
        for (int v = 0; v < 5; v++) {
            for (int y = 0; y < v; y++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    void hollowRightT() {
        for (int v = 0; v < 5; v++) {
            for (int y = 0; y < v; y++) {
                if (v == 4) {
                    System.out.print("*");
                } else if (y > 0 & y < 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("*");
        }
    }

    void mirroredRightT() {
        for (int v = 5; v > 0; v--) {
            for (int y = 1; y < v; y++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= v; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    void hollowMirroredRightT() {
        for (int v = 5; v > 0; v--) {
            for (int y = 1; y < v; y++) {
                System.out.print(" ");
            }
            next:
            for (int j = 5; j >= v; j--) {

                if (j == 5 || v == 1 || j == 0) {
                    System.out.print("*");

                } else if (v == 2) {
                    System.out.print("  *");
                    break next;
                } else if (v == 3) {
                    System.out.print(" *");
                    break next;
                } else {
                    System.out.print("*");
                    break next;
                }
            }
            System.out.print("\n");
        }
    }

    void invertRightT() {
        for (int y = 0; y > -5; y--) {
            System.out.print("");
            for (int x = y; x >= -4; x--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void hollowInvertRightT() {
        for (int v = 0; v < 5; v++) {

            System.out.print("*");
            if (v == 0) {
                System.out.print("*****\n*");
            }
            for (int y = 4; y > v; y--) {

                if (v < y) {
                    if (v < y - 1) {
                        System.out.print(" ");
                    } else if (v < y) {
                        System.out.print("*");
                    }
                }
            }

            System.out.print("\n");

        }
    }

    void invertMirrorRightT() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    void hollowInvertMirrorRightT() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {

                if (j == 5 || i == 0) {
                    System.out.print("*");
                    switch (i) {
                        case 2:
                            System.out.print(" *");
                            break;
                        case 3:
                            System.out.print("*");
                            break;
                        case 1:
                            System.out.print("  *");
                            break;
                        default:
                            break;
                    }
                } else {

                }

            }
            System.out.println("");
        }
    }

    void pry() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    void hollPry() {
        for (int i = 1; i <= 5; i++) {
            for (int k = i; k < 5; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 5 || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    void invertPry() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    void hollwInvertPry() {
        for (int i = 5; i >= 1; i--) {
            for (int k = i; k < 5; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 5 || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    void halfDiamond() {
        for (int v = 0; v < 5; v++) {
            for (int y = 0; y < v; y++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int v = 5; v >= 0; v--) {
            for (int y = 0; y < v; y++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    void mirroredHalfPry() {
        for (int v = 5; v > 0; v--) {
            for (int y = 1; y < v; y++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= v; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
