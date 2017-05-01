/*Given a string and a non-empty word string, 
return a string made of each char just before and just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.*/

public String wordEnds(String str, String word){
  String newWrd="";
  if(str.length()>word.length()&&(str.substring(0,word.length())).equals(word)) newWrd+=str.substring(word.length(),word.length()+1);
  for(int x=1;x<str.length()-word.length();x++){
    if((str.substring(x,x+word.length())).equals(word)){
      newWrd=newWrd+str.substring(x-1,x)+str.substring(x+word.length(),x+word.length()+1);
    }
  }
  if(str.length()>word.length()&&(str.substring(str.length()-word.length(),str.length())).equals(word)) newWrd=newWrd+str.substring(str.length()-1-word.length(),str.length()-word.length());
  return newWrd;
}
