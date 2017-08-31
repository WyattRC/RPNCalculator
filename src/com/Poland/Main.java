package com.Poland;

public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)
        rpnExpression = "5,3,-";
        expectedResult = -2;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "2,2,*";
        expectedResult = 4;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "2,6,/";
        expectedResult = 3;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);


//         Uncomment this test which has many operators
        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = -14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }

}
