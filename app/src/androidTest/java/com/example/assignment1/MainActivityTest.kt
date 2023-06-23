package com.example.assignment1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /**
     * Test case to verify that clicking the button with valid inputs displays the expected output.
     */
    @Test
    fun testButtonClick_WithValidInputs_DisplayOutput() {
        val inputS = "ADOBECODEBANC"
        val inputT = "ABC"
        val expectedOutput = "BANC"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

        // Find the input field by resource ID and set the text
        val inputSField = device.findObject(By.res("com.example.assignment1:id/inputSField"))
        inputSField.text = inputS

        val inputTField = device.findObject(By.res("com.example.assignment1:id/inputTField"))
        inputTField.text = inputT

        // Click the button
        val button = device.findObject(By.res("com.example.assignment1:id/button"))
        button.click()

        // Find the output field by resource ID and get the text
        val outputField = device.findObject(By.res("com.example.assignment1:id/output"))
        val actualOutput = outputField.text

        // Perform assertion on the output
        assertEquals(expectedOutput, actualOutput)
    }

    /**
     * Test case to verify that clicking the button with no inputs displays no output.
     */
    @Test
    fun testButtonClick_WithNoInputs_DisplayNoOutput() {
        val inputS = ""
        val inputT = ""
        val expectedOutput = "[No Output]"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

        // Find the input field by resource ID and set the text
        val inputSField = device.findObject(By.res("com.example.assignment1:id/inputSField"))
        inputSField.text = inputS

        val inputTField = device.findObject(By.res("com.example.assignment1:id/inputTField"))
        inputTField.text = inputT

        // Click the button
        val button = device.findObject(By.res("com.example.assignment1:id/button"))
        button.click()

        // Find the output field by resource ID and get the text
        val outputField = device.findObject(By.res("com.example.assignment1:id/output"))
        val actualOutput = outputField.text

        // Perform assertion on the output
        assertEquals(expectedOutput, actualOutput)
    }
}
