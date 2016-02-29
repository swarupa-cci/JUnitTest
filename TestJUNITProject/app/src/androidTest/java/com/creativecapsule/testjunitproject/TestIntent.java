package com.creativecapsule.testjunitproject;

/**
 * Created by swarupa on 29/02/16.
 */
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtraWithKey;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsInstanceOf.*;

@RunWith(AndroidJUnit4.class)
public class TestIntent {

    @Rule
    public IntentsTestRule<LandActivity> mActivityRule = new IntentsTestRule<>(LandActivity.class);
   // public IntentsTestRule<MainActivity> mActivityRule = new IntentsTestRule<>(MainActivity.class);

 /*   @Test
    public void triggerIntentTest() {
        // check that the button is there
        onView(withId(R.id.submitButton)).check(matches(notNullValue()));
        onView(withId(R.id.submitButton)).check(matches(withText("submit")));
        onView(withId(R.id.submitButton)).perform(click());

        intended(allOf(
                hasComponent("com.creativecapsule.testjunitproject.LandActivity"),
                hasExtraWithKey("value")));



    }*/


 @Test
  public void checkButtonClick(){
      onView(withId(R.id.listButton)).check(matches(notNullValue()));
      onView(withId(R.id.listButton)).perform(click());
      intended(allOf(
              hasComponent("com.creativecapsule.testjunitproject.ListActivity")
      ));
  }







}
