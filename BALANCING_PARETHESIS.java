// Time Complexity: O(n) Auxiliary Space: O(n) for stack
package Stack;

import java.util.*;

class Main {

    public static boolean checkPair(char val1, char val2) {
        return (( val1 == '(' && val2 == ')' ) || ( val1 == '[' && val2 == ']' ) || ( val1 == '{' && val2 == '}' ));
    }

    public static boolean checkBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++)
        {
            if (expr.charAt(i) == '(' || expr.charAt(i) == '[' || expr.charAt(i) == '{')
            {
                stack.push(expr.charAt(i));
            }
            else
            {
                char val = stack.peek();
                // exp = {{}}}{}
                // if you look closely above {{}} will be matched with pair, Thus, stack "Empty"
                //but an extra closing parenthesis like } will never be matched
                //so there is no point looking forward
                if (stack.isEmpty())
                    return false;
                else if (checkPair(stack.peek(), expr.charAt(i)))
                {
                    stack.pop();
                    continue;
                }
                // will only come here if stack is not empty
                // pair wasn't found and it's some closing parenthesis
                //Example : {{}}(]
                return false;
            }
        }
        return true;
    }


    public static void main (String[] args) {
        String expr = "({})[]";

        String result;
        System.out.println(result = checkBalanced(expr) ? "Balanced" : "Not Balanced");

    }

}
