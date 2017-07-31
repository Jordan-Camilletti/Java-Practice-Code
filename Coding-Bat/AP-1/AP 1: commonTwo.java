/*Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. 
Return the count of the number of strings which appear in both arrays. 
The best "linear" solution makes a single pass over both arrays,
taking advantage of the fact that they are in alphabetical order.*/

public int commonTwo(String[] a, String[] b) {
  int aNum=0,bNum=0,diff=0;
  String used="";
  while(aNum<a.length&&bNum<b.length){
    if(a[aNum].compareTo(b[bNum])==0&&!a[aNum].equals("")){
      diff+=1;
      for(String str: used.split("")){
        if(str.equals(a[aNum])) diff-=1;
      }
      used=used+a[aNum];
      aNum+=1;
      bNum+=1;
    }else if(a[aNum].compareTo(b[bNum])<0){
      aNum+=1;
    }else{
      bNum+=1;
    }
  }
  return diff;
}
