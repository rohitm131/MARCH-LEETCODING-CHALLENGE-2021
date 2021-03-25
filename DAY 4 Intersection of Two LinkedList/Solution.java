/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    
static int length(ListNode head){
         int len = 0;
         while(head!=null){
             head = head.next;
             len++;
         }
         return len;
     }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         int c1 = 0, c2 = 0;
        
//         while(headA != null) {
//             c1++;
//             headA = headA.next;
//         }
        
//         while(headB != null) {
//             c2++;
//             headB = headB.next;
//         }
        
//         int d = c1 - c2;
        
//         while(d > 0) {
//             headA = headA.next;
//             d--;
//         }
//         while(d < 0) {
//             headB = headB.next;
//             d++;
//         }
        
//         while(headA != null && headB != null) {
//             if(headA.val == headB.val) {
//                 return headA;
//             }
//             headA = headA.next;
//             headB = headB.next;
//         }
//         return null;
        
        int lenA =  length(headA);
         int lenB =  length(headB);
         if(lenA > lenB){
             int diff = lenA -lenB;
             while(diff>0){
                 headA = headA.next;
                 diff--;
             }
         } else{

             int diff = lenB -lenA;
             while(diff>0){
                 headB = headB.next;
                 diff--;
             }
         }
         while(headA !=null && headB!=null){
             if(headA == headB){
                 return headA;
             }
             headA = headA.next;
             headB = headB.next;
         }

         return null;
    }
}
