public class vp_84Apna_TrieProb {

    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    public static Node root = new Node();

    public static void insert(String key){
        Node currEle = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(currEle.children[idx] == null){
                currEle.children[idx] = new Node();
                if(i == key.length() -1){
                    currEle.eow = true;
                }
            }
            currEle = currEle.children[idx];
        }
    }

    public static boolean search(String key){
        Node currEle = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(currEle.children[idx] == null){
                return false;
            }
            if(i == key.length() -1 && currEle.eow == false){
                return false;
            }
        }
        return true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;

        for(int i = 0; i < 26; i++){
            count += countNode(root.children[i]);
        }
        return count +1;
    }
    public static void main(String[] args){
        String str = "apple";

        for(int i = 0; i < str.length(); i++){
            String fun = str.substring(i);
            insert(fun);
        }

        //System.out.println(search("apple"));
        System.out.println(countNode(root));
    }
}
