package com.company;

import java.util.Scanner;

        //To import numbers
        public class Main {
            public static void main(String[] args) {
                System.out.println("Welcome");

                Scanner input = new Scanner(System.in);
                //object already created so put while loop here. If you were to put it in line 9; it would just loop in the Welcome message

                int sum = 1;
                //The sum = 1 will go through loop; because while sum!= 0, so it will not go through loop
                while (sum != 0) {
                    //Define variable sum first before while loop
                    //the condition in a while loop
                    System.out.println("Please enter the first number");
                    int firstNumber = input.nextInt();

                    System.out.println("Please enter the second number");
                    int secondNumber = input.nextInt();

                    sum = firstNumber + secondNumber;
                    // delete int variable; only declare variables once
                    // result = variable1 + variable2
                    {
                        if (sum == 0) {
                            System.out.println("The game has ended.");
                        } else if (sum == 21) {
                            System.out.println("Your total is 21" + "*" + "Congratulations");
                            sum = 0;
                            //Delete sum=0; to loop again
                        } else {
                            System.out.println("The sum is" + sum + "Try again.");
                        }
                    }
                }
            }
        }

//1st: Think of inputs and declare variables
