/*The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
the "answers" array contains a student's answers, with "?" representing a question left blank.
The two arrays are not empty and are the same length. 
Return the score for this array of answers, 
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.*/

public int scoreUp(String[] key, String[] answers) {
  int score=0;
  for(int x=0;x<key.length;x++){
    if(key[x].equals(answers[x])){
      score+=4;
    }else if(!answers[x].equals("?")){
      score-=1;
    }
  }
  return(score);
}
