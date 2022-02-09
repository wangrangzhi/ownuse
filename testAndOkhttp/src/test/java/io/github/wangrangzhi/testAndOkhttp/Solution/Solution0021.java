package io.github.wangrangzhi.testAndOkhttp.Solution;


import io.github.wangrangzhi.testAndOkhttp.Solution.structure.ListNode;

public class Solution0021 {

    public static void main(String[] args) {
        Solution0021 solution = new Solution0021();
        ListNode listNode0 = ListNode.createTestData("[1,3,5,7,9]");
        ListNode listNode1 = ListNode.createTestData("[2,4,6,8,10]");
//        ListNode.print(listNode0);
//        ListNode.print(listNode1);
        ListNode.print(solution.mergeTwoLists(listNode0, listNode1));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode a = new ListNode(0);

        ListNode tmp = a;

        while (l1 != null && l2 != null) {

            if(l1.val < l2.val){
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            }else{
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }

        }

        tmp.next = l1 != null ? l1 : l2;
       // ListNode.print();


        return a.next;

    }
}

