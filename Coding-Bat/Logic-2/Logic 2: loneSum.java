/*Given 3 int values, a b c, return their sum.
However, if one of the values is the same as another of the values, it does not count towards the sum.*/

public int loneSum(int a, int b, int c){
  if(a==b&&b==c){
    return 0;
  }else if(a==b){
    return c;
  }else if(a==c){
    return b;
  }else if (b==c){
    return a;
  }else{
    return (a+b+c);
  }
}
