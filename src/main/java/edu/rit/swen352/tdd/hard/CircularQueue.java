package edu.rit.swen352.tdd.hard;

import java.util.NoSuchElementException;

/**
 * A fixed-sized, generic, FIFO Queue that uses modulo indexes to “circle around” around
 * the end of the array.  All elements must be non-{@code null}.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with a fixed capacity ({@code int})</li>
 *       <li>without the capacity (defaults to 16)</li>
 *     </ul>
 *  </li>
 *   <li>add:
 *     <ul>
 *       <li>inserts an element at the end of the queue if it is not full</li>
 *       <li>throws {@link IllegalStateException} if the queue is full</li>
 *     </ul>
 *   </li>
 *   <li>remove:
 *     <ul>
 *       <li>removes an element from the front of the queue if it is not empty</li>
 *       <li>throws {@link NoSuchElementException} if the queue is empty</li>
 *     </ul>
 *   </li>
 *   <li>element:
 *     <ul>
 *       <li>retrieves, but does not remove, an element from the front of the queue if it is not empty</li>
 *       <li>throws {@link NoSuchElementException} if the queue is empty</li>
 *     </ul>
 *   </li>
 *   <li>NFR: you must ensure that the size of the internal array never changes</li>
 * </ul>
 *
 * @param <T> the type of elements in the queue.
 */
public class CircularQueue<T> {
}
