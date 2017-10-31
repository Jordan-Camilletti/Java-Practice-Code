/*Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".*/

public String /*HEY NOW, YOU'RE AN*/allStar/*GET YA GAME ON, GO PLAY*/(String str) {
  if(str.length()<=1) return(str);
  return(str.substring(0,1)+"*"+allStar(str.substring(1,str.length())));
}
