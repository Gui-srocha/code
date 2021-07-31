import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListJunitTests {

    Node<String> l = new Node<String>();
    Node<String> l2 = new Node<String>();
    Node<String> l3 = new Node<String>();
    Node<String> l4 = new Node<String>();

    Node<String> empty = new Node<String>();


    @Before
    // Runs before EACH test
    public void setup() {


        l.add("One");
        l.add("Two");
        l.add("One");

        l2.add("One");
        l2.add("Two");
        l2.add("Three");
        l2.add("One");

        l3.add("One");
        l3.add("Two");
        l3.add("Three");
        l3.add("Four");
        l3.add("Thirteen");

        l4.add("Two");
        l4.add("Three");
        l4.add("Four");
        l4.add("Thirteen");


    }


    // One test of length

    @Test
    public void testLength() {
        assertEquals("Test of method length", l.length(), 3);
    }


    // Tests of Odd


    @Test
    public void testOdd1() {
        assertEquals("Test of method odd", l.odd(), true);
    }

    @Test
    public void testOdd2() {
        assertEquals("Test of method odd", l2.odd(), false);
    }

    @Test
    public void testOdd3() {
        assertEquals("Test of method odd", empty.odd(), false);
    }


    @Test
    public void testIth1() {
        assertEquals("Test of ith", l2.ith(3), l2.getNext().getNext().getNext());
    }

    @Test
    public void testIth2() {
        assertEquals("Test of ith", l2.ith(5), null);
    }

    @Test
    public void testIth3() {
        assertEquals("Test of ith", l2.ith(1), l2.getNext());
    }

    @Test
    public void testDel() {
        empty = l4;
        empty.print();
        l3.deleteIth(1);
        l3.print();
        assertEquals("Test of Delete", empty.sameList(l3), false);
    }

    @Test
    public void testDel1() {
        assertEquals("Test of Delete", l2.deleteIth(2), l2.getNext());
    }


    @Test
    public void testAddFile() {
        Node<String> lnew = new Node<String>();
        FileExample.addFile("TestData.dat", lnew);
        assertEquals("testing addList", true, lnew.sameList(l3));

    }

}
