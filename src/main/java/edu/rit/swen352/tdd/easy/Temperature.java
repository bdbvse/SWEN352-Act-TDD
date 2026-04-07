package edu.rit.swen352.tdd.easy;

/**
 * A temperature measurement.
 *
 * <p>
 * This must be an immutable
 * <a href='https://en.wikipedia.org/wiki/Value_object'>Value Object</a>.
 * </p>
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>a ctor with both a value as {@code double} and a {@linkplain TemperatureUnit unit}</li>
 *       <li>another ctor with just a value; unit is defaulted to {@link TemperatureUnit#CELSIUS}</li>
 *     </ul>
 *   </li>
 *   <li>getValue(): returns the temperature value in the current units</li>
 *   <li>getUnit(): return the current temperature units</li>
 *   <li>convertTo(unit): create a new Temperature in the new unit</li>
 *   <li>toString(): returns a human-friendly representation of the temperature, eg 25°C or 25K</li>
 * </ul>
 */
public class Temperature {
  public enum TemperatureUnit {
    CELSIUS, FAHRENHEIT, KELVIN
  }
}
