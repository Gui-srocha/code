public class UnionFind{

    private int numSets = 0;

    public void makeSet(Cell x){
        LLAddOnly list = new LLAddOnly();
        list.add(x);
        numSets++;
    }

    public LLAddOnly find(Cell x){
        return x.head;
    }

    public void union(Cell c1, Cell c2) {
        Cell temp = find(c2).first;
        while (temp != null) {
            Cell next = temp.next;
            c1.head.add(temp);
            temp = next;
        }
        numSets--;
    }

    public int numSets() {
        return numSets;
    }
}
