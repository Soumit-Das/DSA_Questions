def calculateSpan(price, n):
    res = []
    res.append(1)
    
    stack = []
    stack.append(0)
    
    for i in range(1, n):
        while stack and price[stack[-1]] <= price[i]:
            stack.pop()
        
        if stack:
            res.append(i - stack[-1])
        else:
            res.append(i + 1)
        
        stack.append(i)
    
    return res

