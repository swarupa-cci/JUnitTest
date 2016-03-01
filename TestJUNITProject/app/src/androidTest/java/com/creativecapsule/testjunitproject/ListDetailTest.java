package com.creativecapsule.testjunitproject;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.creativecapsule.testjunitproject.EspressoTestsMatchers.withDrawable;

/**
 * Created by swarupa on 01/03/16.
 */
@RunWith(AndroidJUnit4.class)
public class ListDetailTest {
    @Rule
    public final ActivityTestRule rule =
            new ActivityTestRule<>(ListDetailActivity.class);



    @Test
    public void checkIfImageExist(){
        onView(withId(R.id.imageView)).check(matches(withDrawable(R.drawable.x)));

    }
}
