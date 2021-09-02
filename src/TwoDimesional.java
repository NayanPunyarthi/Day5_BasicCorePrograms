package com.company;

 import java.util.Scanner;
    public class TwoDimesional {

        public static void main(String[] args) {
            // write your code here
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter no. of rows & column");
            int Row = scan.nextInt();
            int Column = scan.nextInt();
            int [][] arr = new int [Row][Column];
            System.out.println("enter elements og array");
            for (int i = 0; i < Row; i ++){
                for (int j = 0; j < Column; j ++) {
                    arr[i][j] = scan.nextInt();
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println(" ");
            }
        }
    }

