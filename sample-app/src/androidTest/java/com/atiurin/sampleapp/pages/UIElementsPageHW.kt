package com.atiurin.sampleapp.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.containsString

object UIElementsPageHW {
    val enableButton = onView(
        allOf(
            withId(R.id.checkbox_enable),
            withText("Enable button")
        )
    )

    val clickableButton = onView(
        allOf(
            withId(R.id.checkbox_clickable),
            withText("Clickable button")
        )
    )

    val webviewTitle = withId(R.id.webview)

    val simpleButton = withId(R.id.button1)

    val toggleInvisible = withId(R.id.radio_invisible)

    val clickCounter = onView(
        allOf(
            withId(R.id.last_event_status),
            withText(containsString("Click"))
        )
    )

    val goneButton = withId(R.id.radio_gone)

}