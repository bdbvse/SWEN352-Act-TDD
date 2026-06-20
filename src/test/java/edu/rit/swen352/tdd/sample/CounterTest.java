package edu.rit.swen352.tdd.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link Counter} component.
 */
class CounterTest {

  @Test
  @DisplayName("ctor with both bounds")
  void ctor_1() {
    final Counter CuT = new Counter(1, 10);
    assertNotNull(CuT);
  }

  @Test
  @DisplayName("ctor with only lower bound")
  void ctor_2() {
    final Counter CuT = new Counter(1);
    assertNotNull(CuT);
  }
}
