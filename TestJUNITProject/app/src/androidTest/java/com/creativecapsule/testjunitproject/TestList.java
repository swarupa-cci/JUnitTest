package com.creativecapsule.testjunitproject;

import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

/**
 * Created by swarupa on 29/02/16.
 */
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@RunWith(AndroidJUnit4.class)
public class TestList {

    @Rule
    public IntentsTestRule<ListActivity> mActivityRule = new IntentsTestRule<>(ListActivity.class);

    @Test
    public void checkListItemClick(){


        onData(allOf(is(instanceOf(String.class)), is("1"))) // Use Hamcrest matchers to match item
                .inAdapterView(withId(R.id.listView)) // Specify the explicit id of the ListView
                .perform(click());
    }

    @Test
    public void clickOnItemWithTextEqualToTwo() {
        // Directly specify the position in the adapter to click on
        onData(anything()) // We are using the position so don't need to specify a data matcher
                .inAdapterView(withId(R.id.listView)) // Specify the explicit id of the ListView
                .atPosition(1) // Explicitly specify the adapter item to use
                .perform(click()); // Standard ViewAction
        intended(allOf(
                hasComponent("com.creativecapsule.testjunitproject.ListDetailActivity")
        ));

    }


}
