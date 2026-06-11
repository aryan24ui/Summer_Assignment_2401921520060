class Solution {
    public String decodeString(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch != ']') {
                st.push(ch);
            } else {

                String str = "";

                while(st.peek() != '[') {
                    str = st.pop() + str;
                }

                st.pop(); // remove '['

                String num = "";

                while(!st.isEmpty() && Character.isDigit(st.peek())) {
                    num = st.pop() + num;
                }

                int k = Integer.parseInt(num);

                while(k-- > 0) {
                    for(char c : str.toCharArray()) {
                        st.push(c);
                    }
                }
            }
        }

        String ans = "";

        while(!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        return ans;
    }
}
