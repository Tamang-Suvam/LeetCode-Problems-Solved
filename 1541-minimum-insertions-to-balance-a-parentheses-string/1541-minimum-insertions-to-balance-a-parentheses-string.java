class Solution {
    public int minInsertions(String s) {
        Stack <Character> stack = new Stack<>();
        int result = 0;
        char c = ' ';
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                // Found ))
                if(i+1 < s.length() && s.charAt(i+1)==')'){
                    if(stack.empty()){
                        result += 1;
                        i += 1;
                    }
                    else{
                        stack.pop();
                        i += 1;
                    }
                }
                else{
                    if(stack.empty()){
                        result += 2;
                    }
                    else{
                        stack.pop();
                        result += 1;
                    }
                }
            }
       }
       return stack.size() * 2 + result;
    }
}