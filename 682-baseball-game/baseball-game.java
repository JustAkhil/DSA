class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("C")) {
                st.pop();

            } else if (arr[i].equals("D")) {
                int num = st.peek() * 2;
                st.push(num);

            } else if (arr[i].equals("+")) {
                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a + b);

            } else {
                st.push(Integer.parseInt(arr[i]));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}