def odd_even(arr, s):
    num = len(s)
    if num == 3 :
        for i in range (0,len(arr)):
            if i%2==0:
                print(arr[i],end='')
    else:
        for i in range (0,len(arr)):
            if i%2==1:
                print(arr[i],end='')



print("*** Odd Even ***")
kind,message,type = input("Enter Input : ").split(',')
if 'S' in kind:
    odd_even(message, type)
else:

    odd_even(message, type)
#Input ตำแหน่งที่สามเป็นการบอกว่าจะแสดงตำแหน่งคู่หรือคี่ ถ้าใส่ Odd = คี่ ถ้าใส่ Even = คู่