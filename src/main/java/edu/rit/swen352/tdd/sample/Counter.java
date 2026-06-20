package edu.rit.swen352.tdd.sample;

/**
 * An integral counter with an optional lower and upper bound.
 * The count must start at the lower limit and must not exceed the upper limit.
 * The count must never drop below the lower limit.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>a ctor that supplies both lower and upper bounds</li>
 *       <li>another ctor that supplies a lower bound; upper is defaulted to {@code Integer.MAX_VALUE}</li>
 *       <li>a third ctor (no-args) that <em>also</em> defaults the lower limit to 0</li>
 *       <li>NOTE: once set in a ctor, the bound's attributes must be fixed</li>
 *     </ul>
 *   </li>
 *   <li>{@code getLower()}: access lower limit</li>
 *   <li>{@code getUpper()}: access upper limit</li>
 *   <li>{@code getCount()}: access the current state of the counter</li>
 *   <li>{@code increment()}: increase the count by one; throw {@link IllegalStateException} if count is already at the upper limit</li>
 *   <li>{@code decrement()}: decrease the count by one; throw {@link IllegalStateException} if count is already at the lower limit</li>
 * </ul>
 */
public class Counter {
  private final int lower;
  private final int upper;

  public Counter(int lower, int upper) {
    this.lower = lower;
    this.upper = upper;
  }
  public Counter(int lower) {
    this(lower, Integer.MAX_VALUE);
  }
  public Counter() {
    this(0);
  }

  public int getLower() {
    return lower;
  }
  public int getUpper() {
    return upper;
  }
}
