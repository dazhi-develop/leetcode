/*
package com.sdz.leetcode.leetcode.leetcode.editor.cn;//反转一个单链表。
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *//*

class Solution {
    class ListNode {
        private ListNode next;
        private Object value;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
*/
