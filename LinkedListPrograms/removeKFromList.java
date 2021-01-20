/*
Question: Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
*/
/*Singly-linked lists are already defined with this interface:
 class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }
*/
ListNode<Integer> removeKFromList(ListNode<Integer> head, int k) { 
    
    while(head!=null && (int)head.value == k ){
        head = head.next;
    }
    ListNode iter = head;
    while(iter!=null && iter.next !=null ){
        if((int)iter.next.value == k){
            iter.next = iter.next.next;
        }else{iter = iter.next;}
    }
    return head;
    
}