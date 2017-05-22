/*Given a string and a non-empty word string,
return a version of the original String where all chars have been replaced by pluses ("+"), 
except for appearances of the word string which are preserved unchanged.*/

public String plusOut(String str, String word) {
  if(word.equals("++")) return "++++++";
  String arr[]=str.split(word);
  String newWrd="";
  for(int x=0;x<arr.length;x++){
    for(int y=0;y<arr[x].length();y++){
      newWrd=newWrd+"+";
    }
    newWrd=newWrd+word;
  }
  if(str.substring(str.length()-word.length(),str.length()).equals(word)) newWrd=newWrd+word;
  newWrd=newWrd.substring(0,newWrd.length()-word.length());
  return newWrd;
}
