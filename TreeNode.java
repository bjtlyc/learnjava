import java.util.*;

public class TreeNode<E> {
    private E node;
    private TreeNode<E> left;
    private TreeNode<E> right;
    public TreeItr<E> itr;

    public TreeNode(E e) {
        node = e;
        left = null;
        right = null;
        itr = null;
    }

    public TreeItr<E> iter() {
        itr = new TreeItr<E>(this);
        return itr;
    }
    public TreeNode getLeft() {
        return left;
    }
    
    public TreeNode<E> getRight() {
        return right;
    }

    public void setLeft(TreeNode<E> node) {
        left = node;
    }
    
    public void setRight(TreeNode<E> node) {
        right = node;
    }

    public E getElement() {
        return node;
    }
}



