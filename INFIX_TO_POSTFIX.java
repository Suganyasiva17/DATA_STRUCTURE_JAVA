import java.util.Stack;

class Temp {
    static boolean checkIfOperand(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    // Function to compare precedence
    // If we return larger value means higher precedence
    static int precedence(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
        }
        return -1;
    }


    static void covertInfixToPostfix(String expr)
    {
        int i, j;
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder(new String(""));

        for (i = 0, j = -1; i < expr.length(); ++i)
        {
            // Here we are checking is the character we scanned is operand or not
            // and this adding to output.
            if (checkIfOperand(expr.charAt(i)))
                result.append(expr.charAt(i));

            // Here, if we scan the character ‘(‘, we need to push it to the stack.
            else if (expr.charAt(i) == '(')
                s.push(expr.charAt(i));

            // Here, if we scan character is an ‘)’, we need to pop and print from the stack
            // do this until an ‘(‘ is encountered in the stack.
            else if (expr.charAt(i) == ')')
            {
                while (!s.empty() && s.peek() != '(') {
                    result.append(s.peek());
                    s.pop();
                }
                if (!s.empty() && s.peek() != '(')
                    return; // invalid expression
                else
                    s.pop();
            }
            else // if an operator
            {
                while (!s.empty() && precedence(expr.charAt(i)) <= precedence(s.peek())) {
                    result.append(s.peek());
                    s.pop();
                }
                s.push(expr.charAt(i));
            }

        }

        // Once all initial expression characters are traversed
        // adding all left elements from stack to exp
        while (!s.empty()) {
            result.append(s.peek());
            s.pop();
        }
        System.out.println(result);

    }


    // Driver code
    public static void main(String[] args)
    {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        covertInfixToPostfix(expression);
    }
}
