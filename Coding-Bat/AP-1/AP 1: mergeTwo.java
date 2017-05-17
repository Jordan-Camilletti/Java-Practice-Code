/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays. 
The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more. 
The best "linear" solution makes a single pass over A and B, 
taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.*/

public String[] mergeTwo(String[] a, String[] b, int n) {
  int currA=0,currB=0,len=0;
  String[] newArr=new String[n];
  while(len<n){
    if(a[currA].compareTo(b[currB])<0){
      if(Arrays.asList(newArr).contains(a[currA])){
        newArr[len]=b[currB];
        currB++;
      }else{
        newArr[len]=a[currA];
        currA++;
      }
    }else if(a[currA].compareTo(b[currB])>0){
      if(Arrays.asList(newArr).contains(b[currB])){
        newArr[len]=a[currA];
        currA++;
      }else{
        newArr[len]=b[currB];
        currB++;
      }
    }else{
      newArr[len]=a[currA];
      currA++;
      currB++;
    }
    len++;
  }
  return newArr;
}
