package domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

class MultiTreeTest {

    @Test
    void preOrderTraversalTestL1() {
        MultiTree<String> multiTree = getMultiTreeL1();
        assertEquals(List.of("nodeA: a", "nodeB: b", "nodeC: c"), multiTree.preOrderTraversal());
    }


    @Test
    void preOrderTraversalTestL2() {
        MultiTree<String> multiTree = getMultiTreeL2();
        assertEquals(
                List.of("nodeA: a", "nodeB: b", "nodeD: d", "nodeE: e", "nodeC: c", "nodeF: f", "nodeG: g"),
                multiTree.preOrderTraversal());
    }

    @Test
    void preOrderTraversalTestL3() {
        MultiTree<String> multiTree = getMultiTreeL3();
        assertEquals(
                List.of("nodeA: a", "nodeB: b", "nodeD: d", "nodeH: h", "nodeI: i",
                        "nodeE: e", "nodeJ: j", "nodeK: k",
                        "nodeC: c", "nodeF: f", "nodeL: l", "nodeM: m",
                        "nodeG: g", "nodeN: n", "nodeO: o"),
                multiTree.preOrderTraversal());
    }

    @Test
    void postOrderTraversalTest() {
        MultiTree<String> multiTree = getMultiTreeL3();
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
        MultiTree<String> multiTree = getMultiTreeL4();
        assertEquals(
                List.of("nodeS: s", "nodeA: a", "nodeH: h", "nodeZ: z",
                        "nodeI: i", "nodeR: r", "nodeN: n", "nodeM: m", "nodeV: v",
                        "nodeY: y", "nodeJ: j",
                        "nodeL: l", "nodeF: f", "nodeK: k", "nodeT: t"),
                multiTree.preOrderTraversal());
    }

    @Test
    void preOrderTraversalStackTest() {
        MultiTree<String> multiTree = getMultiTreeL4();
        assertEquals(
                List.of("nodeS: s", "nodeA: a", "nodeH: h", "nodeZ: z",
                        "nodeI: i", "nodeR: r", "nodeN: n", "nodeM: m", "nodeV: v",
                        "nodeY: y", "nodeJ: j",
                        "nodeL: l", "nodeF: f", "nodeK: k", "nodeT: t"),
                multiTree.preOrderTraversalStack());
    }

    @Test
    void preOrderTraversalStackTestL1() {
        MultiTree<String> multiTree = getMultiTreeL1();
        assertEquals(List.of("nodeA: a", "nodeB: b", "nodeC: c"), multiTree.preOrderTraversalStack());
    }

    @Test
    void preOrderTraversalStackTestL3() {
        MultiTree<String> multiTree = getMultiTreeL2();
        assertEquals(
                List.of("nodeA: a", "nodeB: b", "nodeD: d", "nodeE: e", "nodeC: c", "nodeF: f", "nodeG: g"),
                multiTree.preOrderTraversalStack());
    }

    @Test
    void postOrderTraversalTest2() {
        MultiTree<String> multiTree = getMultiTreeL4();
        assertEquals(
                List.of("nodeZ: z", "nodeI: i", "nodeH: h",
                        "nodeN: n", "nodeM: m", "nodeV: v", "nodeR: r",
                        "nodeJ: j", "nodeY: y", "nodeA: a",
                        "nodeF: f", "nodeT: t", "nodeK: k", "nodeL: l",
                        "nodeS: s"),
                multiTree.postOrderTraversal());
    }

