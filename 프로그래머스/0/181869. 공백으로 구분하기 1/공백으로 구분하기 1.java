class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}