This project tries to approximate pi using Pascal's triangle and the Gaussian distribution.\
The idea is the following\
X:={-1, 1} with equal probability.\
Y(n) = 1/sqrt(n) * sum of n X\
One can show that Y(n) tends toward a Gaussian distribution when n tends toward infinity.\
   1\
  1 1\
 1 2 1\
Here is a abbreviated version of the Pascal triangle.\
If you look at the last row, it could be interpreted as how many possible path to get to this node.\
For example, the 2 has 2 path. Starting at the top, going left, then right and starting at the top, going right, then left.\
One can prove that this is always true, by using the core proprety of the triangle, the node bellow is the sum of those above.\
Hence dividing by 2^n (the sum of the nth row) and multiplying by sqrt(n) will give us a Gaussian distribution!\
Since the middle of the gaussian is of height sqrt(2 pi) we can obtain pi with the following formula\
((2^n)((n/2)!)^2)/((n!)sqrt(n))
