from collections import Counter

n = int(input())
a = Counter(input().split()) + Counter(input().split())
print([e for e in a if a[e] % 2][0])
