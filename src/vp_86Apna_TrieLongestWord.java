//finding longest word in trie

public class vp_86Apna_TrieLongestWord {
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
                }
                currEle = currEle.children[idx];
                if(i == key.length() -1){
                    currEle.eow = true;
                }
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
        static String ans = "";
        public static void longestWord(Node root, StringBuilder temp){
            if(root == null){
                return;
            }
            for(int i = 0; i < 26; i++){
                if(root.children[i] != null){
                    temp.append((char) (i + 'a'));
                    if(root.children[i].eow){
                        if(temp.length() > ans.length()){
                            ans = temp.toString();
                        }
                    }
                    longestWord(root.children[i], temp);
                    temp.deleteCharAt(temp.length()-1);
                }
            }
        }

        public static void main(String[] args){
            String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

            for(int i = 0; i < words.length; i++){
                insert(words[i]);
            }

            longestWord(root, new StringBuilder(""));
            System.out.println(ans);

        }
    }
