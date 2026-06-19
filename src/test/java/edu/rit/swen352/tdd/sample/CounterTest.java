package edu.rit.swen352.tdd.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link Counter} component.
 */
class CounterTest {

  @Nested
  @DisplayName("Constructor Tests")
  class ConstructorTests {
    @Test
    @DisplayName("all-arg ctor")
    void ctor_1() {
      // Arrange
      final int lower = 1;
      final int upper = 10;

      // Act
      Counter counter = new Counter(lower, upper);

      // Assert
      assertAll("group assertions"
        , () -> assertNotNull(counter)
        , () -> assertEquals(lower, counter.getLower(), "lower bound is incorrect")
        , () -> assertEquals(upper, counter.getUpper(), "upper bound is incorrect")
      );
    }

    @Test
    @DisplayName("default upper bound")
    void ctor_2() {
      // Arrange
      final int lower = 1;

      // Act
      Counter counter = new Counter(lower);

      // Assert
      assertAll("group assertions"
        , () -> assertNotNull(counter)
        , () -> assertEquals(lower, counter.getLower(), "lower bound is incorrect")
        , () -> assertEquals(Integer.MAX_VALUE, counter.getUpper(), "upper bound is incorrect")
      );
    }

    @Test
    @DisplayName("default both bounds")
    void ctor_3() {
      // Act
      Counter counter = new Counter();

      // Assert
      assertAll("group assertions"
        , () -> assertNotNull(counter)
        , () -> assertEquals(0, counter.getLower(), "lower bound is incorrect")
        , () -> assertEquals(Integer.MAX_VALUE, counter.getUpper(), "upper bound is incorrect")
      );
    }
  }
}
