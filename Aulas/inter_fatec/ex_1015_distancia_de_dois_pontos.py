import math

x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())
dist = ((x2 - x1)**2 + (y2 - y1)**2)
raiz = math.sqrt(dist)
print(f"{raiz:.4f}")