package com.atiurin.sampleapp.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.allOf
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R


object DashboardPageHW {
    val chatList = onView(withId(R.id.recycler_friends))

    val chatItem = { name: String ->
        onView(allOf(
            withId(R.id.tv_name),
            withText(name)
        ))
    }
    val toolbar = onView(withId(R.id.toolbar))
    val customClicksOption = onView(allOf(
        withId(R.id.design_menu_item_text),
        withText("Custom Clicks")
    ))

}