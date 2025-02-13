package com.atiurin.sampleapp.tests.espresso

import androidx.test.rule.ActivityTestRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.ChatStepsHW
import com.atiurin.sampleapp.steps.DashboardStepsHW
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Test

class ILoveMyfrindsTest : BaseTest() {

    private val activityTestRule = ActivityTestRule(MainActivity::class.java)

    init {
        ruleSequence.addLast(activityTestRule)
    }

    @Test
    fun test() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat("Emmet Brown")
        }
        with(ChatStepsHW()) {
            verifyChatOpened("Emmet Brown")
            sendMessageToFriend("let's go for a drink")
            verifyMessageSent("let's go for a drink")
        }
    }

    @Test
    fun test2() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat("Friend17")
        }
        with(ChatStepsHW()) {
            verifyChatOpened("Friend17")
            clearHistory()
            sendMessageToFriend("please change your name")
            verifyMessageSent("please change your name")
        }
    }

    @Test
    fun test3() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat("Friend25")
        }
        with(ChatStepsHW()) {
            verifyChatOpened("Friend25")
            sendMessageToFriend("you are my hero")
            verifyMessageSent("you are my hero")
        }
    }
}
