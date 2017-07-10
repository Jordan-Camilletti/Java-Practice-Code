/*Given an array of scores, compute the int average of the first half and the second half, 
and return whichever is larger. We'll say that the second half begins at index length/2. 
The array length will be at least 2. To practice decomposition, write a separate helper method int average.*/

public int average(int[] scores, int s, int e){
  int score=0;
  for(int curr=s;curr<e;curr++){
    score+=scores[curr];
  }
  score/=(scores.length/2);
  return(score);
}

public int scoresAverage(int[] scores) {
  int a=average(scores,0,(scores.length/2));
  int b=average(scores,scores.length/2,scores.length);
  if(a>b) return a;
  return b;
}
