package com.atiurin.sampleapp.steps

import android.widget.Scroller
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.Swiper
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.action.ViewActions.swipeDown
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.DashboardPageHW
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.clickCenterLeft
import com.atiurin.ultron.extensions.isDisplayed

class DashboardStepsHW {
    fun verifyDashboardLoaded() {
        with(DashboardPageHW) {
            chatList.check(matches(isDisplayed()))
            toolbar.check(matches(isDisplayed()))
        }
    }

    fun selectChat(name: String) {
        with(DashboardPageHW) {
            for (attempt in 1..8) {
                try {
                    chatItem(name).check(matches(isDisplayed())).perform(click())
                    return
                } catch (e: Exception) {
                    if (attempt == 8) {
                        throw RuntimeException("Chat with name '$name' not found after 8 scroll attempts.")
                    }
                    swiper(320, 210, 2)
                }
            }
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
