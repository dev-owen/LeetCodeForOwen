class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        int[] sayingNumber = Arrays.stream(countAndSay(n - 1).split("")).mapToInt(Integer::parseInt).toArray();
        String answer = "";
        int prevNumber = 0;
        int count = 0;
        for (int number : sayingNumber) {
            if (prevNumber == number || prevNumber == 0) {
                prevNumber = number;
                count++;
            } else {
                answer += (String) (count + "" + prevNumber);
                prevNumber = number;
                count = 1;
            }
        }
        answer += (String) (count + "" + prevNumber);
        return answer;
    }
}