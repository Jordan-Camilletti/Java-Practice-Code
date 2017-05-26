/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
When a position in the array has been swapped, it no longer matches anything.
Using a map, this can be solved making just one pass over the array.*/

public String[] allSwap(String[] strings){
  Map<String, String> map=new HashMap<String, String>();
  String thingy;
  for(int x=0;x<strings.length;x++){
    if(map.containsKey(strings[x].substring(0,1))){
      thingy=strings[x];
      strings[x]=strings[Integer.parseInt(map.get(strings[x].substring(0,1)))];
      strings[Integer.parseInt(map.get(strings[x].substring(0,1)))]=thingy;
      map.remove(strings[x].substring(0,1));
    }else{
      map.put(strings[x].substring(0,1),Integer.toString(x));
    }
  }
  return strings;
}
