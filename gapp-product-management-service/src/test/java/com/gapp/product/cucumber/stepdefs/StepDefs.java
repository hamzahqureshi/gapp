package com.gapp.product.cucumber.stepdefs;

import com.gapp.product.GappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
