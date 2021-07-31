public class Lab9Tree {

    /**
     * A class for a tree with two subtree - the mother and father
     * subtree (think of a family tree growing up from one person
     */

    private String name;
    private Lab9Tree father;
    private Lab9Tree mother;
    private int mom = 0;
    private int dad = 0;


    /**
     * A constructor to create a tree with empty parents and a given
     * name
     */

    public Lab9Tree(String n) {

        mother = null;
        father = null;
        name = n;
    }


    /**
     * A method to add a tree (argument t) as the father subtree -
     * whatever was there is destroyed
     */

    Lab9Tree addFather(String dad) {

        father = new Lab9Tree(dad);
        return father;

    }

    /**
     * A method to add a tree (argument t) as the mother subtree -
     * whatever was there is destroyed
     */

    Lab9Tree addMother(String mom) {

        mother = new Lab9Tree(mom);
        return mother;

    }

    String getName() {
        return name;
    }

    Lab9Tree getMother() {
        return mother;
    }

    Lab9Tree getFather() {

        return father;
    }

    public void print() {
        System.out.println(name);
        if (mother != null) {
            getMother().print();
        }
        if (father != null) {
            getFather().print();
        }
    }
}



