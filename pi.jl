val = 60#max je peux avoir avec julia
num = (2<<val)*(factorial(big(val>>1)))^2
denom = factorial(big(val))*sqrt(val)
print((num/denom)^2/2)