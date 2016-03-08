package com.creativecapsule.testjunitproject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Rule;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.support.test.rule.ActivityTestRule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;

import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;

import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isSelected;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.ViewAssertion.*;


import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by Tushar Vengurlekar
 * Created on 2/28/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HelloWorldEspressoTest  {

//    @Before
//    public void setUp() throws Exception {
//        Intents.init();
//    }
     Context targetContext;
    @Rule
    public final ActivityTestRule rule =
            new ActivityTestRule<>(MainActivity.class);

//    @Rule
//    public IntentsTestRule<MainActivity> mActivityRule = new IntentsTestRule<>(MainActivity.class);





    /*  @Test
    public void checkIfTextExist() {


        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }*/




    @Test
    public void checkButtonClick() {
        Intents.init();
        onView(withId(R.id.submitButton)).perform(click());
        intending(hasComponent(LandActivity.class.getName()));

    }

    @Test
    public void checkIfControllsNotEmpty(){

        onView(withId(R.id.sendText)).check(matches(notNullValue()));
        onView(withId(R.id.spinner)).check(matches(notNullValue()));
        onView(withId(R.id.radioGroup)).check(matches(notNullValue()));
        onView(withId(R.id.submitButton)).check(matches(notNullValue()));

        onView(withId(R.id.spinner)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("A"))).perform(click());
        onView(withId(R.id.spinner)).check(matches(withSpinnerText(containsString("A"))));


        onView(withId(R.id.sendText)).perform(typeText("John"));


        onView(withId(R.id.radioBtn1))
                .perform(click());

        onView(withId(R.id.radioBtn1))
                .check(matches(isChecked()));

        onView(withId(R.id.radioBtn2))
                .check(matches(not(isChecked())));




    }


    @Test
    public  void checkSecondActivity(){

        onView(withId(R.id.submitButton)).check(matches(notNullValue()));
        onView(withId(R.id.submitButton)).check(matches(withText("submit")));
        onView(withId(R.id.submitButton)).perform(click());

        onView(withId(R.id.displaytext))
                .check(matches(withText(("Test"))));

        pressBack();
        onView(withId(R.id.submitButton))
                .check(matches(withText(("submit"))));


    }

}
