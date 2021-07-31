// ==============================================================================
// IMPORTS

import java.util.NoSuchElementException;
// ==============================================================================


// ==============================================================================

/**
 * A queue implemented using stacks.
 *
 * @author Scott Kaplan -- sfkaplan@amherst.edu
 * @date Feb 2021
 */
public class QueueOfStacks<E> implements AmhQueue<E> {
// ==============================================================================


    // ==========================================================================
    /**
     * The stack in which the queue's elements will be stored.
     */
    private AmhStack<E> _stack;
    private AmhStack<E> container1 = new WrapperStack<E>();
    private AmhStack<E> container2 = new WrapperStack<E>();
    // ==========================================================================


    // ==========================================================================

    /**
     * Constructor.  Create an empty queue.
     */
    public QueueOfStacks() {

        // Specifically use a WrapperStack, which is a type of AmhStack, to
        // store the elements.
        _stack = new WrapperStack<E>();

    } // StackOfQueues ()
    // ==========================================================================


    // ==========================================================================

    /**
     * Add an element to the tail of the queue.
     *
     * @param element The element to add to the queue.
     * @throws IllegalStateException if the queue cannot be expanded
     *                               to accomodate the additional element.
     */
    public void add(E element) throws IllegalStateException {
        _stack.push(element);
        //Just used push because, from the description, it already does the same thing that add is required to do
    } // add ()
    // ==========================================================================


    // ==========================================================================

    /**
     * Remove an element from the head of the queue.
     *
     * @return the element taken from the head of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    public E remove() throws NoSuchElementException {
        while (_stack.size() > 1) {
            container1.push(_stack.pop());
        }
        if (_stack.size() == 1) {
            container2.push(_stack.pop());
            while (container1.size() != 0) {
                _stack.push(container1.pop());
            }
            return container2.pop();
        }
        throw new NoSuchElementException();

    } // remove ()
    // ==========================================================================


    // ==========================================================================
    public E peek() throws NoSuchElementException {
        while (_stack.size() > 1) {
            container1.push(_stack.pop());
        }
        if (_stack.size() == 1) {
            container2.push(_stack.pop());
            E temp = container2.top();
            _stack.push(container2.pop());
            while (container1.size() != 0) {
                _stack.push(container1.pop());
            }
            return temp;
        }
        throw new NoSuchElementException();

    } // peek ()
    // ==========================================================================


    // ==========================================================================
    public int size() {
        return _stack.size();

    } // size ()
    // ==========================================================================


// ==============================================================================
} // class QueueOfStacks
// ==============================================================================
