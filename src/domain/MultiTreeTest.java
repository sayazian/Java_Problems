package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

class MultiTreeTest {

    @Test
    void preOrderTraversalTest() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeB = new MultiTree.TreeNode<>("b", "nodeB", null);
        MultiTree.TreeNode<String> nodeC = new MultiTree.TreeNode<>("c", "nodeC", null);
        multiTree.root = new MultiTree.TreeNode<String>("a", "nodeA", List.of(nodeB, nodeC));
        assertEquals(List.of("nodeA: a", "nodeB: b", "nodeC: c"), multiTree.preOrderTraversal());
    }

    @Test
    void preOrderTraversalTestV2() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeB = new MultiTree.TreeNode<>("b", "nodeB", null);
        MultiTree.TreeNode<String> nodeC = new MultiTree.TreeNode<>("c", "nodeC", null);
        MultiTree.TreeNode<String> nodeD = new MultiTree.TreeNode<>("d", "nodeD", null);
        MultiTree.TreeNode<String> nodeE = new MultiTree.TreeNode<>("e", "nodeE", null);
        MultiTree.TreeNode<String> nodeF = new MultiTree.TreeNode<>("f", "nodeF", null);
        MultiTree.TreeNode<String> nodeG = new MultiTree.TreeNode<>("g", "nodeG", null);
        nodeB.children = List.of(nodeD, nodeE);
        nodeC.children = List.of(nodeF, nodeG);
        multiTree.root = new MultiTree.TreeNode<String>("a", "nodeA", List.of(nodeB, nodeC));
        assertEquals(
                List.of("nodeA: a", "nodeB: b", "nodeD: d", "nodeE: e", "nodeC: c", "nodeF: f", "nodeG: g"),
                multiTree.preOrderTraversal());
    }

    @Test
    void preOrderTraversalTestV3() {
        MultiTree<String> multiTree = getStringMultiTree();
        assertEquals(
                List.of("nodeA: a", "nodeB: b", "nodeD: d", "nodeH: h", "nodeI: i",
                        "nodeE: e", "nodeJ: j", "nodeK: k",
                        "nodeC: c", "nodeF: f", "nodeL: l", "nodeM: m",
                        "nodeG: g", "nodeN: n", "nodeO: o"),
                multiTree.preOrderTraversal());
    }

    @Test
    void postOrderTraversalTest() {
        MultiTree<String> multiTree = getStringMultiTree();
        assertEquals(
                List.of("nodeH: h", "nodeI: i", "nodeD: d",
                        "nodeJ: j", "nodeK: k", "nodeE: e",
                        "nodeB: b",
                        "nodeL: l", "nodeM: m", "nodeF: f",
                        "nodeN: n", "nodeO: o", "nodeG: g",
                        "nodeC: c", "nodeA: a"),
                multiTree.postOrderTraversal());
    }

    @Test
    void preOrderTraversalTest2() {
        MultiTree<String> multiTree = getStringMultiTree2();
        assertEquals(
                List.of("nodeS: s", "nodeA: a", "nodeH: h", "nodeZ: z",
                        "nodeI: i", "nodeR: r", "nodeN: n", "nodeM: m", "nodeV: v",
                        "nodeY: y", "nodeJ: j",
                        "nodeL: l", "nodeF: f", "nodeK: k", "nodeT: t"),
                multiTree.preOrderTraversal());
    }

    @Test
    void postOrderTraversalTest2() {
        MultiTree<String> multiTree = getStringMultiTree2();
        assertEquals(
                List.of("nodeZ: z", "nodeI: i", "nodeH: h",
                        "nodeN: n", "nodeM: m", "nodeV: v", "nodeR: r",
                        "nodeJ: j", "nodeY: y", "nodeA: a",
                        "nodeF: f", "nodeT: t", "nodeK: k", "nodeL: l",
                        "nodeS: s"),
                multiTree.postOrderTraversal());
    }


    private static MultiTree<String> getStringMultiTree() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeB = new MultiTree.TreeNode<>("b", "nodeB", null);
        MultiTree.TreeNode<String> nodeC = new MultiTree.TreeNode<>("c", "nodeC", null);
        MultiTree.TreeNode<String> nodeD = new MultiTree.TreeNode<>("d", "nodeD", null);
        MultiTree.TreeNode<String> nodeE = new MultiTree.TreeNode<>("e", "nodeE", null);
        MultiTree.TreeNode<String> nodeF = new MultiTree.TreeNode<>("f", "nodeF", null);
        MultiTree.TreeNode<String> nodeG = new MultiTree.TreeNode<>("g", "nodeG", null);
        MultiTree.TreeNode<String> nodeH = new MultiTree.TreeNode<>("h", "nodeH", null);
        MultiTree.TreeNode<String> nodeI = new MultiTree.TreeNode<>("i", "nodeI", null);
        MultiTree.TreeNode<String> nodeJ = new MultiTree.TreeNode<>("j", "nodeJ", null);
        MultiTree.TreeNode<String> nodeK = new MultiTree.TreeNode<>("k", "nodeK", null);
        MultiTree.TreeNode<String> nodeL = new MultiTree.TreeNode<>("l", "nodeL", null);
        MultiTree.TreeNode<String> nodeM = new MultiTree.TreeNode<>("m", "nodeM", null);
        MultiTree.TreeNode<String> nodeN = new MultiTree.TreeNode<>("n", "nodeN", null);
        MultiTree.TreeNode<String> nodeO = new MultiTree.TreeNode<>("o", "nodeO", null);
        nodeB.children = List.of(nodeD, nodeE);
        nodeC.children = List.of(nodeF, nodeG);
        nodeD.children = List.of(nodeH, nodeI);
        nodeE.children = List.of(nodeJ, nodeK);
        nodeF.children = List.of(nodeL, nodeM);
        nodeG.children = List.of(nodeN, nodeO);

        multiTree.root = new MultiTree.TreeNode<>("a", "nodeA", List.of(nodeB, nodeC));
        return multiTree;
    }

    private static MultiTree<String> getStringMultiTree2() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeZ = new MultiTree.TreeNode<>("z", "nodeZ", emptyList());
        MultiTree.TreeNode<String> nodeI = new MultiTree.TreeNode<>("i", "nodeI", emptyList());
        MultiTree.TreeNode<String> nodeN = new MultiTree.TreeNode<>("n", "nodeN", emptyList());
        MultiTree.TreeNode<String> nodeM = new MultiTree.TreeNode<>("m", "nodeM", emptyList());
        MultiTree.TreeNode<String> nodeV = new MultiTree.TreeNode<>("v", "nodeV", emptyList());
        MultiTree.TreeNode<String> nodeJ = new MultiTree.TreeNode<>("j", "nodeJ", emptyList());
        MultiTree.TreeNode<String> nodeF = new MultiTree.TreeNode<>("f", "nodeF", emptyList());
        MultiTree.TreeNode<String> nodeT = new MultiTree.TreeNode<>("t", "nodeT", emptyList());
        MultiTree.TreeNode<String> nodeH = new MultiTree.TreeNode<>("h", "nodeH", List.of(nodeZ, nodeI));
        MultiTree.TreeNode<String> nodeR = new MultiTree.TreeNode<>("r", "nodeR", List.of(nodeN, nodeM, nodeV));
        MultiTree.TreeNode<String> nodeY = new MultiTree.TreeNode<>("y", "nodeY", List.of(nodeJ));
        MultiTree.TreeNode<String> nodeA = new MultiTree.TreeNode<>("a", "nodeA", List.of(nodeH, nodeR, nodeY));
        MultiTree.TreeNode<String> nodeK = new MultiTree.TreeNode<>("k", "nodeK", List.of(nodeT));
        MultiTree.TreeNode<String> nodeL = new MultiTree.TreeNode<>("l", "nodeL", List.of(nodeF, nodeK));
        multiTree.root = new MultiTree.TreeNode<>("s", "nodeS", List.of(nodeA, nodeL));
        return multiTree;
    }

}
