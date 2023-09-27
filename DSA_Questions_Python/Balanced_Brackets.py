def check(str):
    stack = []

    if not str or str[0] == ')' or str[0] == '}' or str[0] == ']':
        return "not balanced"

    for ch in str:
        if ch == '(' or ch == '{' or ch == '[':
            stack.append(ch)
        else:
            if not stack:
                return "not balanced"
            if (stack[-1] == '(' and ch == ')') or \
               (stack[-1] == '{' and ch == '}') or \
               (stack[-1] == '[' and ch == ']'):
                stack.pop()
            else:
                return "not balanced"

    if not stack:
        return "balanced"
    else:
        return "not balanced"