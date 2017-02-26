import os
import sys


def check_palindrome(s):
    palindrome = True
    front = 0
    back = len(s)-1
    while front < back:
        if not s[front].isalpha():
            front += 1
            continue
        if not s[back].isalpha():
            back -= 1
            continue
        if s[front].isalpha() and s[back].isalpha() and s[front] != s[back]:
            palindrome = False;
            break;
        front += 1
        back -= 1
    return palindrome



def main():
    fName = sys.argv[1]
    if os.path.exists(fName):
        with open(fName, 'r') as file:
            try:
                count = 0
                for line in file:
                    line = line.lower()
                    if check_palindrome(line):
                        count += 1
                print count
            except IOError:
                print "Could not read file:", fName
                sys.exit()
                
if __name__ == '__main__':
    main()
