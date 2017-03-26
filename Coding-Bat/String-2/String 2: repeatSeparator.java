/*Given two strings, word and a separator sep,
return a big string made of count occurrences of the word, 
separated by the separator string.*/

public String repeatSeparator(String word, String sep, int count) {
  String wrd="";
  for(int x=0;x<(count*2)-1;x++){
    if(x%2==0){
      wrd+=word;
    }else{
      wrd+=sep;
    }
  }
  return wrd;
}
