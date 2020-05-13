arr = "9 5 4 2 6 15 12"
y = arr.split(" ")
x = list(map(int,y))
k = 2
x.sort()
count = 1
first = x[0]
step = 2*k + 1
last = x[0] + step
for i in range(len(x)):
    if first <= x[i] < last:
        print(x[i])
    else:
        count = count + 1
        first = x[i]
        last = first + step

print(count)   
