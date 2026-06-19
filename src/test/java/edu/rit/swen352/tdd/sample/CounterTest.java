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
      Counter counter = new Counter(1, 10);
      assertNotNull(counter);
    }

    @Test
    @DisplayName("default upper bound")
    void ctor_2() {
      Counter counter = new Counter(1);
      assertNotNull(counter);
    }

    @Test
    @DisplayName("default both bounds")
    void ctor_3() {
      Counter counter = new Counter();
      assertNotNull(counter);
    }
  }
}
