"""
Question:Rotate matrix 90 degrees clock wise. Given that all values within matrix will be of the same length

Solution: switch the values of the rows and colums with each other and then reverse each row.
          This solution works because it is always a square matrix.
"""
def rotateImage(a):
    n=len(a[0])
    for r in range(n):
        for c in range(r,n):
            a[r][c],a[c][r]=a[c][r],a[r][c]
    for i in a:
        i.reverse()
    return a
