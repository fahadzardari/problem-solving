class MergeList {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                if (list1 == null) {
                  return list2;
              }
              if (list2 == null) {
                  return list1;
              }
                 ListNode merged = new ListNode();
                 ListNode p = list2;
                  while(p!=null){
                      ListNode x = list1;
                      if(x.val >= p.val){
                          list1 = new ListNode(p.val , list1);
                     }else{
      
                       while(x.next != null && x.next.val <= p.val){
                              System.out.println(x.val);
                             x = x.next;
                          }
      
                          x.next = new ListNode(p.val , x.next);
                     }
                     
                     p = p.next;
                 }
      
                return list1;
          }
}
