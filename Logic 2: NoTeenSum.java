/*Given 3 int values, a b c, return their sum. 
However, if any of the values is a teen -- in the range 13..19 inclusive -- 
then that value counts as 0, except 15 and 16 do not count as a teens.*/

public int noTeenSum(int a, int b, int c) {
  if((a>12&&a<15)||(a>16&&a<20)){
    a=0;
  }
  if((b>12&&b<15)||(b>16&&b<20)){
    b=0;
  }
  if((c>12&&c<15)||(c>16&&c<20)){
    c=0;
  }
  return a+b+c;
}
