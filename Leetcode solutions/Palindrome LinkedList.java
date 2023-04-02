

// Given the head of a singly linked list, return true if it is a 
// palindrome
//  or false otherwise.



import java.util.Stack;
class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
            Stack<Integer> s = new Stack<Integer>();            
            for(ListNode  p = head ; p != null ; p =p.next){
                    s.push(p.val);
            }

            for(ListNode p = head ; p != null ; p =p.next){
                    if(p.val != s.pop()) return false;
            }

            return true;
    }
}