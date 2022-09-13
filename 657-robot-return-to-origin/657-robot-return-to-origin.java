class Solution {
    public boolean judgeCircle(String moves) {
        Boolean result = false;
        int up = 0, left = 0;
        for(int i=0; i<moves.length(); i++) {
            if(moves.charAt(i)=='U') {
                up++;
                continue;
            }
             if(moves.charAt(i)=='D') {
                up--;
                continue;
            }
            if(moves.charAt(i)=='L') {
                left++;
                continue;
            }
            if(moves.charAt(i)=='R') {
                left--;
                continue;
            }
        }
        if(up == 0 && left == 0)
            result = true;
        return result;
    }
}