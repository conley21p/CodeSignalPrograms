/*
Question: Given a singly linked list of integers, determine whether or not it's a palindrome.
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
boolean isListPalindrome(ListNode<Integer> l) {
    ListNode full = l;
    ListNode half = l;
    
    //iter through to have half halfway iteratered through the list
    while(full != null && full.next != null){
        full = full.next.next;
        half = half.next;
    }
    
    //reverse the second half of the list and store in rev
    ListNode rev = null;
    while(half !=null){
        ListNode temp = new ListNode((int)half.value);
        temp.next= rev;
        rev = temp;
        half = half.next;
    }
    
    full = l;
    
    while(rev != null){
        if((int)rev.value!=(int)full.value){
            return false;
        }
        rev = rev.next;
        full = full.next;
    }
    return true;
     
    
}