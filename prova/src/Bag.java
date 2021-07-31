public class Bag {
    private int[] b;

    public Bag(int a[]) {
        b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[i];
    }

    public boolean insert(int v) {...}

    public boolean remove(int v) {...}

    public Bag symmetricDifference(Bag other) {
        //temporary variable only so I can create the symmetric bag
        int[] temp = new int[this.b.length + other.b.length];
        int index = 0;
        Bag symmetricBag = new Bag(temp);
        //I used the removes to check if the numbers in other bag were in this bag and vice versa.
        // I presumed it should work, in theory
        for (int i = 0; i < other.b.length; i++) {
            if (remove(other.b[i]) == false) {
                //if a value is present in other bag, but not in this, it adds it to symmetric
                symmetricBag.insert(other.b[i]);
                index++;
            } else {
                //if it's present, removes it and continues the loop
                continue;
            }
        }
        for (int i = 0; i < this.b.length; i++) {
            if (other.remove(this.b[i]) == false) {
                //if a value is present in this bag, but not in other, it adds it to symmetric
                symmetricBag.insert(this.b[i]);
                index++;
            } else {
                //if it's present, removes it and continues the loop
                continue;
            }
        }
        return symmetricBag;
    }
}
