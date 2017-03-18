/*Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, 
append the string to the result. Return the empty string if no string appears a 2nd time.*/

public String wordAppend(String[] strings) {
  String wrd="";
  Map<String, String> map=new HashMap<String, String>();
  for(int x=0;x<strings.length;x++){
    if(map.containsKey(strings[x])){
      wrd=wrd+strings[x];
      map.remove(strings[x]);
    }else{
      map.put(strings[x],strings[x]);
    }
  }
  return wrd;
}
