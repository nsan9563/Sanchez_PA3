package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.security.SecureRandom;


//declare class of Random Numbers
class RandomNum {
    private static SecureRandom randGen = new SecureRandom();

    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //declare variables in main method.
        int userAnswer, answer, count = 0;
        int userCh, userStyle;
        String ch;
        double result = 0.0;

        //create a do-while to allow the questions
        // to continue until user ends program.
        do {
            menuBoard();

            //call method of menu options to show the different math styles.
            System.out.print("Choose preferred arithmetic style: ");
            userStyle = in.nextInt();

            //ask the user for the level difficulty
            System.out.print("Enter a difficulty level: ");
            userCh = in.nextInt();

            if (userStyle == 1) {

                //create a for-loop for math calculation
                for (int i = 0; i < 10; ++i) {
                    //call multiplication method.
                    answer = addition(userCh);

                    userAnswer = in.nextInt();

                    //check to see if answer is correct.
                    if (userAnswer == answer) {
                        positiveFeedback();
                        count++;
                    }//end if condition
                    else {
                        negativeFeedback();
                    }//end else condition

                }//end for loop.

            }//end userStyle option 1
            else if (userStyle == 2) {
                for( int i = 0; i < 10; ++i ) {
                    //call addition method.
                    answer = multiply(userCh);

                    userAnswer = in.nextInt();

                    //check to see if answer is correct.
                    if (userAnswer == answer) {
                        positiveFeedback();
                        count++;
                    }//end if condition
                    else {
                        negativeFeedback();
                    }//end else condition
                }//end for loop

            }//end userStyle option 2
            else if( userStyle == 3 )   {
                for( int i = 0; i < 10; ++i ) {
                    //call subtraction method.
                    answer = subtraction(userCh);

                    userAnswer = in.nextInt();

                    //check to see if answer is correct.
                    if (userAnswer == answer) {
                        positiveFeedback();
                        count++;
                    }//end if condition
                    else {
                        negativeFeedback();
                    }//end else condition
                }//end for loop

            }//end userStyle option 3
            else if( userStyle == 4 )   {
                for( int i = 0; i < 10; ++i ) {
                    double dAnswer, temp;

                    //call division method.
                    dAnswer = division(userCh);

                    temp = in.nextDouble();

                    //check to see if answer is correct.
                    if (temp == dAnswer) {
                        positiveFeedback();
                        count++;
                    }//end if condition
                    else {
                        negativeFeedback();
                    }//end else condition
                }//end for loop

            }//end userStyle option 4.
            else if( userStyle == 5 )   {
                for( int i = 0; i < 10; ++i ) {
                    //call division method.
                    answer = randomArithmetic(userCh);

                    userAnswer = in.nextInt();

                    //check to see if answer is correct.
                    if (userAnswer == answer) {
                        positiveFeedback();
                        count++;
                    }//end if condition
                    else {
                        negativeFeedback();
                    }//end else condition
                }//end for loop

            }//end userStyle choice 5

            result = (count / (double) 10) * 100;

            //display # of questions
            System.out.println("Correct " + result + "%");
            percentageFeedback(result);

            //ask the user for another question.
            System.out.println("Try another question? [y/n]");
            ch = in.next();

            count = 0;

        }//end while loop.
        while( ch.equalsIgnoreCase("y") );

    }//end main method


    //create a test method to see if program is working.
    public static int multiply( int level )   {
        //declare variables for method
        int num1, num2;

        //use an if-else statement to create the difficulty of the questions
        if( level == 1 ) {
            num1 = randGen.nextInt(10);
            num2 = randGen.nextInt(10);

            //ask the user for a question
            System.out.printf("How much is %d times %d?\n", num1, num2);

            //return product
            return num1*num2;

        }//end level one condition
        else if( level == 2 )   {
            num1 = randGen.nextInt(100);
            num2 = randGen.nextInt(100);

            //ask the user for a question
            System.out.printf("How much is %d times %d?\n", num1, num2);

            //return product
            return num1*num2;

        }//end level two condition
        else if( level == 3 )   {
            num1 = randGen.nextInt(1000);
            num2 = randGen.nextInt(1000);

            //ask the user for a question
            System.out.printf("How much is %d times %d?\n", num1, num2);

            //return product
            return num1*num2;

        }//end level three condition
        else if( level == 4 )   {
            num1 = randGen.nextInt(10000);
            num2 = randGen.nextInt(10000);

            //ask the user for a question
            System.out.printf("How much is %d times %d?\n", num1, num2);

            //return product
            return num1*num2;

        }//end level four condition

        return 1;
    }//end multiplyQuestion method

    //create a method that generates addition questions
    public static int addition( int level )   {
        //declare variables for method
        int num1, num2;

        //use an if-else statement to create the difficulty of the questions
        if( level == 1 ) {
            num1 = randGen.nextInt(10);
            num2 = randGen.nextInt(10);

            //ask the user for a question
            System.out.printf("How much is %d plus %d?\n", num1, num2);

            //return product
            return num1+num2;

        }//end level one condition
        else if( level == 2 )   {
            num1 = randGen.nextInt(100);
            num2 = randGen.nextInt(100);

            //ask the user for a question
            System.out.printf("How much is %d plus %d?\n", num1, num2);

            //return product
            return num1+num2;

        }//end level two condition
        else if( level == 3 )   {
            num1 = randGen.nextInt(1000);
            num2 = randGen.nextInt(1000);

            //ask the user for a question
            System.out.printf("How much is %d plus %d?\n", num1, num2);

            //return product
            return num1+num2;

        }//end level three condition
        else if( level == 4 )   {
            num1 = randGen.nextInt(10000);
            num2 = randGen.nextInt(10000);

            //ask the user for a question
            System.out.printf("How much is %d plus %d?\n", num1, num2);

            //return product
            return num1+num2;

        }//end level four condition

        return 1;

    }//end addition method

    //create a method that generates subtraction questions
    public static int subtraction( int level )    {
        //declare variables for method
        int num1, num2;

        //use an if-else statement to create the difficulty of the questions
        if( level == 1 ) {
            num1 = randGen.nextInt(10);
            num2 = randGen.nextInt(10);

            //ask the user for a question
            System.out.printf("How much is %d minus %d?\n", num1, num2);

            //return product
            return num1-num2;

        }//end level one condition
        else if( level == 2 )   {
            num1 = randGen.nextInt(100);
            num2 = randGen.nextInt(100);

            //ask the user for a question
            System.out.printf("How much is %d minus %d?\n", num1, num2);

            //return product
            return num1-num2;

        }//end level two condition
        else if( level == 3 )   {
            num1 = randGen.nextInt(1000);
            num2 = randGen.nextInt(1000);

            //ask the user for a question
            System.out.printf("How much is %d minus %d?\n", num1, num2);

            //return product
            return num1-num2;

        }//end level three condition
        else if( level == 4 )   {
            num1 = randGen.nextInt(10000);
            num2 = randGen.nextInt(10000);

            //ask the user for a question
            System.out.printf("How much is %d minus %d?\n", num1, num2);

            //return product
            return num1-num2;

        }//end level four condition

        return 1;
    }//end subtraction method

    //create a method that generates division questions
    public static double division( int level )   {
        DecimalFormat formatter = new DecimalFormat( ".##");

        //declare variables for method
        double num1, num2, result;

        //use an if-else statement to create the difficulty of the questions
        if( level == 1 ) {
            //some reason, only exact results show correct.

            num1 = randGen.nextInt(9) + 1;
            num2 = randGen.nextInt(9) + 1;

            //ask the user for a question
            System.out.printf("How much is %.1f divided by %.1f?\n", num1, num2);
            result = num1/num2;

            //format the answer
            formatter.format(result);

            return result;

        }//end level one condition
        else if( level == 2 )   {
            num1 = randGen.nextInt(99) + 1;
            num2 = randGen.nextInt(99) + 1;

            //ask the user for a question
            System.out.printf("How much is %.1f divided by %.1?f\n", num1, num2);
            result = num1/num2;

            //format the answer
            formatter.format(result);

            return result;

        }//end level two condition
        else if( level == 3 )   {
            num1 = randGen.nextInt(999) + 1;
            num2 = randGen.nextInt(999) + 1;

            //ask the user for a question
            System.out.printf("How much is %.1f divided by %.1f?\n", num1, num2);
            result = num1/num2;

            //format the answer
            formatter.format(result);

            return result;
        }//end level three condition
        else if( level == 4 )   {
            num1 = randGen.nextInt(9999) + 1;
            num2 = randGen.nextInt(9999) + 1;

            //ask the user for a question
            System.out.printf("How much is %.1f divided by %.1f?\n", num1, num2);
            result = num1/num2;

            //format the answer
            formatter.format(result);

            return result;

        }//end level four condition

        return 1;
    }//end division method

    //create a method that can generate a random positive feedback.
    public static int positiveFeedback()  {
        int correctResponse = randGen.nextInt(4) + 1;

        //create a switch to generate random responses
        switch( correctResponse )
        {
            case 1:
                System.out.println("Very Good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice Work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;

        }//end switch

        return correctResponse;

    }//end positiveFeedback method

    //create a method that can generate a random negative feedback.
    public static int negativeFeedback()  {
        int wrongResponse = randGen.nextInt(4) + 1;

        //create a switch to generate random responses
        switch( wrongResponse )
        {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't Give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.!");
                break;

        }//end switch

        return wrongResponse;

    }//end positiveFeedback method

    //create a method to generate percentage feedback
    public static void percentageFeedback( double num ) {
        if( num < 75.0 )    {
            System.out.println("Please ask your teacher for extra help.");
        }//end if condition
        else    {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }//end else condition

    }//end percentageFeedback method

    //create a method to allow for random math styles
    public static int randomArithmetic( int level ) {

        int i = randGen.nextInt(3) + 1;
        int count;

        do
            if (i == 1) {
                return addition(level);
            } else if (i == 2) {
                return multiply(level);
            } else if (i == 3) {
                return subtraction(level);
            }

        while( i >= 1 && i <= 3);

        //left out division due to bug I could not fix.

        return 1;

    }//end randomArithmetic method

    //create a method to display the options
    public static void menuBoard()  {
        System.out.println("Welcome to our arithmetic game! Here we can test to see how sharp your skills are!");
        System.out.print("You can choose from: 1) Addition. 2) Multiplication 3) Subtraction ");
        System.out.print("4) Division. 5) Randomization. ");
        System.out.println("");
        System.out.print("There are four difficulty levels: 1) Single digits. 2) Double digits. ");
        System.out.println("3) Triple digits. 4) Quadruple digits. ");
        System.out.println("");
    }//end menuBoard method

}//end RandomNum class

