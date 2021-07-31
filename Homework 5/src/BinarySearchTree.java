public class BinarySearchTree <K extends Comparable<K>, V> implements Dictionary<K, V> {
    private Node<K, V> root;
    private V isIt = null;

    public BinarySearchTree(K key, V value) {
        root = new Node<K, V>(key, value);
    }

    @Override
    public V add(K key, V value) {
        Node<K, V> X = new Node<>(key, value);
        addHelper(X, root);
        return isIt;
    }

    private void addHelper(Node<K, V> X, Node<K, V> C) {
        if (X.getKey().compareTo(C.getKey()) < 0) {
            if (C.left == null) {
                C.left = X;
            } else if (C.left.getKey().compareTo(X.getKey()) == 0) {
                isIt = (V) C.left.getValue();
                C.left = X;
            } else {
                addHelper(X, C.left);
            }
        } else if (X.getKey().compareTo(C.getKey()) > 0) {
            if (C.right == null) {
                C.right = X;
            } else if (C.right.getKey().compareTo(X.getKey()) == 0) {
                isIt = (V) C.right.getValue();
                C.right = X;
            } else {
                addHelper(X, C.right);
            }
        }
    }

        @Override
        public V lookup (K key){
            Node<K, V> predecessor = findPredecessor(key, root);
            if (predecessor == null) {
                return null;
            } else if (key.compareTo(predecessor.getKey()) < 0) {
                return (V) predecessor.left.getValue();
            } else{
            return (V) predecessor.right.getValue();
            }
        }

        @Override
        public void inOrderTraverse () {
                Node<K, V> current = root;
                traverseHelper(current);
        }

        private void traverseHelper(Node<K, V> X){
            if (X == null) {
                return;
            }
            traverseHelper(X.left);
            System.out.println(X.getKey() + " " + X.getValue());
            traverseHelper(X.right);
        }

        @Override
        public V remove (K key){
            Node<K, V> predecessor = findPredecessor(key, root);
            V value = null;
            if (predecessor == null) {
                return null;
            }
            if (key.compareTo(predecessor.getKey()) < 0) {
                if (predecessor.left.hasKid()) {
                    if (predecessor.left.left != null && predecessor.left.right == null) {
                        predecessor.left = predecessor.left.left;
                    } else if (predecessor.left.left == null && predecessor.left.right != null) {
                        predecessor.left = predecessor.left.right;
                    } else if (predecessor.left.left != null && predecessor.left.right != null) {
                        predecessor.left = removeHelper(predecessor.left.right);
                    }
                } else if (!predecessor.left.hasKid()) {
                    value = (V) predecessor.left.getValue();
                    predecessor.left = null;
                    return value;
                }
            } else if (key.compareTo(predecessor.getKey()) > 0) {
                if (predecessor.right.hasKid()) {
                    if (predecessor.right.left != null && predecessor.right.right == null) {
                        value = (V) predecessor.right.getValue();
                        predecessor.right = predecessor.right.left;
                        return value;
                    } else if (predecessor.right.left == null && predecessor.right.right != null) {
                        value = (V) predecessor.right.getValue();
                        predecessor.right = predecessor.right.right;
                        return value;
                    } else if (predecessor.right.left != null && predecessor.right.right != null) {
                        value = (V) predecessor.right.getValue();
                        predecessor.right = removeHelper(predecessor.right.right);
                        return value;
                    }
                } else if (!predecessor.right.hasKid()) {
                    value = (V)predecessor.right.getValue();
                    predecessor.right = null;
                    return value;
                }
            }
            return null;
        }

        private Node<K, V> removeHelper (Node < K, V > X){
            Node<K, V> N = null;
            if (X.left != null) {
                N = removeHelper(X.left);
            } else if (X.left == null) {
                return X;
            }
            return N;
        }

        private Node<K, V> findPredecessor (K key, Node < K, V > C){
            Node<K, V> Predecessor = null;
            if (key.compareTo(C.getKey()) < 0) {
                if (C.left == null) {
                    return null;
                } else if (C.left.getKey() == key) {
                    return C;
                } else {
                    Predecessor = findPredecessor(key, C.left);
                }
            } else if (key.compareTo(C.getKey()) > 0) {
                if (C.right == null) {
                    return null;
                } else if (C.right.getKey() == key) {
                    return C;
                } else {
                    Predecessor = findPredecessor(key, C.right);
                }
            }
            return Predecessor;
        }
    }
