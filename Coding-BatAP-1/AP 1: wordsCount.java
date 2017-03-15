/*Given an array of strings, return the count of the number of strings with the given length.*/

public int wordsCount(String[] words, int len) {
  int tot=0;
  for(int x=0;x<words.length;x++){
    if(words[x].length()==len){
      tot++;
    }
  }
  return tot;
}
