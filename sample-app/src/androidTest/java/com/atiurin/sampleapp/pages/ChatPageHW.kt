package com.atiurin.sampleapp.pages
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matchers.allOf

object ChatPageHW {
    val messageInput = onView(withId(R.id.message_input_text))
    val sendButton = onView(withId(R.id.send_button))
    val chatHeader = onView(withId(R.id.toolbar_title))
    val toolbar = onView(withId(R.id.toolbar))
    val sentMessage = { text: String ->
        onView(allOf(
            withId(R.id.message_text),
            withText(text)
        ))
    }
    val clearButton = onView(withText("Clear history"))
}
