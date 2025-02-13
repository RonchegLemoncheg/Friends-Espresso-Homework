package com.atiurin.sampleapp.tests.espresso
import androidx.test.rule.ActivityTestRule

import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.DashboardStepsHW
import com.atiurin.sampleapp.steps.ChatStepsHW
import com.atiurin.sampleapp.steps.CustomClickStepsHW

import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Test

class GreetingTests : BaseTest() {

    private val activityTestRule = ActivityTestRule(MainActivity::class.java)

    init {
        ruleSequence.addLast(activityTestRule)
    }

    @Test
    fun test() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat("Chandler Bing")
        }
        with(ChatStepsHW()) {
            verifyChatOpened("Chandler Bing")
            sendMessageToFriend("Wazzap")
            verifyMessageSent("Wazzap")
        }
    }

    @Test
    fun test2() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            openBurgerMenu()
            selectCustomClicksOption()
        }
        with(CustomClickStepsHW()) {
            verifyCustomClicksPageOpened()
            markAllCircles()
            validateAllCirclesMarked()
        }
    }

}