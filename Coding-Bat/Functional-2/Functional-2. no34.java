//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

public List<String> no34(List<String> strings) {
  strings.removeIf(n->n.length()==3||n.length()==4);
  return strings;
}
