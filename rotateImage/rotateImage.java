"""
Question:Rotate matrix 90 degrees clock wise. Given that all values within matrix will be of the same length
Solution: switch the values of the rows and colums with each other and then reverse each row.
          This solution works because it is always a square matrix.
"""

int[][] rotateImage(int[][] a) {
    int temp= 0;
    for(int r =0; r<a.length;r++){
        for(int c=0; c<r;c++){
            temp= a[r][c];
            a[r][c]=a[c][r];
            a[c][r]=temp;
        }   
    }
    for(int r =0; r<a.length;r++){
        for(int c=0; c<a.length/2;c++){
            temp= a[r][a.length-c-1];
            a[r][a.length-c-1]=a[r][c];
            a[r][c]=temp;
        }   
    }
    return a;
    
}