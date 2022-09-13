class Solution {
    public boolean judgeCircle(String moves) {
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
        return (up == 0 && left == 0);
    }
}