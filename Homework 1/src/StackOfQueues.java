// ==============================================================================
// IMPORTS

import java.util.NoSuchElementException;
// ==============================================================================


// ==============================================================================

/**
 * A stack implemented using queues.
 *
 * @author Scott Kaplan -- sfkaplan@amherst.edu
 * @date Feb 2021
 */
public class StackOfQueues<E> implements AmhStack<E> {
// ==============================================================================


    // ==========================================================================
    /**
     * The queue in which the stack's elements will be stored.
     */
    private AmhQueue<E> _queue;
    private AmhQueue<E> container1 = new WrapperQueue<E>();
    private AmhQueue<E> container2 = new WrapperQueue<E>();
    // ==========================================================================


    // ==========================================================================

    /**
     * Constructor.  Create an empty stack.
     */
    public StackOfQueues() {

        // Specifically use a WrapperQueue, which is a type of AmhQueue, to
        // store the elements.
        _queue = new WrapperQueue<E>();

    } // StackOfQueues ()
    // ==========================================================================


    // ==========================================================================

    /**
     * Add an element to the top of the stack.
     *
     * @param element The element to add to the stack.
     * @throws IllegalStateException if the stack cannot be expanded
     *                               to accomodate the additional element.
     */
    public void push(E element) throws IllegalStateException {
        _queue.add(element);
        //Just used add because, from the description, it already does the same thing that push is required to do
    } // push ()
    // ==========================================================================


    // ==========================================================================

    /**
     * Remove an element from the top of the stack.
     *
     * @return the element taken from the top of the stack.
     * @throws NoSuchElementException if the stack is empty.
     */
    public E pop() throws NoSuchElementException {

        while (_queue.size() > 1) {
            container1.add(_queue.remove());
        }
        if (_queue.size() == 1) {
            container2.add(_queue.remove());
            while (container1.size() != 0) {
                _queue.add(container1.remove());
            }
            return container2.remove();
        }
        throw new NoSuchElementException();

    } // pop ()
    // ==========================================================================


    // ==========================================================================

    /**
     * Obtain the top element on the stack without removing it.
     *
     * @return the element at the top of the stack.
     * @throws NoSuchElementException if the stack is empty.
     */
    public E top() throws NoSuchElementException {
        while (_queue.size() > 1) {
            container1.add(_queue.remove());
        }
        if (_queue.size() == 1) {
            container2.add(_queue.remove());
            E temp = container2.peek();
            while (container1.size() != 0) {
                _queue.add(container1.remove());
            }
            _queue.add(container2.remove());
            return temp;
        }
        throw new NoSuchElementException();

    } // top ()
    // ==========================================================================


    // ==========================================================================

    /**
     * Provide the number of elements on the stack.
     *
     * @return the length of the stack.
     */
    public int size() {
        return _queue.size();
    } // size ()
    // ==========================================================================


// ==============================================================================
} // class StackOfQueues
// ==============================================================================
