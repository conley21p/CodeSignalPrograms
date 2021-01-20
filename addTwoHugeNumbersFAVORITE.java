/*
Question: You're given 2 huge integers represented by linked lists. 
Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. 
The represented number might have leading zeros. 
Your task is to add up these huge integers and return the result in the same format.
*/

ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
   
   //reverse both list store as deque
   a = reverse(a);
   b = reverse(b);
   //Create Nodes to keep track of final node
   ListNode<Integer> sum = new ListNode(0);
   ListNode<Integer> sumHead = sum;
   
   //add the numbers one by one in chucks of 4 digits
        //int remiander will remeber the remainder
    int remiander = 0;
    while(true){
        System.out.print(remiander+ "  ");
        int temp = (int)a.value+ (int)b.value + remiander;
        if((int)temp>9999){
            remiander = 1;                          //Add a remainder if the values is over 4 digits
            temp= temp-10000;                       //delete the extra digit
        }else{remiander = 0;}                       //make remainder 0 if not 5 digits
        
        sum.next = new ListNode<Integer>(temp);     //create the next node with sum
        sum = sum.next;                             //move node more next iteration
        
        if(a.next == null && b.next == null){       //if next node is null for both
            if(remiander ==1)                         //and if there is a remainder make another node with val 1
                sum.next = new ListNode<Integer>(1);        
            break;                                    //then break out of while loop
        }
        
        //if next node is null(only one) make val zero so it doesnt add by mistake
        if(b.next != null){                           
            b = b.next;
        }else{b.value = 0;}
        if(a.next != null){
            a = a.next;
        }else{a.value = 0;}         
        
    }
    return reverse(sumHead.next);//return the reverse ListNode of the sum we found 
    
}

ListNode<Integer> reverse(ListNode<Integer> initial){
    ListNode rev = null;
    while(initial !=null){
        ListNode temp = new ListNode((int)initial.value);
        temp.next= rev;
        rev = temp;
        initial = initial.next;
    }
    return rev;
}

// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
