/*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
so 12 rounds down to 10. Given 3 ints, a b c,
return the sum of their rounded values.*/

public int round10(int num){
 float num3=num;
 float num2=num3/10;
 int num1=Math.round(num2);
 return num1*10;
}

public int roundSum(int a, int b, int c) {
  return(round10(a)+round10(b)+round10(c));
}
