package com.javarush.maven;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class MainControllerTest {

    @Test
    public void getMain() {
        String mainPage = MainController.getMain();
        Assertions.assertEquals("index", mainPage);
    }
}