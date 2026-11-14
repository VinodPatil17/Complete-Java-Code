import java.util.ArrayList;

public class vp_78Apna_binarySearchTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            return root = new Node(val);
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+ " ");
        inOrder(root.right);
    }

    public static boolean searchKey(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            return searchKey(root.left, key);
        }else if(root.data == key){
            return true;
        }else{
            return searchKey(root.right, key);
        }
    }

    //IMPORTANT SPECIALLY CASE3
    public static Node deleteNode(Node root, int val){
        if(root.data > val){
            root.left = deleteNode(root.left, val);
        }else if(root.data < val){
            root.right = deleteNode(root.right, val);
        }else{
            //Case1 Both the Left Child and Right Child are null
            if(root.left == null && root.right == null){
                return null;
            }

            //Case2 if one child is null another is not
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //VERY IMPORTANT
            //Case3 if parent has both child
            Node Is = inOrderSeccessor(root.right);
            root.data = Is.data;
            root.right = deleteNode(root.right, Is.data);
        }
        return root;

    }
    public static Node inOrderSeccessor(Node root){
        while(root.left != null){
            root =  root.left;
        }
        return root;
    }

    //FINDING NODES BETWEEN RANGE
    public static void rangeBetween(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            rangeBetween(root.left, x, y);
            System.out.println(root.data + " ");
            rangeBetween(root.right, x, y);
        }else if(root.data >= y){
            rangeBetween(root.left, x,y);
        }else{
            rangeBetween(root.right, x,y);
        }
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        //leaf node
        if(root.left == null && root .right == null){
            printPath(path);
        }else{
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }
        path.remove(path.size() -1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i)+ "-->");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int [] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        System.out.println(searchKey(root, 7));

        deleteNode(root, 5);
        inOrder(root);

        rangeBetween(root , 3,12);

        rootToLeaf(root, new ArrayList<>());
    }
}
