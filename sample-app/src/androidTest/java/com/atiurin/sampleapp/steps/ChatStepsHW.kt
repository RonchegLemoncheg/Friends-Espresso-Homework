package com.atiurin.sampleapp.steps


import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.ChatPageHW
import com.atiurin.ultron.extensions.clickCenterRight

class ChatStepsHW {
    fun verifyChatOpened(name: String) {
        with(ChatPageHW) {
            chatHeader.check(matches(withText(name)))
        }
    }

    fun sendMessageToFriend(message: String) {
        with(ChatPageHW) {
            messageInput.perform(typeText(message), closeSoftKeyboard())
            sendButton.perform(click())
        }
    }

    fun verifyMessageSent(message: String) {
        with(ChatPageHW) {
            sentMessage(message).check(matches(isDisplayed()))
        }
    }

    fun clearHistory() {
        with(ChatPageHW) {
            toolbar.clickCenterRight()
            clearButton.check(matches(isDisplayed()))
                .perform(click())
        }
    }
}
