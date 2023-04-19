import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> sym = new HashMap<Character , Integer>();
        sym.put('I' , 1);
        sym.put('V' , 5);
        sym.put('X' , 10);
        sym.put('L' , 50);
        sym.put('C' , 100);
        sym.put('D' , 500);
        sym.put('M' , 1000);
        int res = 0;
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(sym.get(s.charAt(i)) < sym.get(s.charAt(i+1))){
                res -= sym.get(s.charAt(i));
            }else{
                res += sym.get(s.charAt(i));
            }
        }
        res += sym.get(s.charAt(s.length()-1));
        return res;
    }
}