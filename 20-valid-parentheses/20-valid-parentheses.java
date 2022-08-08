class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(ch);
            }
            else if(!stack.empty() && map.get(stack.peek()) == ch){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.empty();
    }
}