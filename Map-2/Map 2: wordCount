/*The classic word-count algorithm: given an array of strings, 
return a Map<String, Integer> with a key for each different string, 
with the value the number of times that string appears in the array.*/

public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int x=0;x<strings.length;x++){
    if(map.containsKey(strings[x])){
      map.put(strings[x], map.get(strings[x])+1);
    }else{
      map.put(strings[x], 1);
    }
  }
  return map;
}
