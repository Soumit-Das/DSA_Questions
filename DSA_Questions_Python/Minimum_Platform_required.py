N = int(input())

ari = [[0, 1] for _ in range(N)]
dept = [[0, -1] for _ in range(N)]
mat = [[0, 0] for _ in range(N * 2)]

for i in range(N):
    str_ari = input()
    if len(str_ari) == 5:
        str_ari = str_ari[0] + str_ari[1] + str_ari[3] + str_ari[4]
    else:
        str_ari = str_ari[0] + str_ari[2] + str_ari[3]
    
    ari[i][0] = int(str_ari)
    mat[i][0] = ari[i][0]

for i in range(N):
    str_dept = input()
    if len(str_dept) == 5:
        str_dept = str_dept[0] + str_dept[1] + str_dept[3] + str_dept[4]
    else:
        str_dept = str_dept[0] + str_dept[2] + str_dept[3]

    dept[i][0] = int(str_dept)
    mat[i + N][0] = dept[i][0]

mat.sort(key=lambda x: x[0])

sum_ = 0
max_ = 0

for i in range(N * 2):
    sum_ += mat[i][1]
    max_ = max(max_, sum_)

print(max_)
