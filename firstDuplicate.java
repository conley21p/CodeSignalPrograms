/*
This is one of my favorite questions from code signal so far 
Question: Given an array a that contains only numbers in the range from 1 to a.length, 
    find the first duplicate number for which the second occurrence has the minimal 
    index. In other words, if there are more than 1 duplicated numbers,
    return the number for which the second occurrence has a smaller index than 
    the second occurrence of the other number does. If there are no such elements, return -1.
Solution: The rea reason this problem is so cool is because the values from withinh the list have 
    to  be withing 1 and the length of list. So what the program does is once the a value has been
    seen it changes the index of that value to negative. Then it checks if the index-1 at the value
    of current int is negative or not, if it is negative that means it is the first duplicate.
*/
int firstDuplicate(int[] a) {
    for(int i=0;i<a.length;i++){
        if(a[Math.abs(a[i])-1]<0){
            return Math.abs(a[i]);
        }else{
            a[Math.abs(a[i])-1]*=-1;
        }
    }
    return -1;
