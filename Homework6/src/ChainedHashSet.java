import java.lang.reflect.Array;
import java.util.LinkedList;

public class ChainedHashSet<E> implements AmhHashSet<E> {

    private LinkedList<E>[] storage;
    private int             m;
    private int             n;
    private int             collisions;
    private int             index;

    public ChainedHashSet (int capacity) {
        this.m = capacity;
        storage = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++){
            storage[i] = new LinkedList<E>();
        }
    } // ChainedHashSet ()

    public boolean insert (E key) {
        int random = (int)Math.random()*(m-1);
        if (lookup(key)){
            return false;
        }else {
            storage[random].add(key);
            n++;
            return true;
        }
    } // insert ()

    public boolean lookup (E key) {
        for (int i = 0; i < m; i++) {
            if (storage[i].contains(key)) {
                index = i;
                if (!storage[i].isEmpty()){
                    collisions++;
                }
                return true;
            }
        }
        return false;
    }
    // lookup ()

    public boolean remove (E key) {
        if (lookup(key)){
            storage[index].remove(key);
            return true;
        }
        else{
            return false;
        }
    }

    public int size () {
	return n;
    }

    public int getNumberCollisions () {

	return collisions;

    }

    private int hash (E key) {

	return key.hashCode();
	
    }

} // class ChainedHashSet
