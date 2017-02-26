import sys
import math


def prime_factors(n):
    m = int(math.ceil(math.sqrt(n)))
    for i in range(2, m):
        if n % i == 0:
            print i,
        while n % i == 0:
            n /= i
        if i > 2:
            i += 1
    if n >= 2:
        print n


def main():
    n = int(sys.argv[1])
    prime_factors(n)


if __name__ == '__main__':
    main()
