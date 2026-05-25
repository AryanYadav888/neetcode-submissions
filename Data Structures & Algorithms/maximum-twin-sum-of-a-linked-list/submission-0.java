/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }

        int maxSum = 0;
        temp = head;
        Stack<Integer> st = new Stack();
        for(int i=0;i<n;i++){
            if(i<=(n/2)-1){
                st.push(temp.val);
            }else{
                int topSum = temp.val+st.pop();

                maxSum = Integer.max(maxSum,topSum);
            }
            temp = temp.next;
        }
        return maxSum;
    }
}