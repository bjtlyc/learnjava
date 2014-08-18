import java.util.*;

public class TreeItr<E> implements Iterator<E>{
    private TreeNode<E> node;
    private Stack<TreeNode<E>> stack;
    private boolean ifFirst = true;

    public TreeItr(TreeNode node) {
        this.node = node;
        stack = new Stack<>();
    }

    @Override
    public boolean hasNext() {
        if( ifFirst ) {
            ifFirst = false;
            return true;
        } else {
            return node != null || !stack.isEmpty();
        }
    }

    @Override
    public E next() {
        while( node != null || !stack.isEmpty() ) {
            if( node == null ) {
                TreeNode<E> tmp = stack.pop();
                node = tmp.getRight();
                return tmp.getElement();
            } else {
                stack.push(node);
                node = node.getLeft();
            }
        }
        return null;
    }
    
    @Override
    public void remove() {
    }
}
