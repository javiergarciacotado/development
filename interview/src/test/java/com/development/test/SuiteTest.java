package com.development.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.development.test.cucumber.CucumberTest;
import com.development.test.junit.AssertTest;

@RunWith(Suite.class)
@SuiteClasses({ AssertTest.class, CucumberTest.class})
public class SuiteTest {

}
