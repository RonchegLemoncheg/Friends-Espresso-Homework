package com.atiurin.sampleapp.steps

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.DashboardPageHW
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.clickCenterLeft

class DashboardStepsHW {
    fun verifyDashboardLoaded() {
        with(DashboardPageHW) {
            chatList.check(matches(isDisplayed()))
            toolbar.check(matches(isDisplayed()))
        }
    }

    fun selectChat(name: String) {
        with(DashboardPageHW) {
            chatItem(name).click()
        }
    }

    fun openBurgerMenu() {
        with(DashboardPageHW) {
            toolbar.clickCenterLeft()
        }
    }

    fun selectCustomClicksOption() {
        with(DashboardPageHW) {
            customClicksOption.perform(click())
        }
    }

    fun selectUIElementsOption() {
        with(DashboardPageHW) {
            UIElementsOption.perform(click())
        }
    }
}
