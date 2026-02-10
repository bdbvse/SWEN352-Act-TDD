package edu.rit.swen352.tdd.hard;

/**
 * A Value Object that holds a complex measurement value.
 *
 * <p>
 *   This component must support complex units, such as miles, kilometers, miles/hour, m/sec2,
 *   kg-m/sec2 and so on.  The component must support units of length, time, and mass;
 *   in a variety of combinations.
 * </p>
 *
 * <p>
 *   The component must support conversions (ft to meters or mi/hr to km/sec),
 *   and basic arithmetic operations: addition, subtraction, multiplication, and division.
 * </p>
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: value (`double`) and units</li>
 *   <li>getValue: return the value of the measurement</li>
 *   <li>getUnits: return the units of the measurement</li>
 *   <li>conversion: convert the measurement to a new set of compatible units</li>
 *   <li>addition: add two measurements
 *     <ul>
 *       <li>throw an exception if the units do not match</li>
 *       <li>handle conversion of the argument to the `this` units</li>
 *     </ul>
 *   </li>
 *   <li>substraction: subtract two measurements
 *     <ul>
 *       <li>throw an exception if the units do not match</li>
 *       <li>handle conversion of the argument to the `this` units</li>
 *     </ul>
 *   </li>
 *   <li>multiplication: multiple a measurement by X
 *     <ul>
 *       <li>case: X is a scalar (`double`)</li>
 *       <li>case: X is another measurement with same or different units</li>
 *     </ul>
 *   </li>
 *   <li>division: divide a measurement by X
 *     <ul>
 *       <li>case: X is a scalar (`double`)</li>
 *       <li>case: X is another measurement with same units: results in a scalar (a Measurement with no units)</li>
 *       <li>case: X is another measurement with different units</li>
 *     </ul>
 *   </li>
 * </ul>
 *
 */
public class Measurement {
}
