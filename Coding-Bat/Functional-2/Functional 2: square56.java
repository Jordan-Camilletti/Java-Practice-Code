/*Given a list of integers, return a list of those numbers squared and the product added to 10, 
omitting any of the resulting numbers that end in 5 or 6.*/

public List<Integer> square56(List<Integer> nums){
  nums.replaceAll(n->(n*n)+10);
  nums.removeIf(n->n%10==5||n%10==6);
  return nums;
}
