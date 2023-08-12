class TreeNodee {
    int val;
    TreeNodee left;
    TreeNodee right;

    TreeNodee(int val) {
        this.val = val;
    }
}

public class MaxElementInBinaryTree {

    public static int findMaxElement(TreeNodee root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftMax = findMaxElement(root.left);
        int rightMax = findMaxElement(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        TreeNodee root = new TreeNodee(1);
        root.left = new TreeNodee(2);
        root.right = new TreeNodee(3);
        root.left.left = new TreeNodee(4);
        root.left.right = new TreeNodee(5);
        root.right.left = new TreeNodee(6);
        root.right.right = new TreeNodee(7);

        int maxElement = findMaxElement(root);
        System.out.println("The maximum element in the binary tree is: " + maxElement);
    }
}
