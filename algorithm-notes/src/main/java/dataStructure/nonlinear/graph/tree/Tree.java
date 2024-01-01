package dataStructure.nonlinear.graph.tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String value;
    List<TreeNode> children;

    public TreeNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode childNode) {
        this.children.add(childNode);
    }

    @Override
    public String toString() {
        return toString(this, 0);
    }

    private String toString(TreeNode node, int level) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringBuilder.append("\t");
        }
        stringBuilder.append(node.value).append("\n");
        for (TreeNode child : node.children) {
            stringBuilder.append(toString(child, level + 1));
        }
        return stringBuilder.toString();
    }
}

public class Tree {
    public static void main(String[] args) {
        // 트리 생성
        TreeNode root = new TreeNode("Root");

        // 노드 추가
        TreeNode child1 = new TreeNode("Child 1");
        TreeNode child2 = new TreeNode("Child 2");
        TreeNode child3 = new TreeNode("Child 3");

        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        TreeNode child11 = new TreeNode("Child 1.1");
        TreeNode child12 = new TreeNode("Child 1.2");

        child1.addChild(child11);
        child1.addChild(child12);

        // 트리 출력
        System.out.println(root);
    }
}