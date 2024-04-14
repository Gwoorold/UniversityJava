package edu.ntudp.olkhovyk;

import java.util.Random;
import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Set size X: ");
        var x = getIntFromScanner(1, 20);
        System.out.print("Set size Y: ");
        var y = getIntFromScanner(1, 20);
        System.out.println("Create matrix automatically(0) or manually(1)?");
        var createType = getIntFromScanner(0, 1);
        var matrix = CreateMatrix(x, y, createType);
        PrintMatrix(matrix);
        System.out.println("Min matrix value: " + GetMatrixMin(matrix));
        System.out.println("Max matrix value: " + GetMatrixMax(matrix));
        System.out.println("Average matrix value: " + GetMatrixAvg(matrix));
    }

    private static int[][] CreateMatrix(int x, int y, int createMethod) {
        int[][] matrix = new int[x][y];
        if (createMethod == 0) {
            AutomaticallyFillMatrix(matrix);
        } else if (createMethod == 1) {
            ManuallyFillMatrix(matrix);
        }
        return matrix;
    }

    private static void AutomaticallyFillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
    }

    private static void ManuallyFillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = getIntFromScanner();
            }
        }
    }

    private static int GetMatrixMin(int[][] matrix) {
        var min = matrix[0][0];
        for (int[] rows : matrix) {
            for (int e : rows) {
                if (e < min) {
                    min = e;
                }
            }
        }
        return min;
    }

    private static int GetMatrixMax(int[][] matrix) {
        var max = matrix[0][0];
        for (int[] rows : matrix) {
            for (int e : rows) {
                if (e > max) {
                    max = e;
                }
            }
        }
        return max;
    }

    private static double GetMatrixAvg(int[][] matrix) {
        var sum = 0;
        var count = 0;
        for (int[] rows : matrix) {
            for (int e : rows) {
                sum += e;
                count++;
            }
        }
        return (double) sum / count;
    }

    private static void PrintMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int e : rows) {
                System.out.print(e);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static int getIntFromScanner() {
        return getIntFromScanner(-1, -1);
    }

    private static int getIntFromScanner(int lowerBound, int upperBound) {
        var parsed = false;
        var value = 0;

        while (!parsed) {
            try {
                value = input.nextInt();

                if ((lowerBound != -1 && value < lowerBound) || (upperBound != -1 && value > upperBound)) {
                    throw new Exception();
                }

                parsed = true;
            } catch (Exception e) {
                System.out.println("Wrong number! Must be between " + lowerBound + " " + upperBound);
            }
        }

        return value;
    }
}
