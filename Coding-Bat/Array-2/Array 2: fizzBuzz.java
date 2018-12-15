public String[] fizzBuzz(int start, int end) {
  String[] nums=new String[end-start];
  for(int n=start;n<end;n++){
    if(n%3==0 && n%5==0){
      nums[n]="FizzBuzz";
    }else if(n%3==0){
      nums[n]="Fizz";
    }else if(n%5==0){
      nums[n]="Buzz";
    }else{
      nums[n]=n;  
    }
  }
  return(nums);
}
