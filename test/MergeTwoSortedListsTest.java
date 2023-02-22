import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = new ListNode(1);
        result.next = new ListNode(1);
        result.next.next = new ListNode(2);
        result.next.next.next = new ListNode(3);
        result.next.next.next.next = new ListNode(4);
        result.next.next.next.next.next = new ListNode(4);

        ListNode solutionResult = solution.mergeTwoLists(list1, list2);

        assertEquals(result.val, solutionResult.val);
        assertEquals(result.next.val, solutionResult.next.val);
        assertEquals(result.next.next.val, solutionResult.next.next.val);
        assertEquals(result.next.next.next.val, solutionResult.next.next.next.val);
        assertEquals(result.next.next.next.next.val, solutionResult.next.next.next.next.val);
        assertEquals(result.next.next.next.next.next.val, solutionResult.next.next.next.next.next.val);
    }
}