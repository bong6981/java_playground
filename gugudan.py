x, y = map(int,input("입력하고 싶은 단과 행?: ").split(","))
for i in range(2, x+1):
    array = []
    for j in range(y):
        array.append(i * (j+1)) 
    print(array)


