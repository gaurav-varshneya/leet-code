class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        char[] charArr = bin.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '0')
                charArr[i] = '1';
            else 
                charArr[i] = '0';
        }
        return Integer.parseInt(new String(charArr), 2);
    }
}