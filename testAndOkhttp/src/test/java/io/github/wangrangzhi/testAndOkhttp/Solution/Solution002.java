package io.github.wangrangzhi.testAndOkhttp.Solution;

import io.github.wangrangzhi.testAndOkhttp.Solution.structure.ListNode;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/04/21
 *     desc  :
 * </pre>
 */


public class Solution002 {
    public static void main(String[] args) {
        Solution002 solution = new Solution002();
        ListNode.print(solution.addTwoNumbers(
                ListNode.createTestData("[2,4,3]"),
                ListNode.createTestData("[5,6,4]")
        ));
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode listNode = new ListNode(0);

        ListNode l11 = l1;
        ListNode l22 = l2;
        ListNode t = listNode;

        int sum = 0;

        while (l11 != null || l22 != null) {

            sum /= 10;
            if (l11 != null) {
                sum += l11.val;
                l11 = l11.next;
            }
            if (l22 != null) {
                sum += l22.val;
                l22 = l22.next;
            }

            t.next = new ListNode(sum % 10);
            t = t.next;
        }

        if (sum / 10 != 0) t.next = new ListNode(1);
        return listNode.next;


    }
}