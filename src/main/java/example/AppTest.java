package com.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    
    public void testGetMessage() {
        App app = new App();
        assertEquals("Hello World from Maven!", app.getMessage());
    }
}