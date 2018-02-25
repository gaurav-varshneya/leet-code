class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] jewel  = J.toCharArray();
        char[] stones = S.toCharArray();
        int count = 0;
        for (char s: stones){
            for (char j : jewel){
                if (s == j){
                    count++;
                }
            }
        }
        return count;
    }
}