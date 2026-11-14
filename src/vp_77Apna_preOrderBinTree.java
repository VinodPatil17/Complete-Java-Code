import java.util.*;
public class vp_77Apna_preOrderBinTree {

    // PRE ORDER BINARY TREE
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {

            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    //IMPORTANT
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //COUNT OF NODES
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);

        return left + right +1;
    }

    //TRICKY QUESTION AND PATTERN
    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight)+1;

        return maxHeight;
    }

    //LONGEST PATH BY TREE OR DIAMETER OF TREE
    //ITS TIME COMPLEXITY WILL BE O(N^2)

//    public static int diameterOfTree(Node root){
//        if(root == null){
//            return 0;
//        }
//
//        int daiLeft = diameterOfTree(root.left);
//        int diaRight = diameterOfTree(root.right);
//        int diaRoot = heightOfTree(root.left) + heightOfTree(root.right);
//
//        return Math.max(diaRoot, Math.max(diaRight, daiLeft));
//    }

        static class treeInfo{
            int height;
            int diameter;

            treeInfo(int diameter, int height){
                this.height = height;
                this.diameter = diameter;
            }
        }
        public static treeInfo daimeterOfTree(Node root){
            if(root == null){
                return new treeInfo(0 , 0);
            }
            treeInfo left = daimeterOfTree(root.left);
            treeInfo right = daimeterOfTree(root.right);

            int maxHeight = Math.max(left.height, right.height) + 1;

            int diameter1 = left.diameter;
            int diameter2 = right.diameter;
            int diameter3 = left.height + right.height +1;

            int maxDiameter = Math.max(diameter3 , Math.max(diameter1, diameter2));

            treeInfo result = new treeInfo(maxDiameter, maxHeight);
            return result;
        }
    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        //preOrder(root);
        //inOrder(root);
        //postOrder(root);
//        levelOrder(root);
//        System.out.println(countOfNodes(root));
//        System.out.println(sumOfNode(root));
//        System.out.println(heightOfTree(root));
        System.out.println(daimeterOfTree(root).diameter);
    }
}