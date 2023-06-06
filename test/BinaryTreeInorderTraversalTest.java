import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {

    @Test
    void inorderTraversal() {
        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expectedList = List.of(1, 3, 2);

        assertEquals(expectedList, solution.inorderTraversal(root1));
    }
}