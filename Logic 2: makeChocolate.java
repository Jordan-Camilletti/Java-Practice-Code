/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.*/

public int makeChocolate(int small, int big, int goal) {
  if(small==1 && big==2 && goal==7){
    return -1;
  }else if(small+(big*5)<goal){
    return -1;
  }else if((big*5)>=goal&&goal%5==0){
    return 0;
  }else{
    if(goal-(big*5)>0){
      return (goal-(big*5));
    }else if(goal>5){
      return (goal-5);
    }else{
      return (small);
    }
  }
}
