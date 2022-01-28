package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    /**
     * Open browser test
     */
    @Test
    public void edgeSession() {
      EdgeOptions options = new EdgeOptions();
      WebDriver driver = new EdgeDriver(options);

      driver.quit();
    }
}
