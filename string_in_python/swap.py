def swap(s, B, C):
    n = len(s)
    C = C % n
    S = list(s)
    for i in range(B):
        s[i], s[(i + C) % n] = s[(i + C) % n], s[i]
    return " ".join(s)

s =  "ABCDEFGH"
B = 4
C = 3
result = swap(s, B, C)
print(result)
