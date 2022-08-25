class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int temp = -1;
        for(int i=0;i<ransomNote.length();i++){
            if(magazine.contains(String.valueOf(ransomNote.charAt(i)))){
                temp = magazine.indexOf(ransomNote.charAt(i));
                magazine = magazine.substring(0,temp)+magazine.substring(temp + 1); 
            }
            else{
                return false;
            }
        }
        return true;
    }
}