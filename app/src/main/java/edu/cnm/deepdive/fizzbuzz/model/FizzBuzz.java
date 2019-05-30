package edu.cnm.deepdive.fizzbuzz.model;

/**
 * Includes several public methods and constants for computing fizz buzz values
 * <p>This class includes <code>static</code> methods that take <code>int</code> parameters and
 * return <code>boolean</code> and {@link String}results indicating whether the specified values are divisible by 3(Fizz)
 * or 5 (buzz)</p>
 *
 * @author John Bailey &amp; Deep DIve COding Java/Android Cohrot 7.
 * @version 1.0.0
 */
public class FizzBuzz {


  /** {@link String}String value indicating a number divisible by 3. */
  public static final String FIZZ = "Fizz";
  /** {@link String} value divisible by 5 */
  public static final String BUZZ = "Buzz";

  /**
   * Computes and returns Fizz Buzz or a {@link String} Representation of <code>value</code> depending on
   * whether <code>value</code> is divisible by 3 or 5
   *
   * @param value integer value to be tested for divisibility by 3 and 5.
   * @return "FiZZ" "Buzz" or value of a String
   */
  public static String fizzBuzzValue(int value) {
    if (value <= 0) {
      throw new IllegalArgumentException();
    }
    String result ="";
    if (isFizz(value)){
      result += FIZZ;
    }
    if (isBuzz(value)) {
      result += BUZZ;
    }
    if (result.isEmpty()) {
      result += value;
    }
    return result;

  }

  /**
   * Indicates divisibilty of <code>value</code> by 3 by returning  a <code>boolean</code> result
   * @param value Integer value to be tested
   * @return <code>boolean</code> result
   */
  public static boolean isFizz(int value) {
    return value % 3 == 0;
  }
  /**
   * Indicates divisibilty of <code>value</code> by 5 by returning  a <code>boolean</code> result
   * @param value Integer value to be tested
   * @return <code>boolean</code> result
   */
  public static boolean isBuzz(int value) {
    return value % 5 == 0;
  }

}
