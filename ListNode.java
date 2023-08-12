class ListNode {
      int val;
     ListNode next;
     ListNode (int val){
        this.val=val;
        this.next=null;
     }
     }
  class Solution{
    public static ListNode removeNthFromEnd(ListNode head, int n) {
   if(head.next == null) {
       return null;
   }
  
  
   int size = 0;
   ListNode temp = head;
   while(temp != null) {
       temp = temp.next;
       size++;
   }
  
   //removing SIZEth node from last i.e. head
   if(n == size) {
       return head.next;
   }
  
   //find previous node
   int ptf = size - n; // position to find
   ListNode prev = head; // previous node
   int cp = 1; // current position
  
   while(cp != ptf) {
       prev = prev.next;
       cp++;
   }
  prev.next = prev.next.next;
   return head;

  }

  public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);
		ListNode o = h;
		System.out.println("Original node:");
		while (o != null) {
            System.out.print(o.val + " ");
            o = o.next;
        }
        System.out.println("\nAfter removing 2nd element from end:");
		ListNode head = removeNthFromEnd(h, 2);
    
	    while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}