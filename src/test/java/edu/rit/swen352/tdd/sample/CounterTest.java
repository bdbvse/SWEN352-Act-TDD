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
    assertAll("group assertions"
      , () -> assertNotNull(CuT)
      , () -> assertEquals(1, CuT.getLower(), "Lower bound is correct")
      , () -> assertEquals(10, CuT.getUpper(), "Upper bound is correct")
    );
  }

  @Test
  @DisplayName("ctor with only lower bound")
  void ctor_2() {
    final Counter CuT = new Counter(1);
    assertAll("group assertions"
      , () -> assertNotNull(CuT)
      , () -> assertEquals(1, CuT.getLower(), "Lower bound is correct")
      , () -> assertEquals(Integer.MAX_VALUE, CuT.getUpper(), "Upper bound is correct")
    );
  }

  @Test
  @DisplayName("ctor with no bounds supplied")
  void ctor_3() {
    final Counter CuT = new Counter();
    assertAll("group assertions"
      , () -> assertNotNull(CuT)
      , () -> assertEquals(0, CuT.getLower(), "Lower bound is correct")
      , () -> assertEquals(Integer.MAX_VALUE, CuT.getUpper(), "Upper bound is correct")
    );
  }
}
