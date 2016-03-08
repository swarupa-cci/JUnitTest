package com.creativecapsule.testjunitproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import org.junit.Test;

import com.orm.SugarContext;

import junit.framework.TestCase;


import org.junit.Rule;

/**
 * Created by swarupa on 02/03/16.
 */
public class TestData extends TestCase {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class, true, false);

    Context targetContext;
    @Override
    protected void setUp() throws Exception {
        super.setUp();



        targetContext   = InstrumentationRegistry.getInstrumentation()
                .getTargetContext();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();

    }

  /*  @Test
    public void someTest() {

        Intent intent = new Intent(targetContext, MainActivity.class);


        mActivityRule.launchActivity(intent);



    }*/

  /*  @Test
    public void testInsert(){
        SugarContext.init(targetContext);
        com.creativecapsule.testjunitproject.Test x = new com.creativecapsule.testjunitproject.Test();
        x.text = "A";
        x.spinnerValue = "B";
        x.save();
        SugarContext.terminate();

    }*/

    @Test
    public void testInsertedData(){
        SugarContext.init(targetContext);
        com.creativecapsule.testjunitproject.Test x = com.creativecapsule.testjunitproject.Test.findById(com.creativecapsule.testjunitproject.Test.class,1);
         x.spinnerValue.toString().isEmpty();
        SugarContext.terminate();

    }
}
