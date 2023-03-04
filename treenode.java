import java.util.TreeMap;

public class treenode {
    int val;
    treenode left;
    treenode right;

    treenode() {
    }

    treenode(int val) {
        this.val = val;
    }

    treenode(int val, treenode left, treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}