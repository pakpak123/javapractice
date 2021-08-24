import math

print('*** Fun with Drawing ***')
A = int(input('Enter input : '))
B = (A*2)-2
#  x คือจำนวนแถว
#  y คือจำนวนหลัก

for y in range(-B, B + 1):
    for x in range(-B, B + 1):
        if abs(x) + abs(y) == abs(x) * 2 and x % 2 == 0:
            print("#", end="")
        elif abs(x) + abs(y) == abs(x) * 2 and x % 2 == 1:
            print(".", end="")
        elif abs(y) % 2 == 1 and abs(x) % 2 == 1:
            print(".", end="")
        elif abs(y) % 2 == 0 and abs(x) % 2 == 0:
            print("#", end="")
        elif abs(y) % 2 == 1 and abs(x) % 2 == 0 and abs(y) < abs(x):
            print("#", end="")
        elif abs(y) % 2 == 0 and abs(x) % 2 == 1 and abs(y) < abs(x):
            print(".", end="")
        elif abs(y) % 2 == 1 and abs(x) % 2 == 0 and abs(y) > abs(x):
            print(".", end="")
        elif abs(y) % 2 == 0 and abs(x) % 2 == 1 and abs(y) > abs(x):
            print("#", end="")
        else:
            print(" ", end="")
    print()