package com.example.assignment1

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

/**
MinimumWindowSubstring Test Cases

    1. testMinimumWindowSubstring_BothStringsEmpty:
    - Description: Test when both input strings are empty.
    - Input: s = "", t = ""
    - Expected Output: ""

    2. testMinimumWindowSubstring_NoMatchingCharacters:
    - Description: Test when the input string does not contain characters from the target string.
    - Input: s = "ADOBECODEBANC", t = "XYZ"
    - Expected Output: ""

    3. testMinimumWindowSubstring_MultipleValidWindows:
    - Description: Test when the input string contains multiple valid windows.
    - Input: s = "ADOBECODEBANC", t = "AB"
    - Expected Output: "BA"

    4. testMinimumWindowSubstring_TargetSameAsInput:
    - Description: Test when the target string is the same as the input string.
    - Input: s = "ABCD", t = "ABCD"
    - Expected Output: "ABCD"

    5. testMinimumWindowSubstring_TargetWithDuplicateCharacters:
    - Description: Test when the target string contains duplicate characters.
    - Input: s = "ADOBECODEBANC", t = "ABC"
    - Expected Output: "BANC"
*/

@RunWith(MockitoJUnitRunner::class)
class MinimumWindowSubstringTest{
    @Mock
    private lateinit var minWindowSubstring: MinimumWindowSubstringInterface

    @Before
    fun setup() {
        minWindowSubstring = MinimumWindowSubstring()
    }

    /**
     * Test case: Both input strings are empty.
     * Expected output: Empty string should be returned.
     */
    @Test
    fun testMinimumWindowSubstring_BothStringsEmpty() {
        val s = ""
        val t = ""
        val expected = ""
        val actual = minWindowSubstring.minWindow(s, t)
        assertEquals(expected, actual)
    }

    /**
     * Test case: The input string does not contain characters from the target string.
     * Expected output: Empty string should be returned.
     */
    @Test
    fun testMinimumWindowSubstring_NoMatchingCharacters() {
        val s = "ADOBECODEBANC"
        val t = "XYZ"
        val expected = ""
        val actual = minWindowSubstring.minWindow(s, t)
        assertEquals(expected, actual)
    }

    /**
     * Test case: The input string contains multiple valid windows.
     * Expected output: The minimum window string should be returned.
     */
    @Test
    fun testMinimumWindowSubstring_MultipleValidWindows() {
        val s = "ADOBECODEBANC"
        val t = "AB"
        val expected = "BA"
        val actual = minWindowSubstring.minWindow(s, t)
        assertEquals(expected, actual)
    }

    /**
     * Test case: The target string is the same as the input string.
     * Expected output: The input string should be returned.
     */
    @Test
    fun testMinimumWindowSubstring_TargetSameAsInput() {
        val s = "ABCD"
        val t = "ABCD"
        val expected = "ABCD"
        val actual = minWindowSubstring.minWindow(s, t)
        assertEquals(expected, actual)
    }

    /**
     * Test case: The target string contains duplicate characters.
     * Expected output: The minimum window string should be returned.
     */
    @Test
    fun testMinimumWindowSubstring_TargetWithDuplicateCharacters() {
        val s = "ADOBECODEBANC"
        val t = "ABC"
        val expected = "BANC"
        val actual = minWindowSubstring.minWindow(s, t)
        assertEquals(expected, actual)
    }
}