public class Test {
    public static void main(String[] args){
        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>(8, 2);
        bst.add(4, 0);
        bst.add(2,0);
        bst.add(10,0);
        bst.add(30, 0);
        bst.add(30, 7);
        bst.add(7, 0);
        bst.add(22, 0);
        System.out.println(bst.lookup(10));
        bst.remove(10);
        bst.inOrderTraverse();
        System.out.println(bst.remove(75));
    }
}
