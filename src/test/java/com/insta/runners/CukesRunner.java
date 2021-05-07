package com.insta.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/insta/step_definitions",
        dryRun = true,
        tags = ""
)
public class CukesRunner {

        public static void main(){
                System.out.println("Here");

                CukesRunner r = new CukesRunner();
        }
}
