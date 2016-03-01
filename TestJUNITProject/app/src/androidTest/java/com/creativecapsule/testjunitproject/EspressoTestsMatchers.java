package com.creativecapsule.testjunitproject;


import android.view.View;

import com.creativecapsule.testjunitproject.DrawableMatcher;

import org.hamcrest.Matcher;

/**
 * Created by swarupa on 01/03/16.
 */
public class EspressoTestsMatchers {

    public static Matcher<View> withDrawable(final int resourceId) {
        return new DrawableMatcher(resourceId);
    }

    public static Matcher<View> noDrawable() {
        return new DrawableMatcher(-1);
    }
}
