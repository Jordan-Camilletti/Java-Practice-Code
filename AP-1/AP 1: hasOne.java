/*Given a positive int n, 
return true if it contains a 1 digit. 
Note: use % to get the rightmost digit, and / to discard the rightmost digit.*/

public boolean hasOne(int n) {
  while(n>=1){
    if(n%10==1){
      return true;
    }
    n=n/10;
  }
  return false;
}
