class Solution {
    // [3,5,-6,2,-1,4]​​​​​​​
    // st - 3 5 

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack();
        for(int n : asteroids){
            while(!st.isEmpty() && n < 0 && st.peek() > 0){
                int diff = n+st.peek();

                if(diff < 0){
                    st.pop();
                }else if(diff > 0){
                    n = 0;
                } else {
                    n = 0;
                    st.pop();
                }
            }
            if(n!=0){
                st.push(n);
            }
        }

        return st.stream().mapToInt(i -> i).toArray();
    }
}