n = 4

my_list = []

for i in range(n):
    list.append(int(input()))

count = 0

for j in range(n):
    if list[j] >= 10:
        count = count + 1


print(count)

