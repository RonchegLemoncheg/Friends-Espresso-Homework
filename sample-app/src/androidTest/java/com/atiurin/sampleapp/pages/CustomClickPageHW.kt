package com.atiurin.sampleapp.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import com.atiurin.sampleapp.R

object CustomClicksPageHW {
    val frameLayout = onView(withId(R.id.frameLayout))
    val circleTopLeft = onView(withId(R.id.rB_top_left))
    val circleTopCenter = onView(withId(R.id.rB_top_center))
    val circleTopRight = onView(withId(R.id.rB_top_right))
    val circleCenterLeft = onView(withId(R.id.rB_center_left))
    val circleCenterRight = onView(withId(R.id.rB_center_right))
    val circleBottomCenter = onView(withId(R.id.rB_bottom_center))
    val circleBottomLeft = onView(withId(R.id.rB_bottom_left))
    val circleBottomRight = onView(withId(R.id.rB_bottom_right))
}

