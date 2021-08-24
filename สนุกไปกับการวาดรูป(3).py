A = int(input("Enter Input : "))
num= (A*2)+4
num1=num/2
num2=0
for i in range(int(num1)):
    for j in range(1,num+1):
        if(j<((num/2)-i)):
            print(".", end = '')
        elif(j>=((num/2)-i) and j<=(num/2)):
            print("#", end = '')
        elif(i==0):
            print("+", end = '')
        elif(i==num1-1):
            print("+", end = '')
        elif(i<num1 and j==num1+1):
            print("+", end = '')
        elif(i<num/2 and j<num):
             print("#", end = '')
        elif(i<num/2 and j==num):
             print("+", end = '')
    print('')
for i in range(int(num1),num):
    for j in range(1,num+1):
        if(i==num1 and j<=num1):
            print("#", end = '')
        elif(i==num1 and j<=num):
            print("+", end = '')
        elif(i==num-1 and j<num1):
            print("#", end = '')
        elif(i<num and j==1):
            print("#", end = '')
        elif(i<num and j<num1):
            print("+", end = '')
        elif(i<num and j==num1):
            print("#", end = '')
        elif(i<num and j<=(num-num2)):
            print("+", end = '')
        elif(i<num and j<=num):
            print(".", end = '')
    num2+=1
    print('')