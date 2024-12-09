package MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultNode = new ListNode();
        ListNode linker = resultNode;

        ListNode l1Linker = list1;
        ListNode l2Linker = list2;

        // The lists are already sorted, that's why iterative merging should do it.
        while (l1Linker != null || l2Linker != null) {

            if (l1Linker != null && l2Linker != null) {
                if (l1Linker.val <= l2Linker.val) {

                    linker.next = new ListNode(l1Linker.val);
                    linker = linker.next;
                    linker.next = new ListNode(l2Linker.val);
                    l1Linker = l1Linker.next;

                } else {

                    linker.next = new ListNode(l2Linker.val);
                    linker = linker.next;
                    linker.next = new ListNode(l1Linker.val);
                    l2Linker = l2Linker.next;

                }

            } else if (l1Linker != null) {

                linker.next = new ListNode(l1Linker.val);
                linker = linker.next;
                l1Linker = l1Linker.next;

            } else {
                linker.next = new ListNode(l2Linker.val);
                linker = linker.next;
                l2Linker = l2Linker.next;
            }

        }
        return resultNode.next;
    }
}
