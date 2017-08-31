package com.Poland;

public class ReversePolishCalc {

        // You'll need a variable here to keep track of the top of the stack
        private int TopOfStack = 0;

        // The array of the input string split up
        private String[] tokens;

        // The stack
        private String[] stack;

        public double calculate(String input) {

            // 1. Use the String split method to split the string into tokens at the commas
            tokens = input.split(",");

            // 2. Allocate a stack as big as the number of tokens
            stack = new String[tokens.length];

            // 3. write the algorithm
            for(int i = 0; i < tokens.length; ++i) {

                String token = tokens[i];

                // calls to push() and pop() and do the math here
                if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                   double operand1 = pop();
                   double operand2 = pop();
                   if(token.equals("+")){
                       push(operand1 + operand2);
                   } else if(token.equals("-")){
                       push(operand1 - operand2);
                   }else if(token.equals("*")){
                       push(operand1 * operand2);
                   } else if(token.equals("/")){
                       push(operand1 / operand2);
                   }
                } else {
                    push(token);
                }
            }

            // 4. return the result
            return pop();
        }

        private void push(String number) {
            // push on the stack
            stack[TopOfStack] = number;
            TopOfStack++;
        }

        private void push(double d) {
            // change the double to a string and then push it on the stack
            String D = String.valueOf(d);
            push(D);
        }

        private double pop() {
            // remove the string from the top of the stack and convert it to a double and return it
            TopOfStack--;
            return Double.parseDouble(stack[TopOfStack]);
        }

}
