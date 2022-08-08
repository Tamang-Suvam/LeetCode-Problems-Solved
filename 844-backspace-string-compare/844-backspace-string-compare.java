class Solution {
    public boolean backspaceCompare(String s, String t) {
        Boolean result = true;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for(char c1 : s.toCharArray()){
            if(c1 != '#'){
                stack1.push(c1);
            }
            else if(!stack1.empty()){
                stack1.pop();
            }
        }
        
        for(char c2 : t.toCharArray()){
            if(c2 != '#'){
                stack2.push(c2);
            }
            else if(!stack2.empty()){
                stack2.pop();
            }
        }
        
        while(!stack1.empty() || !stack2.empty()){
            if(stack1.empty() && !stack2.empty()){
                result = false;
                break;
            }
            else if(stack2.empty() && !stack1.empty()){
                result = false;
                break;
            }
            else{
                  char c1 = stack1.pop();
                  char c2 = stack2.pop();
                  if(c1 != c2){
                     result = false;
                     break;
                  }
            }
        }
        
        return result;
    }
}