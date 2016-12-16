/*Given an array of scores, return true if each score is equal or greater than the one before. 
The array will be length 2 or more.*/

public boolean scoresIncreasing(int[] scores) {
  int current=scores[0];
  for(int x=1;x<scores.length;x++){
    if(scores[x]>=current){
      current=scores[x];
    }else{
      return false;
    }
  }
  return true;
}
