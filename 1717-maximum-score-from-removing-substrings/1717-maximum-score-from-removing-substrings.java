class Solution {
    int gain = 0;
    
    public String remove_ab(String s, int score){
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b' && !stack.empty() && stack.peek()=='a'){
                stack.pop();
                gain += score;
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
    
    public String remove_ba(String s, int score){
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && !stack.empty() && stack.peek()=='b'){
                stack.pop();
                gain += score;
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
    
    public int maximumGain(String s, int x, int y) {
        String str1 = "", str2 = "";
        if(s.length()==1){
            return 0;
        }
        else{
            if(x>y){
                str1 = remove_ab(s, x);
                str2 = remove_ba(str1, y);
            }
            else{
                str2 = remove_ba(s, y);
                str1 = remove_ab(str2, x);
            }
        }
       
        return gain;
    }
}