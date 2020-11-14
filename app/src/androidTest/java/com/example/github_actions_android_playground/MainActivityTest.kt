package com.example.github_actions_android_playground

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun before() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun test() {
        onView(withId(R.id.textview_hello_world)).check(matches(isDisplayed()))
    }
}
