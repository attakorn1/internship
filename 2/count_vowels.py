import sys


def main():
    vowels = 'aeiouAEIOU'
    vowel_count = 0
    s = sys.argv[1]
    for c in s:
        if c in vowels:
            vowel_count += 1
    print vowel_count

if __name__ == '__main__':
    main()
