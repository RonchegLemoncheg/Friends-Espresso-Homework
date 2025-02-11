package com.atiurin.sampleapp.steps

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.atiurin.sampleapp.pages.CustomClicksPageHW

class CustomClickStepsHW {
    fun verifyCustomClicksPageOpened() {
        with(CustomClicksPageHW.frameLayout) {
            check(matches(isDisplayed()))
        }
    }

    fun markAllCircles() {
        with(CustomClicksPageHW) {
            circleTopLeft.perform(click())
            circleTopCenter.perform(click())
            circleTopRight.perform(click())
            circleCenterLeft.perform(click())
            circleCenterRight.perform(click())
            circleBottomCenter.perform(click())
            circleBottomLeft.perform(click())
            circleBottomRight.perform(click())
        }
    }

    fun validateAllCirclesMarked() {
        with(CustomClicksPageHW) {
            circleTopLeft.check(matches(isChecked()))
            circleTopCenter.check(matches(isChecked()))
            circleTopRight.check(matches(isChecked()))
            circleCenterLeft.check(matches(isChecked()))
            circleCenterRight.check(matches(isChecked()))
            circleBottomCenter.check(matches(isChecked()))
            circleBottomLeft.check(matches(isChecked()))
            circleBottomRight.check(matches(isChecked()))
        }
    }
}