N, K = map(int, input().split())
arr = [0] * N

for _ in range(K):
    a, i = map(int, input().split())
    if a == 1:
        arr[i-1] += 1
    elif a == 2:
        arr[i-1] = 5
    elif a == 3:
        if arr[i-1] < 2:
            print("No")
        else:
            print("Yes")
