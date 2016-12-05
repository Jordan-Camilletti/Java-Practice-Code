/*Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
while the other is "far", differing from both other values by 2 or more. */

public boolean closeFar(int a, int b, int c) {
  return((Math.abs(a-b)<=1 && Math.abs(a-c)>=2 && Math.abs(b-c)>=2)||(Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(c-b)>=2));
}
