package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.isNotChecked
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.DashboardPageHW
import com.atiurin.sampleapp.pages.UIElementsPageHW
import com.atiurin.ultron.extensions.click
import org.hamcrest.Matchers.containsString
import org.junit.Assert

class UIElementsStepsHW {
    fun verifyUIElementsPageLoaded() {
        with(UIElementsPageHW) {
            enableButton.check(matches(isDisplayed()))
            clickableButton.check(matches(isDisplayed()))
            Assert.assertTrue(onView(webviewTitle).check(matches(isDisplayed())) != null)
            Assert.assertTrue(onView(toggleInvisible).check(matches(isDisplayed())) != null)
        }

    }

    fun toggleEnableButton() {
        with(UIElementsPageHW) {
            enableButton.click()
        }
    }

    fun toggleClickableButton() {
        with(UIElementsPageHW) {
            clickableButton.click()
        }
    }

    fun validateEnableButtonUnchecked() {
        with(UIElementsPageHW) {
            enableButton.check(matches(isNotChecked()))
        }
    }

    fun validateClickableButtonUnchecked() {
        with(UIElementsPageHW) {
            clickableButton.check(matches(isNotChecked()))
        }
    }

    fun toggleInvisibleButton() {
        with(UIElementsPageHW) {
            toggleInvisible.click()
        }
    }

    fun validateSimpleButtonGone() {
        with(UIElementsPageHW) {
            simpleButton.matches(withEffectiveVisibility(ViewMatchers.Visibility.GONE))
        }
    }

    fun validateSimpleButtonInvisible() {
        with(UIElementsPageHW) {
            simpleButton.matches(withEffectiveVisibility(ViewMatchers.Visibility.INVISIBLE))
        }
    }

    fun clickButtonMultipleTimes(amount: Int) {
        with(UIElementsPageHW) {
            repeat(amount) {
                simpleButton.click()
            }
        }
    }

    fun verifySimpleButtonCounter(amount: Int) {
        with(UIElementsPageHW) {
            clickCounter.check(matches(withText(containsString(amount.toString()))))
        }
    }

    fun toggleGoneButton() {
        with(UIElementsPageHW) {
            goneButton.click()
        }
    }

}