    @Test
    void depthFirstSearchTestL1() {
        MultiTree<String> multiTree = getMultiTreeL1();
        Predicate<String> containsA = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        };
        assertEquals("nodeA: a", multiTree.depthFirstSearch(containsA));
        Predicate<String> containsB = s -> s.contains("b");
        assertEquals("nodeB: b", multiTree.depthFirstSearch(containsB));
    }

    @Test
    void depthFirstSearchTestL2() {
        MultiTree<String> multiTree = getMultiTreeL2();
        Predicate<String> containsA =s -> s.contains("a");
        Predicate<String> containsB = s -> s.contains("b");
        Predicate<String> containsD = s -> s.contains("d");
        Predicate<String> containsC = s -> s.contains("c");
        assertEquals("nodeA: a", multiTree.depthFirstSearch(containsA));
        assertEquals("nodeB: b", multiTree.depthFirstSearch(containsB));
        assertEquals("nodeC: c", multiTree.depthFirstSearch(containsC));
        assertEquals("nodeD: d", multiTree.depthFirstSearch(containsD));
    }

    @Test
    void depthFirstSearchTestL5() {
        MultiTree<String> multiTree = getMultiTreeL5();
        assertEquals("node4: 4", multiTree.depthFirstSearch(s4 -> s4.equals("4")));
        assertEquals("node30: 30", multiTree.depthFirstSearch(s3 -> s3.equals("30")));
        assertEquals("node8: 8", multiTree.depthFirstSearch(s2 -> s2.equals("8")));
        assertEquals("node11V2: 11", multiTree.depthFirstSearch(s -> s.equals("11")));
        assertEquals("node3: 3", multiTree.depthFirstSearch(s1 -> s1.equals("3")));
        assertNull(multiTree.depthFirstSearch(s -> s.equals("7")));
    }


    private static MultiTree<String> getMultiTreeL1() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeB = new MultiTree.TreeNode<>("b", "nodeB", emptyList());
        MultiTree.TreeNode<String> nodeC = new MultiTree.TreeNode<>("c", "nodeC", emptyList());
        multiTree.root = new MultiTree.TreeNode<String>("a", "nodeA", List.of(nodeB, nodeC));
        return multiTree;
    }

    private static MultiTree<String> getMultiTreeL2() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeB = new MultiTree.TreeNode<>("b", "nodeB", emptyList());
        MultiTree.TreeNode<String> nodeC = new MultiTree.TreeNode<>("c", "nodeC", emptyList());
        MultiTree.TreeNode<String> nodeD = new MultiTree.TreeNode<>("d", "nodeD", emptyList());
        MultiTree.TreeNode<String> nodeE = new MultiTree.TreeNode<>("e", "nodeE", emptyList());
        MultiTree.TreeNode<String> nodeF = new MultiTree.TreeNode<>("f", "nodeF", emptyList());
        MultiTree.TreeNode<String> nodeG = new MultiTree.TreeNode<>("g", "nodeG", emptyList());
        nodeB.children = List.of(nodeD, nodeE);
        nodeC.children = List.of(nodeF, nodeG);
        multiTree.root = new MultiTree.TreeNode<String>("a", "nodeA", List.of(nodeB, nodeC));
        return multiTree;
    }

    private static MultiTree<String> getMultiTreeL3() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> nodeB = new MultiTree.TreeNode<>("b", "nodeB", emptyList());
        MultiTree.TreeNode<String> nodeC = new MultiTree.TreeNode<>("c", "nodeC", emptyList());
        MultiTree.TreeNode<String> nodeD = new MultiTree.TreeNode<>("d", "nodeD", emptyList());
        MultiTree.TreeNode<String> nodeE = new MultiTree.TreeNode<>("e", "nodeE", emptyList());
        MultiTree.TreeNode<String> nodeF = new MultiTree.TreeNode<>("f", "nodeF", emptyList());
        MultiTree.TreeNode<String> nodeG = new MultiTree.TreeNode<>("g", "nodeG", emptyList());
        MultiTree.TreeNode<String> nodeH = new MultiTree.TreeNode<>("h", "nodeH", emptyList());
        MultiTree.TreeNode<String> nodeI = new MultiTree.TreeNode<>("i", "nodeI", emptyList());
        MultiTree.TreeNode<String> nodeJ = new MultiTree.TreeNode<>("j", "nodeJ", emptyList());
        MultiTree.TreeNode<String> nodeK = new MultiTree.TreeNode<>("k", "nodeK", emptyList());
        MultiTree.TreeNode<String> nodeL = new MultiTree.TreeNode<>("l", "nodeL", emptyList());
        MultiTree.TreeNode<String> nodeM = new MultiTree.TreeNode<>("m", "nodeM", emptyList());
        MultiTree.TreeNode<String> nodeN = new MultiTree.TreeNode<>("n", "nodeN", emptyList());
        MultiTree.TreeNode<String> nodeO = new MultiTree.TreeNode<>("o", "nodeO", emptyList());
        nodeB.children = List.of(nodeD, nodeE);
        nodeC.children = List.of(nodeF, nodeG);
        nodeD.children = List.of(nodeH, nodeI);
        nodeE.children = List.of(nodeJ, nodeK);
        nodeF.children = List.of(nodeL, nodeM);
        nodeG.children = List.of(nodeN, nodeO);

        multiTree.root = new MultiTree.TreeNode<>("a", "nodeA", List.of(nodeB, nodeC));
        return multiTree;
    }

    private static MultiTree<String> getMultiTreeL4() {
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

    private static MultiTree<String> getMultiTreeL5() {
        MultiTree<String> multiTree = new MultiTree<>();
        MultiTree.TreeNode<String> node8 = new MultiTree.TreeNode<>("8", "node8", emptyList());
        MultiTree.TreeNode<String> node3 = new MultiTree.TreeNode<>("3", "node3", emptyList());
        MultiTree.TreeNode<String> node10 = new MultiTree.TreeNode<>("10", "node10", emptyList());
        MultiTree.TreeNode<String> node11 = new MultiTree.TreeNode<>("11", "node11", emptyList());
        MultiTree.TreeNode<String> node12 = new MultiTree.TreeNode<>("12", "node12", emptyList());
        MultiTree.TreeNode<String> node13 = new MultiTree.TreeNode<>("13", "node13", emptyList());
        MultiTree.TreeNode<String> node30 = new MultiTree.TreeNode<>("30", "node30", List.of(node8, node3, node10));
        MultiTree.TreeNode<String> node8V2 = new MultiTree.TreeNode<>("8", "node8V2", emptyList());
        MultiTree.TreeNode<String> node3V2 = new MultiTree.TreeNode<>("3", "node3V2", emptyList());
        MultiTree.TreeNode<String> node11V2 = new MultiTree.TreeNode<>("11", "node11V2", List.of(node11, node12, node13));
        multiTree.root = new MultiTree.TreeNode<>("4", "node4", List.of(node30, node8V2, node3V2, node11V2));
        return multiTree;
    }

}
