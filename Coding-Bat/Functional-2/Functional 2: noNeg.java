/*Given a list of integers, return a list of the integers, omitting any that are less than 0.*/

public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(n->n<0);
  return nums;
}
