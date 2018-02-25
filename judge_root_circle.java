class Solution {
    public boolean judgeCircle(String moves) {
        char[] moveArr = moves.toCharArray();
        int ups    = 0;
        int downs  = 0;
        int lefts  = 0;
        int rights = 0;
        for (char m : moveArr){
            if (m == 'U'){
                ups++;
            }
            else if (m == 'D'){
                downs++;
            }
            else if (m == 'L'){
                lefts++;
            }
            else{
                rights++;
            }
        }
        
        if (((ups - downs == 0) || (downs - ups == 0)) && ((lefts - rights == 0) || (rights - lefts == 0))){
            return true;
        }
        return false;
    }
}