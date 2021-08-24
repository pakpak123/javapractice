print('*** multiplication or sum ***')
number = str(input("Enter num1 num2 : "))
nums = number.split(' ')
# เวลาเอาเลขใน List เปลี่ยนเป็นตัวเลขก็บังคับมันซะเลย
A = int(nums[0])
B = int(nums[1])
result = A * B
C = A + B
if result > 1000:
    print('The result is %d' % C)
else:
    print('The result is %d' % result)
