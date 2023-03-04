import java.util.ArrayList;

public class task {
    public static void main(String[] args) {
        ArrayList<Integer> list = UserTree();
        System.out.println(list);
    }

    static ArrayList<Integer> UserTree() {
        treenode tree = new treenode(1, null, new treenode(2, null, new treenode(3)));
        return PreorderTraversal(tree);
    }

    static ArrayList<Integer> PreorderTraversal(treenode root) {
        ArrayList<Integer> array = new ArrayList<>();
        if (root != null) {
            array.add(root.val);
            array.addAll(PreorderTraversal(root.left));
            array.addAll(PreorderTraversal(root.right));
        }
        return array;
    }
}
