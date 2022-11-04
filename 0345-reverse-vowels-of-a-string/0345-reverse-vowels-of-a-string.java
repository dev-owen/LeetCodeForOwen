class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				stack.push(arr[i]);
				arr[i] = '\\';
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '\\') {
				char c = stack.pop();
				arr[i] = c;
			}
		}
		return new String(arr);
    }
}