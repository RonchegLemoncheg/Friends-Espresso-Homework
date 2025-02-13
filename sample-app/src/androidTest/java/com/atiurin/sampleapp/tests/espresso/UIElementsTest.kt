package com.atiurin.sampleapp.tests.espresso
import androidx.test.rule.ActivityTestRule

import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.DashboardStepsHW
import com.atiurin.sampleapp.steps.ChatStepsHW
import com.atiurin.sampleapp.steps.CustomClickStepsHW
import com.atiurin.sampleapp.steps.UIElementsStepsHW

import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Test

class UIElementsTest : BaseTest() {

    private val activityTestRule = ActivityTestRule(MainActivity::class.java)

    init {
        ruleSequence.addLast(activityTestRule)
    }

    @Test
    fun test() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            openBurgerMenu()
            selectUIElementsOption()
        }
        with(UIElementsStepsHW()) {
            verifyUIElementsPageLoaded()
            toggleEnableButton()
            toggleClickableButton()
            validateEnableButtonUnchecked()
            validateClickableButtonUnchecked()
            toggleInvisibleButton()
            validateSimpleButtonInvisible()
        }
    }


    @Test
    fun test2(){
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            openBurgerMenu()
            selectUIElementsOption()
        }
        with(UIElementsStepsHW()) {
            verifyUIElementsPageLoaded()
            clickButtonMultipleTimes(8)
            verifySimpleButtonCounter(8)
            toggleGoneButton()
            validateSimpleButtonGone()
        }
    }

}