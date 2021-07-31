public class Node<K extends Comparable<K>,V>{
    public Node left;
    public Node right;
    private V value;
    private K key;
    public Node (K key, V value){
        this.value = value;
        this.key = key;
        left = null;
        right = null;
    }

    public V getValue(){
        return value;
    }

    public K getKey(){
        return this.key;
    }


    public boolean hasKid(){
        if (left != null || right != null){
            return true;
        }
        else {
            return false;
        }
    }
}
