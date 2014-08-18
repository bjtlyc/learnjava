import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestTreeNode {
    private static TreeNode<Integer> root;
    @BeforeClass
        public static void beforeClass() {
            root = new TreeNode<>(3);
            TreeNode<Integer> node1 = new TreeNode<>(1);
            TreeNode<Integer> node4 = new TreeNode<>(4);
            TreeNode<Integer> node2 = new TreeNode<>(2);
            root.setLeft(node1);
            root.setRight(node4);
            node1.setRight(node2);
        }

    @Test
        public void test1() {
            TreeItr<Integer> itr = root.iter();
            // check not null
            assertTrue(itr.hasNext());
            // check has 1
            assertEquals(itr.next(), new Integer(1));

            // check not null
            assertTrue(itr.hasNext());
            // check has 1
            assertEquals(itr.next(), new Integer(2));

            // check not null
            assertTrue(itr.hasNext());
            // check has 1
            assertEquals(itr.next(), new Integer(3));

            // check not null
            assertTrue(itr.hasNext());
            // check has 1
            assertEquals(itr.next(), new Integer(4));

            assertFalse(itr.hasNext());
        }
}
