/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
Using a map, this can be solved making just one pass over the array.*/

public String[] firstSwap(String[] strings){
  Map<String, String> map=new HashMap<String, String>();
  List<String>used=new ArrayList<>();
  boolean using=true;
  String thingy;
  for(int x=0;x<strings.length;x++){
    for(int t=0;t<used.size();t++){
      if(used.get(t).equals(strings[x].substring(0,1))) using=false;
    }
    if(map.containsKey(strings[x].substring(0,1))&&using){
      thingy=strings[x];
      strings[x]=strings[Integer.parseInt(map.get(strings[x].substring(0,1)))];
      strings[Integer.parseInt(map.get(strings[x].substring(0,1)))]=thingy;
      map.remove(strings[x].substring(0,1));
      used.add(strings[x].substring(0,1));
    }else if(using){
      map.put(strings[x].substring(0,1),Integer.toString(x));
    }
    using=true;
  }
  return strings;
}
