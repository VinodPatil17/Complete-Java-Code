public class vp_82Apna_Trie{

    //CREATION OF TRIE
    static class Node{
        Node[] children;
        boolean eow; //end of the word

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    public static Node root = new Node();


    //INSERTION OF WORDS IN TRIE
    public static void insert(String Word){
        Node currEle = root;
        for(int i = 0; i < Word.length(); i++){
            int idx = Word.charAt(i) - 'a';
            if(currEle.children[idx] == null){
                currEle.children[idx] = new Node();

                if(i == Word.length() - 1){
                    currEle.eow = true;
                }
            }
            currEle = currEle.children[idx];
        }
    }

    //SEARCHING WORDS
    public static boolean search(String key){
        Node currEle = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(currEle == null){
                return false;
            }

//            if(i == key.length()-1 && currEle.eow == false){
//                return false;
//            }

            if(currEle.children[idx] ==null){
                return false;
            }

            currEle = currEle.children[idx];
        }
        return true;
    }

    //PROBLEM WORDBREAK AND FIND IT
    public static boolean wordBreak(String key){
        if(key.isEmpty()){
            return true;
        }

        for(int i = 1; i <= key.length(); i++){
            String firstKey = key.substring(0,i);
            String secondKey = key.substring(i);
            if (search(firstKey) && wordBreak(secondKey)) {
                return true;
            }
        }
        return false;
    }

    //finding prefix or it has comman word in it
    public static boolean startWith(String key){
        Node currEle = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';

            if(currEle.children[idx] == null){
                return false;
            }
            currEle = currEle.children[idx];
        }
        return true;
    }
    public static void main(String[] args){
        String[] words = {"i", "like", "porsche"};
        String key = "ilikeporsche";

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("like"));
        System.out.println(search("porsche"));
        System.out.println(search("pulld"));

        System.out.println(wordBreak(key));

        System.out.println(startWith("li"));
    }
}