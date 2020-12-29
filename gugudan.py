input_user = list(map(int, input("입력하고 싶은 단과 몇 번째까지 구할지?: ").split(","))) 
dan = input_user[0]
number = input_user[1]
for i in range(2, dan+1):
    array  = []
    for j in range(1, number+1):
        array.append(i * j)
    print(array)
