"""
Problem?: Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
Solution: The method I created will go to first char of a string. This char will be stored as temp and taken out of string.
Next the while loop will check if there are any more values of the char in the string if there are it will delete all values.
If there isn't it will return temp value

RunTime O(n)
"""

def firstNotRepeatingCharacter(s):
    while len(s)!=0:
        i =0
        temp = s[i]
        s=s[1:]
        if temp in s:
            s = s.replace(temp,"")
        else:
            return temp
    return '_'
