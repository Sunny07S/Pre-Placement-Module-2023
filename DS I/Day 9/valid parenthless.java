class Solution {
    public boolean isValid(String sk)
    {
        Stack<Character> stack = new Stack<Character>();
        //char[] sArray = 
        for(char c : sk.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
            {
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
            {
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
            {
                stack.pop();
            }
            else
            {return false;}
        }
        
        return stack.isEmpty();
        
        }
		}