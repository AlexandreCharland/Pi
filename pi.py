import math
val = 60 #60 est aussi le max avec python
num = (2<<val)*((math.factorial(val>>1))**2)
denom = math.factorial(val)*math.sqrt(val)
print((num/denom)**2/2)