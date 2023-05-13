import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedListTest {

    @Test
    void deleteDuplicates() {
        // test 1
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        RemoveDuplicatesFromSortedList.ListNode head1 = new RemoveDuplicatesFromSortedList().new ListNode(1);
        head1.next = new RemoveDuplicatesFromSortedList().new ListNode(1);
        head1.next.next = new RemoveDuplicatesFromSortedList().new ListNode(2);

        RemoveDuplicatesFromSortedList.ListNode expectedListNode1 = new RemoveDuplicatesFromSortedList().new ListNode(1);
        expectedListNode1.next = new RemoveDuplicatesFromSortedList().new ListNode(2);

        RemoveDuplicatesFromSortedList.ListNode solutionResult1 = solution.deleteDuplicates(head1);

        assertEquals(expectedListNode1.val, solutionResult1.val);
        assertEquals(expectedListNode1.next.val, solutionResult1.next.val);

        //test 2
        RemoveDuplicatesFromSortedList.ListNode head2 = new RemoveDuplicatesFromSortedList().new ListNode(1);
        head2.next = new RemoveDuplicatesFromSortedList().new ListNode(1);
        head2.next.next = new RemoveDuplicatesFromSortedList().new ListNode(2);
        head2.next.next.next = new RemoveDuplicatesFromSortedList().new ListNode(3);
        head2.next.next.next.next = new RemoveDuplicatesFromSortedList().new ListNode(3);

        RemoveDuplicatesFromSortedList.ListNode expectedListNode2 = new RemoveDuplicatesFromSortedList().new ListNode(1);
        expectedListNode2.next = new RemoveDuplicatesFromSortedList().new ListNode(2);
        expectedListNode2.next.next = new RemoveDuplicatesFromSortedList().new ListNode(3);

        RemoveDuplicatesFromSortedList.ListNode solutionResult2 = solution.deleteDuplicates(head2);

        assertEquals(expectedListNode2.val, solutionResult2.val);
        assertEquals(expectedListNode2.next.val, solutionResult2.next.val);
        assertEquals(expectedListNode2.next.next.val, solutionResult2.next.next.val);
    }
}