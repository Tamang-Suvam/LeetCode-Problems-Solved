class Solution {
    public boolean squareIsWhite(String coordinates) {
        int result = 0;
        for(char a : coordinates.toCharArray()){
            result += (int)a;
        }
        return (result - 96 ) % 2 != 0;
    }
}