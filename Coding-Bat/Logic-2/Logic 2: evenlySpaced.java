/*Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced.*/

public boolean evenlySpaced(int a, int b, int c){
  if(a>b&&a>c){
    if(b>c){//a,b,c
      return(a-b==b-c);
    }else{//a,c,b
      return(a-c==c-b);
    }
  }else if(b>a&&b>c){
    if(a>c){//b,a,c
      return(b-a==a-c);
    }else{//b,c,a
      return(b-c==c-a);
    }
  }else{
    if(a>b){//c,a,b
      return(c-a==a-b);
    }else{//c,b,a
      return(c-b==b-a);
    }
  }
}
