public String[] wordsWithout(String[] words, String target){
  String str="";
  for(int x=0;x<words.length;x++){
    if(words[x].equals(target)==false){
      str=str+words[x];
    }
  }
  String wrd[]=str.split("");
  return wrd;
}
