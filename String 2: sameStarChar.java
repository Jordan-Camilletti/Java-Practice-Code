/*Returns true if for every '*' (star) in the string,
if there are chars both immediately before and after the star, they are the same.*/

public boolean sameStarChar(String str) {
  String[] arr=str.split("");
  for(int x=2;x<arr.length-1;x++){
    if(arr[x].equals("*")){
      if((arr[x-1].equals(arr[x+1]))==false){
        return false;
      }
    }
  }
  return true;
}
