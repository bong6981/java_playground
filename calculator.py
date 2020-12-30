input = input("계산하고 싶은 연산: ")
prev_num = int(input[0])
for i in range(1, len(input)):
    if i%2 == 1:
        buho = input[i]
    else:
        number = int(input[i])
        if buho == "+":
            result = prev_num + number
        elif buho == "-":
            result = prev_num - number
        elif buho == "*":
            result = prev_num * number
        else:
            result = prev_num / number
        prev_num = result
        print(f'결과값은 {result}')





















































