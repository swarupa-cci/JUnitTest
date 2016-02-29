package com.creativecapsule.testjunitproject;

/**
 * Created by swarupa on 29/02/16.
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value=Suite.class)
@SuiteClasses(value={TestIntent.class})
public class AllTests {

}