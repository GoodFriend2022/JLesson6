import java.util.ArrayList;

public class task {
    public static void main(String[] args) {
        task();
    }

    static void task() {
        treenode tree = new treenode(1,null, new treenode(2,null,new treenode(3)));
        System.out.println(preorderTraversal(tree));
    }

    static ArrayList<Integer> preorderTraversal(treenode root) {
        ArrayList<Integer> array = new ArrayList<>();
        if (root != null) {
            array.add(root.val);
            array.addAll(preorderTraversal(root.left));
            array.addAll(preorderTraversal(root.right));
        }
        return array;
    }

    public void fillTree(treenode root, int k) {
        if (root == null) {
            root.val = k;
        } else if (root.left == null) {
            fillTree(root.left, k);
        } else {
            fillTree(root.right, k);
        }
    }

}
