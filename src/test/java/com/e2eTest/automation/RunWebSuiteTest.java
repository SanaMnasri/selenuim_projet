package com.e2eTest.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * The Test Runner File uses the @RunWith() Annotation from JUnit for executing
 * tests.
 */
@RunWith(Cucumber.class)
/**
 * The @CucumberOptions Annotation is used to define to location of feature
 * files, step definitions, reporting integration
 */
@CucumberOptions(features = {"src/specs/features" }, plugin = { "pretty",
		"html: target/cucumber_report.html" }, tags = (" @login_cas_passant"),
		// glue{},
		monochrome = true, snippets = SnippetType.CAMELCASE

)
/**
 * This class is used to run the test, which is JUnit Test Runner Class
 * containing the Step Definition location and the other primary metadata
 * required to run the test.
 */
public class RunWebSuiteTest {

}
