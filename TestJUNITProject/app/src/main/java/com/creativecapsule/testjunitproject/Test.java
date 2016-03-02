package com.creativecapsule.testjunitproject;

import com.orm.SugarRecord;

/**
 * Created by swarupa on 02/03/16.
 */
public class Test extends SugarRecord{
    String text;
    String spinnerValue;
    public Test(){

    }

    public Test(String text, String spinnerValue){
        this.spinnerValue = spinnerValue;
        this.text = text;
    }
}
