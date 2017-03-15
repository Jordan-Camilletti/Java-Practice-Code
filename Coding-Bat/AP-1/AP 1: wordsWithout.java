/*Given an array of strings, return a new array without the strings that are equal to the target string.
One approach is to count the occurrences of the target string, 
make a new array of the correct length, and then copy over the correct strings.*/

public String[] wordsWithout(String[] words, String target){
  String str="";
  for(int x=0;x<words.length;x++){
    if(words[x].equals(target)==false){
      str=str+" "+words[x];
    }
  }
  String wrd[]=(str.substring(1,str.length())).split(" ");
  return wrd;
}
