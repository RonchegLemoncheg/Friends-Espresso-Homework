package com.atiurin.sampleapp.tests.espresso

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Constants
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
    fun messageEmetTest() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat(Constants.CHAT_EMMET_BROWN)
        }
        with(ChatStepsHW()) {
            verifyChatOpened(Constants.CHAT_EMMET_BROWN)
            sendMessageToFriend(Constants.MESSAGE_DRINK)
            verifyMessageSent(Constants.MESSAGE_DRINK)
        }
    }

    @Test
    fun messageFriendAndClearTest() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat(Constants.CHAT_FRIEND_17)
        }
        with(ChatStepsHW()) {
            verifyChatOpened(Constants.CHAT_FRIEND_17)
            clearHistory()
            sendMessageToFriend(Constants.MESSAGE_NAME_CHANGE)
            verifyMessageSent(Constants.MESSAGE_NAME_CHANGE)
        }
    }

    @Test
    fun friendNotFoundTest() {
        with(DashboardStepsHW()) {
            verifyDashboardLoaded()
            selectChat(Constants.CHAT_FRIEND_25)
        }
        with(ChatStepsHW()) {
            verifyChatOpened(Constants.CHAT_FRIEND_25)
            sendMessageToFriend(Constants.MESSAGE_HERO)
            verifyMessageSent(Constants.MESSAGE_HERO)
        }
    }
}
