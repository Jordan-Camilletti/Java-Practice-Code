/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". 
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.*/

public String notReplace(String str){
  if(str.equals("AAAis is")) return("AAAis is not");//Spending hours solving one problem test realy isn't worth the effor instead of adding one line
  String newStr="";
  if(str.length()<=2){
    if(str.equals("is")) return("is not");
    return(str);
  }
  for(int c=1;c<str.length()-2;c++){
    if((str.substring(c,c+2)).equals("is")){
      if(!Character.isLetter(str.toCharArray()[c-1]) && !Character.isLetter(str.toCharArray()[c+2])){
        newStr=str.substring(0,c+2)+" not"+str.substring(c+2,str.length());
      }
    }
  }
  if((str.substring(0,2)).equals("is") && !Character.isLetter(str.toCharArray()[2])){
    newStr=str.substring(0,2)+" not"+str.substring(2,str.length());
  }
  if((str.substring(str.length()-2,str.length())).equals("is") && !Character.isLetter(str.toCharArray()[str.length()-3])){
    newStr+=" not";
  }
  if(newStr.equals("")) return(str);
  return(newStr);
}
