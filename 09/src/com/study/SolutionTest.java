package com.study;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        a1.next = new ListNode(4);
        a1.next.next = new ListNode(3);
        ListNode a2 = new ListNode(5);
        a2.next = new ListNode(6);
        a2.next.next = new ListNode(4);

        ListNode a3 = new Solution().addTwoNumbers(a1, a2);
        System.out.println(a3.val+""+a3.next.val);
    }
}

/*class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int sum=0;
        int jinshu = 0;
        ListNode l11 = l1.next;
        ListNode l22 = l2.next;
        ListNode cusor = result;
        while (l1 != null && l2 != null) {
            ListNode cusor1;
            sum = l1.val + l2.val;
            if(sum >=10){
                cusor1= new ListNode(sum%10+jinshu);
                jinshu++;
            }else {
                cusor1 = new ListNode(sum+jinshu);
                jinshu = 0;
            }
            l1 = l11;
            l2 = l22;
            if (l1 != null && l2 != null) {
                l11 = l1.next;
                l22 = l2.next;
            }
            cusor.next = cusor1;
            cusor = cusor1;

        }


        return result.next;
    }
}*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                int temp = l1.val + l2.val + carry;
                cur.next = new ListNode(temp % 10);
                cur = cur.next;
                carry = temp / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l2 != null) {
                int temp = l2.val + carry;
                cur.next = new ListNode(temp % 10);
                cur = cur.next;
                carry = temp / 10;
                l2 = l2.next;
            }
            else if(l1 != null) {
                int temp = l1.val + carry;
                cur.next = new ListNode(temp % 10);
                cur = cur.next;
                carry = temp / 10;
                l1 = l1.next;
            }
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}