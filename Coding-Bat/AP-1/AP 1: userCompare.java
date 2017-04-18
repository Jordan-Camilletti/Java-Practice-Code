/*We have data for two users, A and B, each with a String name and an int id. 
The goal is to order the users such as for sorting.
Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. 
Order first by the string names, and then by the id numbers if the names are the same.*/

public int userCompare(String aName, int aID, String bName, int bID){
  if(bName.equals(aName)){
    if(aID>bID) return 1;
    else if(bID>aID) return -1;
    return 0;
  }
  if(bName.compareTo(aName)<0) return 1;
  return -1;
}
