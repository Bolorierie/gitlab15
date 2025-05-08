package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

  @Test
  void testMultiplyPositive() {
    Multiplication calc = new Multiplication();
    assertEquals(20.0, calc.multiply(4.0, 5.0));
  }

  @Test
  void testMultiplyByZero() {
    Multiplication calc = new Multiplication();
    assertEquals(0.0, calc.multiply(0.0, 99.0));
  }
}
