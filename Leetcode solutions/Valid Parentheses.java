import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<String> open = new Stack<String>();
        for(int i = 0 ; i < s.length() ; i++){
            int asc =(int) s.charAt(i);
            if(asc == 40 || asc == 91 || asc == 123) {
                open.push(s.substring(i , i+1));
            }else if(open.empty()){
                return false;
            } 
            else{

                String pop = open.peek();
                if(asc == 93 && !pop.equals("[")) return false;
                if(asc == 41 && !pop.equals("(")) return false;
                if(asc == 125 && !pop.equals("{")) return false ; 
                open.pop();
            }
        }
    
        return (open.size() ==0); 
    }
}