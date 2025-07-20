package com.example;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {
    
    @Test
    public void testApp() {
        App app = new App();
        String result = app.getMessage();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("Hello"));
    }
}