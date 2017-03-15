/*Return true if the string "cat" and "dog" appear the same number of times in the given string.*/

public boolean catDog(String str) {
  int cat=0;
  int dog=0;
  String arr[]=str.split("");
  for(int x=0;x<str.length()-1;x++){
    if(arr[x].equals("c")&&arr[x+1].equals("a")&&arr[x+2].equals("t")){
      cat++;
    }else if(arr[x].equals("d")&&arr[x+1].equals("o")&&arr[x+2].equals("g")){
      dog++;
    }
  }
  return(cat==dog);
}
