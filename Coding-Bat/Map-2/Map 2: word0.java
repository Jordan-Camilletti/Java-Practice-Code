/*Given an array of strings,
return a Map<String, Integer> containing a key for every different string in the array, 
always with the value 0. */

public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map= new HashMap<String, Integer>();
  for(int x=0;x<strings.length;x++){
    if(map.containsKey(strings[x])!=true){
      map.put(strings[x],0);
    }
  }
  return map;
}
