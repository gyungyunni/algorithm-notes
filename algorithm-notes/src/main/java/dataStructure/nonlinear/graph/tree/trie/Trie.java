package dataStructure.nonlinear.graph.tree.trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return node.isEndOfWord;
    }

    public static void main(String[] args) {
        // Trie 생성
        Trie myTrie = new Trie();

        // 단어 삽입
        myTrie.insert("apple");
        myTrie.insert("app");
        myTrie.insert("banana");

        // 단어 검색
        System.out.println("Search 'apple': " + myTrie.search("apple"));
        System.out.println("Search 'app': " + myTrie.search("app"));
        System.out.println("Search 'banana': " + myTrie.search("banana"));
        System.out.println("Search 'grape': " + myTrie.search("grape"));
    }
}
