tc = int(input())

for k in range(tc):
    N, M = map(int, input().split())
    mat = []
    
    for i in range(N):
        row = list(map(int, input().split()))
        mat.append(row)
    
    evil = int(input())
    
    flag = False
    
    for i in range(N):
        for j in range(M):
            if mat[i][j] == evil:
                print("true")
                flag = True
                break
        if flag:
            break
    
    if not flag:
        print("false")
