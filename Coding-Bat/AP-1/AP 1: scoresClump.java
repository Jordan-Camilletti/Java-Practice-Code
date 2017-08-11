/*Given an array of scores sorted in increasing order,
return true if the array contains 3 adjacent scores that differ from each other by at most 2.*/

public boolean scoresClump(int[] scores) {
  for(int x=0;x<scores.length-2;x++){
    if(scores[x+2]-scores[x+1]<=2&&scores[x+1]-scores[x]<=2&&scores[x+2]-scores[x]<=2) return true;
  }
  return false;
}
