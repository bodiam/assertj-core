/*
 * Created on Nov 3, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.internal;

import org.fest.assertions.core.AssertionInfo;
import org.fest.assertions.data.Index;
import org.fest.util.VisibleForTesting;

/**
 * Reusable assertions for collections.
 *
 * @author Alex Ruiz
 */
public class ObjectArrays {

  private static final ObjectArrays INSTANCE = new ObjectArrays();

  /**
   * Returns the singleton instance of this class.
   * @return the singleton instance of this class.
   */
  public static ObjectArrays instance() {
    return INSTANCE;
  }

  private final Arrays arrays = Arrays.instance();
  private final Failures failures;

  private ObjectArrays() {
    this(Failures.instance());
  }

  @VisibleForTesting ObjectArrays(Failures failures) {
    this.failures = failures;
  }

  /**
   * Asserts that the given array is {@code null} or empty.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @throws AssertionError if the given array is not {@code null} *and* contains one or more elements.
   */
  public void assertNullOrEmpty(AssertionInfo info, Object[] actual) {
    arrays.assertNullOrEmpty(info, failures, actual);
  }

  /**
   * Asserts that the given array is empty.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the given array is not empty.
   */
  public void assertEmpty(AssertionInfo info, Object[] actual) {
    arrays.assertEmpty(info, failures, actual);
  }

  /**
   * Asserts that the given array is not empty.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the given array is empty.
   */
  public void assertNotEmpty(AssertionInfo info, Object[] actual) {
    arrays.assertNotEmpty(info, failures, actual);
  }

  /**
   * Asserts that the number of elements in the given array is equal to the expected one.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @param expectedSize the expected size of the {@code actual}.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the number of elements in the given array is different than the expected one.
   */
  public void assertHasSize(AssertionInfo info, Object[] actual, int expectedSize) {
    arrays.assertHasSize(info, failures, actual, expectedSize);
  }

  /**
   * Asserts that the given array contains the given values, in any order.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @param values the values that are expected to be in the given array.
   * @throws NullPointerException if the array of values is {@code null}.
   * @throws IllegalArgumentException if the array of values is empty.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the given array does not contain the given values.
   */
  public void assertContains(AssertionInfo info, Object[] actual, Object[] values) {
    arrays.assertContains(info, failures, actual, values);
  }

  /**
   * Verifies that the given array contains the given object at the given index.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @param value the object to look for.
   * @param index the index where the object should be stored in the given array.
   * @throws AssertionError if the given array is {@code null} or empty.
   * @throws NullPointerException if the given {@code Index} is {@code null}.
   * @throws IndexOutOfBoundsException if the value of the given {@code Index} is equal to or greater than the size of
   * the given array.
   * @throws AssertionError if the given array does not contain the given object at the given index.
   */
  public void assertContains(AssertionInfo info, Object[] actual, Object value, Index index) {
    arrays.assertContains(info, failures, actual, value, index);
  }

  /**
   * Asserts that the given array contains only the given values and nothing else, in any order.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @param values the values that are expected to be in the given array.
   * @throws NullPointerException if the array of values is {@code null}.
   * @throws IllegalArgumentException if the array of values is empty.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the given array does not contain the given values or if the given
   * array contains values that are not in the given array.
   */
  public void assertContainsOnly(AssertionInfo info, Object[] actual, Object[] values) {
    arrays.assertContainsOnly(info, failures, actual, values);
  }

  /**
   * Verifies that the given array contains the given sequence of objects, without any other objects between them.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @param sequence the sequence of objects to look for.
   * @throws AssertionError if the given array is {@code null}.
   * @throws NullPointerException if the given sequence is {@code null}.
   * @throws IllegalArgumentException if the given sequence is empty.
   * @throws AssertionError if the given array does not contain the given sequence of objects.
   */
  public void assertContainSequence(AssertionInfo info, Object[] actual, Object[] sequence) {
    arrays.assertContainsSequence(info, failures, actual, sequence);
  }

  /**
   * Asserts that the given array does not contain the given values.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @param values the values that are expected not to be in the given array.
   * @throws NullPointerException if the array of values is {@code null}.
   * @throws IllegalArgumentException if the array of values is empty.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the given array contains any of given values.
   */
  public void assertDoesNotContain(AssertionInfo info, Object[] actual, Object[] values) {
    arrays.assertDoesNotContain(info, failures, actual, values);
  }

  /**
   * Asserts that the given array does not have duplicate values.
   * @param info contains information about the assertion.
   * @param actual the given array.
   * @throws NullPointerException if the array of values is {@code null}.
   * @throws IllegalArgumentException if the array of values is empty.
   * @throws AssertionError if the given array is {@code null}.
   * @throws AssertionError if the given array contains duplicate values.
   */
  public void assertDoesNotHaveDuplicates(AssertionInfo info, Object[] actual) {
    arrays.assertDoesNotHaveDuplicates(info, failures, actual);
  }
}
